package ua.edu.ucu.apps.Task3;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class OpenAIReader {
    public static void main(String url) throws IOException {
        String API_KEY = "";
        URL urla = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) urla.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("X-Api-Key", API_KEY);
        connection.connect();
        String text = new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();
        System.out.println(text);
    }
}
