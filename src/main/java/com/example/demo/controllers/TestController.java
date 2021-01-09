package com.example.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "Test Dima";
    }

    @GetMapping("/hi")
    public String hi(){ return "<h1 style='color: red'>Dima pidor</h1>"; }

    @PutMapping("/file")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveFile(@RequestBody byte[] fileContent){
        try {

            Path filePath = Files.createTempFile("putted-file", null);
            Files.write(filePath, fileContent);

            System.out.println(new String(Files.readAllBytes(filePath)));
        }  catch (IOException e) {
            e.printStackTrace();
        }


    }


}
