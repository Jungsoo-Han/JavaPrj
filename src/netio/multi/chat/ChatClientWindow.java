package netio.multi.chat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ChatClientWindow extends JFrame implements Runnable {
	
	// 소켓 구조
	private Socket socket;
	// 네트워크 입출력을 위한 자료들
	private PrintStream nout;
	private Scanner nscan;
	
	// 메뉴 객체의 구조
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem miExit;
	private JMenu mnTool;
	private JMenuItem miConnect;
	
	private JButton btnSend;
	private JTextArea txtInput;
	private JPanel panel;
	private JTextArea txtOutput;
	
	
	public ChatClientWindow() {
		
		this.setSize(1024, 768);
		
		addWindowListener(new WindowListener() {


			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		menuBar = new JMenuBar();
		mnFile = new JMenu("File");
		miExit = new JMenuItem("Exit");
		miExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		mnTool = new JMenu("Tool");
		miConnect = new JMenuItem("Connect");
		miConnect.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					socket = new Socket("211.238.142.108", 10000);
					
					if (socket.isConnected()) {
						txtOutput.setText("Connected to");
						InputStream is = socket.getInputStream();
						OutputStream os = socket.getOutputStream();
						nout = new PrintStream(os, true);
						nscan = new Scanner(is);
						
						new Thread(ChatClientWindow.this).start();
						
//						nscan.close();
//						nout.close();
//						os.close();
//						is.close();
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				// txtInput.setEditable(true);
				// JOptionPane.showConfirmDialog(null, "Hello");
			}
		});
		
		mnFile.add(miExit);
		menuBar.add(mnFile);
		
		mnTool.add(miConnect);
		menuBar.add(mnTool);
		
		this.setJMenuBar(menuBar);
		
		panel = new JPanel();
		panel.setLayout(new BorderLayout());

		btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
//				String sendText = txtInput.getText();
//				txtOutput.setText(sendText);
//				txtOutput.setText(txtInput.getText() + "\n" + txtInput.getText());
				
				// 네트워크로 전달
				String msg = txtOutput.getText();
				if (msg.isEmpty()) {
					msg += txtInput.getText();
				} else {
					msg += "\n" + txtInput.getText();
				}
				txtOutput.setText(msg);
//				txtOutput.append(txtInput.getText()+"\n");
//				txtInput.setText("");
				
//				txtInput.setText("");
				
			}
		});
		panel.add(btnSend, BorderLayout.LINE_END); // 버튼의 크기와 위치를 지정하지 않았다 : 크기+위치 = 레이아웃
		
		panel.setBorder(BorderFactory.createLineBorder(Color.black));

		txtInput = new JTextArea();
		txtInput.setPreferredSize(new Dimension(100, 100));
		// txtInput.setEditable(false);
		panel.add(txtInput, BorderLayout.CENTER);
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		txtOutput = new JTextArea();
		txtOutput.setPreferredSize(new Dimension(100, 100));
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		// txtOutput.setEditable(false);
		
		this.add(txtOutput, BorderLayout.CENTER);
		this.add(panel, BorderLayout.PAGE_END);
		
		
	}

	// 네트워크로 입력되는 값을 처리하는 함수
	@Override
	public void run() {

		while(true) {
			String msg = nscan.nextLine();
			txtOutput.setText(msg);
		}
		
	}

}
