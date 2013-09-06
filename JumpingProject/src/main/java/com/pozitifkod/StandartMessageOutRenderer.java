package com.pozitifkod;

public class StandartMessageOutRenderer implements MessageRenderer{
	private MessageProvider messageProvider = null;
	
	@Override
	public void render() {
		if(messageProvider == null){
			throw new RuntimeException("You must set the property messageProvider of class: " + StandartMessageOutRenderer.class.getCanonicalName());
		}
		System.out.println(messageProvider.getMessage());
	}

	public MessageProvider getMessageProvider() {
		return messageProvider;
	}

	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;
	}
}
