package main;
import java.net.*;
import java.io.*;

public class Main {
        public static void main(String[] args) {
            try {
                URL url = new URL("https://www.w3schools.com/js/json_demo_array.txt");
                URLConnection urlConnection = url.openConnection();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                String urlString;
                while((urlString = bufferedReader.readLine()) != null) {
                    System.out.println(urlString);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
