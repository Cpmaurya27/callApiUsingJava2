package com.example.callApiAssignment2;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class CallApi2 {

        public static void main(String[] args) throws IOException, InterruptedException {

            String url = "https://api.zippopotam.us/us/33162";

            HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();

            HttpClient httpClient = HttpClient.newBuilder().build();


            HttpResponse<String> httpResponse = httpClient.send(request,HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));

            System.out.println(httpResponse.statusCode());
            System.out.println(httpResponse.body());

    }
}