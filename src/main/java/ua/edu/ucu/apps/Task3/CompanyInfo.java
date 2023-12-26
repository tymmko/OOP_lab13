package ua.edu.ucu.apps.Task3;

import java.io.IOException;

public class CompanyInfo {

    private PDLReader pdlReader;
    private ChatGPT chatGPT;
    private OpenAIReader openAIReader;

    public CompanyInfo(String pdlApiKey) {
        pdlReader = new PDLReader(pdlApiKey);
        chatGPT = new ChatGPT(); 
        openAIReader = new OpenAIReader(); 
    }

    public Company getCompanyInfo(String identifier) throws IOException {
        Company company = new Company();

        Company pdlCompany = pdlReader.main(identifier);
        company.setName(pdlCompany.getName());
        company.setDescription(pdlCompany.getDescription());
        company.setLogo(pdlCompany.getLogo());


        return company;
    }
}
