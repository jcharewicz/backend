package com.company;

import java.util.Date;
import java.util.TimeZone;

    public class Ex5
    {

        public String date() {
            return (new Date()).toString();
        }

        public String UTCdate() {
        Date now = new Date();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        return now.toString();
        }

        public String GMTdate() {
            Date now = new Date();
            TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
            return now.toString();
        }


    }
