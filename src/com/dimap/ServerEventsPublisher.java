package com.dimap;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import com.dimap.doa.EventoDao;

public class ServerEventsPublisher extends UnicastRemoteObject implements ServerEvents{
	
	EventoDao eventoDao = new EventoDao();

	protected ServerEventsPublisher() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Observer o) {
		eventoDao.add(o);
	}

	@Override
	public void notificarSubscriber(String notificacao) {
		List <Observer> interessados = eventoDao.eventos();
		for (Observer o : interessados) {
			System.out.println(o.meuId()+"Está recebendo: " + notificacao);
		}
		
	}

}
