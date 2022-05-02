package com.dimap;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ServerEventsPublisher extends UnicastRemoteObject implements ServerEvents{
	
	private List<Evento> topicos = new ArrayList<>();
	
	public Evento criarTopico (String titulo) throws RemoteException {
		Evento topico = (Evento) new EventoImpl(titulo);
		topicos.add(topico);
		return topico;
	}
	
	//EventoDao eventoDao = new EventoDao();//
	private volatile List<Observer> observers = new ArrayList<>();

	protected ServerEventsPublisher() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void register(Observer o) {
		//observers.add(o);
		//topico.setObservers(o);
		//System.out.println("Cliente cadastrado: ");
	}

	@Override
	public void notificarSubscriber(String notificacao) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Evento getEvento(int i) {
		return topicos.get(i);		
	}

//	@Override
//	public void notificarSubscriber(String notificacao) {
//		//List <Observer> interessados = eventoDao.eventos();
//		for (Observer o : topico.getObservers()) {
//			try {
//				o.updateEvents(notificacao);
//			} catch (RemoteException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//	}

}
