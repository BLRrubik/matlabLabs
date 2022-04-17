package ru.rubik.matlabweb.services;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
@Service
public class Lab4Service {
    public void initLab() throws IOException, InterruptedException {

        Process proc = Runtime.getRuntime().exec(
                "D:\\Programms\\Matlab\\bin\\matlab.exe " +
                        "-batch " +
                        "\"run(" +
                        "'D:\\Programming\\Java\\matlabWeb\\src\\main\\java\\ru\\rubik\\matlabweb\\matlab\\lab4\\main.m'" +
                        ");" +
                        " if " +
                        "~isempty(groot().Children) " +
                        "uiwait; " +
                        "end;\"");

        TimeUnit.SECONDS.sleep(25);
    }
}
