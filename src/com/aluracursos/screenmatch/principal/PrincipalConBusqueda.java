package com.aluracursos.screenmatch.principal;


import com.aluracursos.screenmatch.Exceptions.ErrorEnConversionDeDuracionMinutosException;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Titulo;
import com.aluracursos.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.IllegalFormatException;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        try {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Escribe el nombre de una pelicula:");
            var busqueda = teclado.nextLine();
            String apikey="a6d95720";
            String nombrePelicula = URLEncoder.encode(busqueda, StandardCharsets.UTF_8.toString());
            String direccion = "https://www.omdbapi.com/?t="+nombrePelicula+"&apikey="+apikey;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.statusCode());
            String json = response.body();
            System.out.println(json);
            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
            TituloOmdb tituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(tituloOmdb.toString());
            Titulo titulo = new Titulo(tituloOmdb);
            System.out.println(titulo.toString());
            FileWriter escritura = new FileWriter("Peliculas.txt",true);
            escritura.write(titulo.toString()+"\n");
            escritura.close();
        }catch (NumberFormatException e){
            System.out.println("Ocurrio un error:");
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println("Verifique la URI");
        }catch (ErrorEnConversionDeDuracionMinutosException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Ocurrio una excepcion inesperada: "+e.getMessage());
        }
        System.out.println("Finalizo la ejecución del Programa");
    }
}
