package com.company.DEMO02;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class FileWriter {

    private static String fileName = "ArrayList_" + LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")) + ".log"; ////move to helpers

    protected static boolean FileWriter2(ArrayList arrayList) {

        Person person = new Person();
        Boolean result = true;

        try (java.io.FileWriter writer = new java.io.FileWriter(fileName, true)) {
            for (int i = 0; i < arrayList.size(); i++) {
                person = (Person) arrayList.get(i);
                writer.write(person.Output(person) + "\r\n");
            }
            writer.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
            //System.out.println(ex.getMessage());
            result = false;
        }
        return result;
    }
}
