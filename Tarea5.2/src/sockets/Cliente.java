package sockets;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {
	private int puerto = 10000;
	private String host = "localhost";
	private String mensaje;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(int puerto, String host) {
		super();
		this.puerto = puerto;
		this.host = host;
	}
	
	public void enviarMensaje(String mensaje) {
		String respuesta;
		
		try {
			//Aqui conecto
			Socket miSocket = new Socket(host, puerto);
			
			//Aqui escribo
			DataOutputStream miDataOutputStream = new DataOutputStream(miSocket.getOutputStream());
			miDataOutputStream.writeUTF(mensaje);
			System.out.println("Se envio el siguiente mensaje: " + mensaje);
			
			//Aqui leo objeto
			ObjectInputStream miObjectInputStream = new ObjectInputStream(miSocket.getInputStream());
			mensaje = (String)miObjectInputStream.readObject();
			
			//Aqui desconecto
			miDataOutputStream.close();
			miSocket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
}
}
