package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Date> listaDat = new ArrayList<>();
        File file = new File("C:\\Users\\computer science\\Desktop\\Doccc.txt");
        try {
            Scanner scan = new Scanner(file);
            while(scan.hasNext()) {
                listaDat.add(Date.convertToDate(scan.next()));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if(listaDat.size()%2==0) {
            for (int i = 0; i < listaDat.size(); i = i + 2) {
                Date.compareDates(listaDat.get(i), listaDat.get(i + 1));

            }
        }else{
            System.out.println("No.");
        }
    }
}
