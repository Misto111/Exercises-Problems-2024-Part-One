package org.example.modelmapper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.modelmapper.entities.dtos.AddressDTO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JsonMain implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .setPrettyPrinting()
                .create();

        AddressDTO dto = new AddressDTO("Bulgaria", "Varna");

            String json = gson.toJson(dto);

            System.out.println(json);
    }
}
