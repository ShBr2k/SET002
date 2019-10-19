package com.company.DEMO02;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;


public class Convertors {

    static protected LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }
}
