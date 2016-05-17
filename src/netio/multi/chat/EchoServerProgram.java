package netio.multi.chat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class EchoServerProgram {

	public static void main(String[] args) throws IOException, UnknownHostException {

		List<PrintStream> nouts = new ArrayList<>();
		ReadWriteLock lock = new ReentrantReadWriteLock();
		
		boolean isRun = true;
		
		ServerSocket svrSocket = new ServerSocket(10000);
		

		while (isRun) {

			System.out.println("Listenning.......");
			Socket socket = svrSocket.accept();
			System.out.println("connected from" + socket.getRemoteSocketAddress());

			// ��Ʈ��ũ ���� �����
			// OutputStream nout = socket.getOutputStream();
			// InputStream nin = socket.getInputStream();
			// char c = (char) nin.read();
			// System.out.println(c);

			// OutputStream fout = new
			// FileOutputStream("C:\\Users\\easy\\Desktop\\img.jpg");

			// for (int c = nin.read(); c != -1; c = nin.read()) {
			// fout.write(c);
			// }
			//
			// fout.flush();

			new Thread(new Runnable() {

				@Override
				public void run() {

					try {
						// ��Ʈ��ũ �޽��� �����
						OutputStream nos = socket.getOutputStream();
						InputStream nis = socket.getInputStream();

						PrintStream nout = new PrintStream(nos, true);
						lock.writeLock().lock();
						nouts.add(nout);
						lock.writeLock().unlock();
						Scanner nscan = new Scanner(nis);

						String msg;

						// ���ڿ� �ϳ� ������
						// String msg = nscan.nextLine();
						// System.out.println(msg);
						//
						// nout.println("echo : " + msg);

						do {

							msg = nscan.nextLine();
							//System.out.println(msg + socket.getRemoteSocketAddress());
							//System.out.println(socket.getPort());
							//System.out.println(svrSocket.getLocalPort());

							//nout.println("echo : " + msg);
							lock.readLock().lock();
							for (PrintStream printOut : nouts) {
								printOut.println(msg);
							}
							lock.readLock().unlock();

						} while (!msg.equals("bye"));

						nscan.close();
						nout.close();
						nis.close();
						nos.close();

						// fout.close();
						// nin.close();
						// nout.close();
						socket.close();
						// System.out.println("���۵� ������ ����Ǿ����ϴ�.");

					} catch (Exception e) {
						e.printStackTrace();
					}

				}
			}).start();

		}
	}

}
