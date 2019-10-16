package com.company.HW22String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.company.zTools.Readers.stringReader;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please input are sentence:");
        String text = stringReader();
        Pattern pattern = Pattern.compile("\\s+");
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.replaceAll(" "));

    }

}





