package com.codecool.app;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try{
            Table table = new Table();
            table.playGame();
        }
        catch (SAXException | IOException | ParserConfigurationException e){
            System.out.println("tutaj");
        }
    }
}