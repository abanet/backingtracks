package com.backingtrackstoimprovise.servicios;


import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class APIYoutubeServiceImpl implements APIYoutubeService {
    private static final String API_KEY = "AIzaSyAxrBYsaOnKQ4ULUPCXO8MOQ-vTRM6wF9c";
    private static final String YOUTUBE_VIDEO_INFO_URL =
            "https://www.googleapis.com/youtube/v3/videos?id=%s&part=snippet,contentDetails,statistics&key=%s";

    public String getVideoDetails(String videoId) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(String.format(YOUTUBE_VIDEO_INFO_URL, videoId, API_KEY)))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
