package f_exception;

import java.io.IOException;

public class ThrowException {
	/*
	 * 예외 발생시키기
	 *  - throw new Exception();
	 *  - throw 예약어와 예외 클래스 객체로 예외를 고의적으로 발생시킬 수 있다.
	 */
	public static void main(String[] args) {
		IOException ioe = new IOException();
		
		try {
			throw ioe;
		}catch(IOException e){
			e.printStackTrace();
		}
		UserException ue = new UserException();
		try {
			throw ue;
		}catch(UserException e) {
			e.printStackTrace();
		}
			try {
				if(1 == 1) {//condition
					throw new UserException();
			}
		}catch(UserException e) {
			e.printStackTrace();
			}
		}
	}

