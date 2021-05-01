package com.company;

import javax.swing.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ThreadForHundred threadForHundred = new ThreadForHundred();
        threadForHundred.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadForHundred.stop();

    }
}
