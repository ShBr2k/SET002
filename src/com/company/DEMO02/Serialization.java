package com.company.DEMO02;

import java.beans.ExceptionListener;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Serialization {

    private static String fileNameXML = "Serialization_ArrayListPerson_" + LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")) + ".xml"; ////move to helpers


    protected static void serializeArrayListPersonToXML(ArrayList<Person> arrayListPerson) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileNameXML);
        XMLEncoder encoder = new XMLEncoder(fos);
        encoder.setExceptionListener(new ExceptionListener() {
            public void exceptionThrown(Exception e) {
                System.out.println("Exception! :" + e.toString());
            }
        });
        encoder.writeObject(arrayListPerson);
        encoder.close();
        fos.close();
    }

    protected static ArrayList<Person> deserializeArrayListPersonFromXML() throws IOException {
        FileInputStream fis = new FileInputStream(fileNameXML);
        XMLDecoder decoder = new XMLDecoder(fis);
        ArrayList<Person> decodedArrayListPerson = (ArrayList<Person>) decoder.readObject();
        decoder.close();
        fis.close();
        return decodedArrayListPerson;
    }

}
