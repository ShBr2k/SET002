package com.company.DEMO02;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Settings {

    protected static final String patternDate = "dd.MM.yyyy"; //move to helpers
    protected static final SimpleDateFormat dateFormat = new SimpleDateFormat(patternDate);

    protected static final String fileNameLog = "Text_ArrayListPerson_" + LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")) + ".log"; ////move to helpers
    protected static final String fileNameXML = "Serialize_ArrayListPerson_" + LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")) + ".xml"; ////move to helpers

}
