package com.company.DEMO02;


import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import static com.company.DEMO02.Settings.fileNameXML;


/**
 * The Deserialization class provide deserialization of data of XML file to
 * instances of classes Person, Student and add it to ArrayList's records.
 *
 * @author Roman Shamakhin
 * @version 0.22 26 Oct 2019
 */
public class Deserialization {

    protected static ArrayList<Person> DeserializeArrayListPersonFromXML() {
        ArrayList<Person> decodedArrayListPerson = null;

        try {
            FileInputStream fis = new FileInputStream(fileNameXML);
            XMLDecoder decoder = new XMLDecoder(fis);
            decodedArrayListPerson = (ArrayList<Person>) decoder.readObject();
            decoder.close();
            fis.close();
            System.out.println("\nDeserialization is done. Result of deserialization:");
        } catch (IOException e) {
            System.out.println("\nDeserialization is failed.\n");
            e.printStackTrace();
            System.exit(0);
        } finally {
            return decodedArrayListPerson;
        }
    }

}
