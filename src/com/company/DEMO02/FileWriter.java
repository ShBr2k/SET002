package com.company.DEMO02;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class FileWriter {

    private static final String fileNameLog = "Text_ArrayListPerson_" + LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")) + ".log"; ////move to helpers

    protected static void TextArrayListPersonWriter(ArrayList arrayList) {

        try (java.io.FileWriter writer = new java.io.FileWriter(fileNameLog, true)) {

            for (int i = 0; i < arrayList.size(); i++) {
                Person person = (Person) arrayList.get(i);
                writer.write(person.Output(person) + "\r\n");
            }
            writer.flush();
            System.out.println("\nFile: " + fileNameLog + " is saved.");

        } catch (IOException e) {
            System.out.println("\nFile is not saved.\n");
            //e.getMessage();
            e.printStackTrace();
        }
    }
}
