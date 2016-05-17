package netio.multi.echo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServerProgram {

	public static void main(String[] args) throws IOException {

		boolean isRun = true;

		// Thread th = new Thread(new Runnable() {
		//
		// @Override
		// public void run() {
		//
		// ServerSocket svrSocket = null;
		// try {
		// svrSocket = new ServerSocket(10001);
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// System.out.println("Listenning.......");
		// Socket socket = null;
		// try {
		// socket = svrSocket.accept();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// System.out.println("connected from" +
		// socket.getRemoteSocketAddress());
		//
		// }
		// });
		//
		// th.start();

		ServerSocket svrSocket = new ServerSocket(10000);
		

		while (isRun) {

			System.out.println("Listenning.......");
			Socket socket = svrSocket.accept();
			System.out.println("connected from" + socket.getRemoteSocketAddress());

			// 네트워크 파일 입출력
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
						// 네트워크 메시지 입출력
						OutputStream nos = socket.getOutputStream();
						InputStream nis = socket.getInputStream();

						PrintStream nout = new PrintStream(nos, true);
						Scanner nscan = new Scanner(nis);

						String msg;

						// 문자열 하나 보내기
						// String msg = nscan.nextLine();
						// System.out.println(msg);
						//
						// nout.println("echo : " + msg);

						do {

							msg = nscan.nextLine();
							System.out.println(msg + socket.getRemoteSocketAddress());
							System.out.println(socket.getPort());
							System.out.println(svrSocket.getLocalPort());

							nout.println("echo : " + msg);

						} while (!msg.equals("bye"));

						nscan.close();
						nout.close();
						nis.close();
						nos.close();

						// fout.close();
						// nin.close();
						// nout.close();
						socket.close();
						// System.out.println("전송된 파일이 저장되었습니다.");

					} catch (Exception e) {
						e.printStackTrace();
					}

				}
			}).start();

		}
	}

}
