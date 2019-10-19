package com.company.DEMO02;

import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Deserialization {

    private static String fileNameXML = "Serialize_ArrayListPerson_" + LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")) + ".xml"; ////move to helpers

    protected static ArrayList<Person> deserializeArrayListPersonFromXML() throws IOException {
        FileInputStream fis = new FileInputStream(fileNameXML);
        XMLDecoder decoder = new XMLDecoder(fis);
        ArrayList<Person> decodedArrayListPerson = (ArrayList<Person>) decoder.readObject();
        decoder.close();
        fis.close();
        return decodedArrayListPerson;
    }

}
