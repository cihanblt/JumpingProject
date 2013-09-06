package com.pozitifkod;

public class HelloWorldDecoupled {
	public static void main(String[] args) {
		MessageRenderer mr =  MessageSupportFactory.getInstance().getMessageRenderer();
		MessageProvider mp =  MessageSupportFactory.getInstance().getMessageProvider();
		
		mr.setMessageProvider(mp);
		mr.render();
	}
}
