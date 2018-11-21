package com.asoinspiration.test;

import java.util.Properties;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

import org.junit.Test;

import com.asoinspiration.utils.MailUtil;


public class MailTest {

	@Test
	public void sendMail() throws Exception{
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.163.com");
		props.put("mail.smtp.auth", "true");
		Session session = Session.getInstance(props);
		session.setDebug(true);
		
		//准备邮件
		MimeMessage message = new MimeMessage(session);
		
		//发件人
		InternetAddress address = new InternetAddress("13660274258@163.com");
		message.setFrom(address);
		//收件人
		InternetAddress toAddr = new InternetAddress("13660274258@163.com");
		message.setRecipient(RecipientType.TO, toAddr);

		//主题
		message.setSubject("aaaaaaaaaaaaaa");
		//内容
		message.setText("bbbbbbbbbbbbbbbb");
		
		Transport transport = session.getTransport("smtp");
		transport.connect("smtp.163.com", "13660274258@163.com","wsx03270433");
		transport.sendMessage(message, message.getAllRecipients());
		transport.close();
	}
	
	@Test
	public void send(){
		MailUtil mailUtil = new MailUtil();
		try {
			mailUtil.sendMsg("13660274258@163.com", "hao", "test");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
