package sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class HiloSocket extends Thread{
	private String mensaje;
	private Socket miSocket;
	private DataInputStream miDataInputStream;
	private DataOutputStream miDataOutputStream;
	private ObjectOutputStream miObjectOutputStream;
	private String lectura;
	private String escritura;

	public HiloSocket(Socket socket, String mensaje) {
		super();
		this.miSocket = socket;
		this.mensaje = mensaje;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			//leemos por el socket
			miDataInputStream = new DataInputStream(miSocket.getInputStream());
			lectura = miDataInputStream.readUTF();
			//System.out.println("El cliente envia lo siguiente: " + lectura);
					
			escritura = "Mensaje enviado";

			//escribimos objeto por el socket
			miObjectOutputStream = new ObjectOutputStream(miSocket.getOutputStream());
			miObjectOutputStream.writeObject(mensaje);
			//System.out.println("El servidor responde lo siguiente: " + miEcosistema);
			
			miObjectOutputStream.close();
			miDataInputStream.close();
			miSocket.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
