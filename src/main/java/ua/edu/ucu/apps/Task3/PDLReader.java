package ua.edu.ucu.apps.Task3;

import org.json.JSONObject;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class PDLReader {
    private final String apiKey;

    public PDLReader(String apiKey) {
        this.apiKey = apiKey;
    }
    public Company main(String domain) throws IOException {
        Company company = new Company();
        String urlString = "https://api.peopledatalabs.com/v5/company/enrich?website=" + domain;
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("X-API-KEY", apiKey);

        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            InputStream inputStream = connection.getInputStream();
            String response = new Scanner(inputStream).useDelimiter("\\A").next();
            inputStream.close();

            JSONObject jsonResponse = new JSONObject(response);
            company.setName(jsonResponse.optString("name"));
            company.setDescription(jsonResponse.optString("description"));
            company.setLogo(jsonResponse.optString("logo_url"));
        }

        connection.disconnect();
        return company;
    }
}
