package com.challengeAlura.modelos;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SolicitudValores {

    public Conversor buscaValores(String valores) {


            URI direccion = URI.create("https://v6.exchangerate-api.com/v6/76adc2bb10f95d324d4d586e/latest/"+valores+"/");

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();
            try {
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                return new Gson().fromJson(response.body(), Conversor.class);


            }catch (Exception e){
                throw new RuntimeException("No Pude Encontrarlo");
            }


        }
    }


