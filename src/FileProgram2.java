import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileProgram2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("res/images/photo.bmp");
		FileOutputStream fos = new FileOutputStream("res/images/photo-copy.bmp");
		
		//파일헤더정보 추출
		/*fis.read();//시그니쳐바이트 버리고
		fis.read();
		
		byte[] buf = new byte[4];
		buf[0] = (byte)fis.read();
		buf[1] = (byte)fis.read();
		buf[2] = (byte)fis.read();
		buf[3] = (byte)fis.read();*/
		byte[] fileHeader = new byte[14];
		
		fis.read(fileHeader);
		
		int totalSize = ((int)fileHeader[5] & 0b11111111) << 24 | ((int)fileHeader[4] & 0xff) << 16 | ((int)fileHeader[3] & 0xff) << 8 | ((int)fileHeader[2] & 0xff) << 0;
		
		System.out.println("BMP File Size : " + totalSize);
		
		//WidthSize 얻어오기
		/*fis.read(buf);
		fis.read(buf);
		fis.read(buf);
		fis.read(buf);
		
		buf[0] = (byte)fis.read();
		buf[1] = (byte)fis.read();
		buf[2] = (byte)fis.read();
		buf[3] = (byte)fis.read();
		
		int widthSize = ((int)buf[3] & 0xff) << 24 | ((int)buf[2] & 0xff) << 16 | ((int)buf[1] & 0xff) << 8 | ((int)buf[0] & 0xff) << 0;
		
		System.out.println("Width Size : " + widthSize);*/
		
		//바이트 단위 파일 복사 방법
		//양동이
		/*byte[] buf = new byte[1024];
		
		int size;
		
		while((size=fis.read(buf))!=-1){
			fos.write(buf, 0, size); // 1024가 안되는 순간이 마지막 (size는 까지가 아니라 길이)
		}*/
		
		//찻잔
		/*int n;
		while(true){
			n = fis.read();
			if(n == -1)
				break;
			else
				fos.write(n);
		}*/
		
		/*int n;
		while((n = fis.read()) != -1)
			fos.write(n);*/
		
		/*int n = fis.read();
		while(n!=-1){
			fos.write(n);
			n = fis.read();
		}*/
		
		fos.close();
		fis.close();

	}

}
