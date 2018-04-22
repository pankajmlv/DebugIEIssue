package com.test.preview.logo.DebugIEIssue;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/hello")
    @ResponseBody
    String getHelloe(){
        return "hello";
    }

    @GetMapping("/image")
    @ResponseBody
    public ResponseEntity<byte []> getImage() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        Path file = new File(classLoader.getResource("static/abc.png").getFile()).toPath();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type","image/png");
        ResponseEntity<byte []> response=new ResponseEntity<>(Files.readAllBytes(file),headers, HttpStatus.CREATED);
        return response;
    }
}
