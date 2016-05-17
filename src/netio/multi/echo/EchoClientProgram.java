package netio.multi.echo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class EchoClientProgram {

	public static void main(String[] args)  {

//		Socket socket = null;

//		try {
//			socket = new Socket("211.238.142.108", 50000);
//			System.out.println("connected to" + socket.getRemoteSocketAddress());
//			socket.setSoTimeout(15000);
//		} catch (IOException ex) {
//			System.err.println(ex);
//		} finally {
//			if (socket != null) {
//				try {
//					socket.close();
//				} catch (Exception e) {}
//			}
//		}
		
		try(Socket socket = new Socket("211.238.142.120", 10000)) {
			
			socket.setSoTimeout(15000);
			System.out.println("connected to" + socket.getRemoteSocketAddress());
			
			// 네트워크 파일 입출력
//			OutputStream nout = socket.getOutputStream();
//			InputStream nin = socket.getInputStream();
//			nout.write('h');
//			nout.flush();
			
//			InputStream fin = new FileInputStream("C:\\Users\\easy\\Desktop\\intro.jpg");
			
//			for (int c = fin.read(); c != -1; c = fin.read()) {
//				nout.write(c);
//			}
//			
//			nout.flush();
			
			OutputStream nos = socket.getOutputStream();
			InputStream nis = socket.getInputStream();
			
			PrintStream nout = new PrintStream(nos, true);
			Scanner nscan = new Scanner(nis);
			
			Scanner scan = new Scanner(System.in);
			
			String msg;
			
			// nout.println("hello network");
			
			// String msg = nscan.nextLine();
			
			do {
				
				msg = scan.nextLine();
				nout.println(msg);
				
				String echo = nscan.nextLine();
				System.out.println(echo);
				
			} while (!msg.equals("bye"));
			
			// System.out.println(msg);
			
			
			nout.close();
			nscan.close();
			nis.close();
			nos.close();
			
//			nin.close();
//			nout.close();
			socket.close();
			System.out.println("파일 전송이 완료되었습니다.");
			
		} catch (IOException ex) {
			System.err.println("연결 오류");
		}
		
		
	
		
	}

}
