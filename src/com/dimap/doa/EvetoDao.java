package com.dimap.doa;

import java.util.List;

public interface EvetoDao <T> {
	
	public void add (T evento);
	
	public List<T> eventos ();
	

}
