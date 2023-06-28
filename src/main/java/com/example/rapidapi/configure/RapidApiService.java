package com.example.rapidapi.configure;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.stereotype.Service;

@Service
public class RapidApiService {
    private static final String RAPIDAPI_HOST = "imdb8.p.rapidapi.com";
    private static final String RAPIDAPI_KEY = "26f855ccbamsha097685c0e93011p1c0b75jsnec867037869f";

    public String makeRapidApiRequest(String query) {
        try {
            String url = "https://imdb8.p.rapidapi.com/auto-complete?q="+query;

            HttpResponse<String> response = Unirest.get(url)
                    .header("X-RapidAPI-Host", RAPIDAPI_HOST)
                    .header("X-RapidAPI-Key", RAPIDAPI_KEY)
                    .asString();
            // Process the response here
            return response.getBody();
        } catch (UnirestException e) {
            e.printStackTrace();
            return null;
        }
    }
}
