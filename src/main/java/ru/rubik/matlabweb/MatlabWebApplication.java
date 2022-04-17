package ru.rubik.matlabweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.rubik.matlabweb.services.FileService;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class MatlabWebApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(MatlabWebApplication.class, args);
    }

}
