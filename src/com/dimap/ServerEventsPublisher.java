package com.dimap;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import com.dimap.doa.EventoDao;

public class ServerEventsPublisher extends UnicastRemoteObject implements ServerEvents{
	
	//EventoDao eventoDao = new EventoDao();//
	private volatile List<Observer> observers = new ArrayList<>();

	protected ServerEventsPublisher() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void register(Observer o) {
		observers.add(o);
		System.out.println("Cliente cadastrado: ");
	}

	@Override
	public void notificarSubscriber(String notificacao) {
		//List <Observer> interessados = eventoDao.eventos();
		for (Observer o : observers) {
			try {
				o.updateEvents(notificacao);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
