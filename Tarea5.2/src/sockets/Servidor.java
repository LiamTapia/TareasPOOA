package sockets;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	private String mensaje;
	private int puerto = 10000;

	public Servidor(int puerto, String mensaje) {
		super();
		this.puerto = puerto;
		this.mensaje = mensaje;
	}
	/*
	private void cargarMensaje() {
		try {
			FileInputStream miFileInputStream = new FileInputStream("miArchivo.dat");
			ObjectInputStream miObjectInputStream = new ObjectInputStream(miFileInputStream);
			elEcosistema = (Ecosistema)miObjectInputStream.readObject();
			System.out.println(elEcosistema);
			miFileInputStream.close();
			miObjectInputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}*/

	public void iniciarServidor() {


		try {
			//Creamos servidor en el puerto
			ServerSocket miServerSocket = new ServerSocket(puerto);
			System.out.println("Se inicia servicio");

			while(true) {
				//Esperamos conexion y generamos socket cuando hay una
				System.out.println("En espera de una conexion");
				Socket miSocket = miServerSocket.accept();
				System.out.println("Se acepta conexion");
				HiloSocket miSocketThread = new HiloSocket(miSocket, mensaje);
				miSocketThread.start();
				System.out.println("Se atiende conexion en un thread nuevo");
				miServerSocket.close();
				miSocket.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
