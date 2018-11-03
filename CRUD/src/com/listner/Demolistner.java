package com.listner;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class Demolistner implements HttpSessionListener
{
	int usercount=0;
	public void sessionCreated(HttpSessionEvent arg0) {
		usercount++;
		System.out.println("total user======>"+usercount);
	}

	public void sessionDestroyed(HttpSessionEvent arg0) {
		usercount--;
		System.out.println("total user======>"+usercount);
	}

}
