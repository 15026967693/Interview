package com.jiayang.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class StringToDateConvert implements Converter<String, Date>{
def String dateformat;

def StringToDateConvert(String dateformat) {
	super();
	this.dateformat = dateformat;
}

@Override
def Date convert(String dateStr) {
	
	try {
		return new SimpleDateFormat(dateformat).parse(dateStr);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
}
	

}
