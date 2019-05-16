package com.cskaoyan.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyConverter implements Converter<String[], Date> {

    @Override
    public Date convert(String[] birthdays) {
        Date birthday = null;
        try {
            birthday = getDate(birthdays[0],birthdays[1],birthdays[2]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return birthday;
    }

    private Date getDate(String birthyear, String birthmonth, String birthday) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(birthyear+"-"+birthmonth+"-"+birthday);
        return date;
    }
}
