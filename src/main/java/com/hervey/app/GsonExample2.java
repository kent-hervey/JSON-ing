package com.hervey.app;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class GsonExample2 {

    public static void main(String[] args) {

        Gson gson = new Gson();

        try (Reader reader = new FileReader("learnings.json")) {

            // Convert JSON File to Java Object
            Learning staff = gson.fromJson(reader, Learning.class);

            // print staff
            System.out.println(staff);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
