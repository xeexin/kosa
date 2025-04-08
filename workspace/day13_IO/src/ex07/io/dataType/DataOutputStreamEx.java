package ex07.io.dataType;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		File file = new File("text.txt");
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);

		dos.writeBoolean(true);
		dos.writeChar(65); // A
		dos.writeShort(100);
		dos.writeInt(5000);
		dos.writeLong(888888888);
		dos.writeFloat(12.34f);
		dos.writeDouble(8.8);
		
		dos.flush(); // 버퍼 비우기

		System.out.println("test.txt 파일에 " + dos.size() + "byte save");

	}

}
