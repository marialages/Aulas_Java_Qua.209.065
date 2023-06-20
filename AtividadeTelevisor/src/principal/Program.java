package principal;

import entities.Televisor;

public class Program {

	public static void main(String[] args) {
		Televisor tv = new Televisor();
		
		tv.mostrarStatus();
		
		tv.ligarTelevisor();
		
		tv.mostrarStatus();
		
		tv.aumentarCanal();
		tv.aumentarCanal();
		tv.aumentarCanal();

		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		
		tv.mostrarStatus();


		
		
	}

}

