package com.asoinspiration.erp.job;

import java.text.ParseException;
import java.util.Date;

import com.asoinspiration.utils.UtilFuns;

public class TestJob {

	public void showTime() throws ParseException{
		System.out.println(UtilFuns.dateTimeFormat(new Date(),"HH:mm:ss"));
	}
}
