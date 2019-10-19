package com.company.DEMO02;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class FileWriter {

    private static String fileName = "ArrayList_" + LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")) + ".log"; ////move to helpers

    protected static void FileWriter(ArrayList arrayList) {

        try (java.io.FileWriter writer = new java.io.FileWriter(fileName, true)) {

            for (int i = 0; i < arrayList.size(); i++) {
                Person person = (Person) arrayList.get(i);
                writer.write(person.Output(person) + "\r\n");
            }
            writer.flush();
            System.out.println("\nFile: " + fileName + " is saved.");

        } catch (IOException e) {
            System.out.println("\nFile is not saved.");
            //e.getMessage();
            e.printStackTrace();
        }
    }
}
