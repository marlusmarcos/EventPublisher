package com.dimap.doa;

import java.util.ArrayList;
import java.util.List;

import com.dimap.Observer;

public class EventoDao implements EvetoDao<Observer>{
	
	private List<Observer> observers = new ArrayList<>();

	@Override
	public void add(Observer obs) {
		observers.add(obs);		
	}

	@Override
	public List<Observer> eventos() {
		return observers;
	}

}
