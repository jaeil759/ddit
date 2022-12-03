package f_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Finally {

	/*
	 * finally
	 *  - 필요에 따라 try-catch 뒤에 finally를 추가할 수 있다.
	 *  - finally는 예외의 발생여부와 상관없이 가장 마지막에 수행된다.
	 *  
	 *  자동 자원 반환
	 *  - try(변수선언; 변수선언()catch Exception e{}
	 *  
	 *  = 사용후 
	 *  
	 */
	
	
	public static void main(String[] args) {
		FileInputStream fis = null; // 파일 읽기
		try {
			fis = new FileInputStream("d:/file.txt");
		} catch (FileNotFoundException e) {
			System.out.println("파일없음");
			e.printStackTrace();
		}finally {
			System.out.println("finally");
			try {
				fis.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
		// 예외발생 : try -> catch -> finally
		// 예외 미발생 : try-finally 
		try(FileOutputStream fos = new FileOutputStream("d:/file.txt")){
				String str = "아무내용이나 써보자!";
				byte[] bytes = str.getBytes();
				for(int i = 0; i <bytes.length; i++) {
					fos.write(bytes[i]);
					
			
		}
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
		}
	}
}