package com.company.DEMO02;


import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import static com.company.DEMO02.Settings.fileNameLog;


/**
 * The FileWriter class provide writing files.
 *
 * @author Roman Shamakhin
 * @version 0.31 26 Oct 2019
 */
public class FileWriter {

    /* Method TextArrayListPersonWriter provide writing data with appending in text file of arrayList's records.
     * Method provide check for exception. */
    protected static void TextArrayListPersonWriter(ArrayList arrayList) {

        try (java.io.FileWriter writer = new java.io.FileWriter(fileNameLog, true)) {

            for (int i = 0; i < arrayList.size(); i++) {
                Person person = (Person) arrayList.get(i);
                writer.write(new Timestamp(System.currentTimeMillis()) + ": " + person.Output(person) + "\r\n");
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
