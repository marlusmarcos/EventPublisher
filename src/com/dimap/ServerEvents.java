package com.dimap;

import java.rmi.Remote;

public interface ServerEvents extends Remote{
	
	public void add (Observer o);
	public void notificarSubscriber (String notificacao);

}
