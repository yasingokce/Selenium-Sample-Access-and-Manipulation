package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPharser {

    public int parserForInteger(String str) {
        int flag=0;
        // Regex pattern that will find only numbers
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            flag = Integer.valueOf(matcher.group()); 
        }
        return flag;
    }
}
