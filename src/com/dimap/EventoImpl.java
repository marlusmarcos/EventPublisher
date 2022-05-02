package com.dimap;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class EventoImpl extends UnicastRemoteObject  implements Evento{
	
	private String nome;
	
	
	public EventoImpl(String nome) throws RemoteException {
		super();
		this.nome = nome;
	}

	private volatile List<Observer> observers = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(Observer ob) {
		observers.add(ob);
	}
	
	public void notificar (String m) throws RemoteException {
		for (Observer o : observers) {
			o.updateEvents(m);
		}
	}
		
}
