package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteDao {

	/*
	 * "바이트 기반 스트림" 가지고 데이터 입출력해보기!!
	 * 
	 * 바이트 스트림 : 데이터를 1바이트 단위로 전송하는 통로(좁은통로.., 한글은 2바이트라 깨짐 ㅋ) 기반 스트림 : 외부매체와 직접적으로
	 * 연결되는 통로
	 * 
	 * XXXInputStream : XXX 매체로부터 데이터를 입력받는 통로 (외부매체로부터 데이터 읽어오겠음!) XXXOutputStream
	 * : XXX 매체로부터 데이터를 출력하는 통로 (외부매체로부터 데이터를 내보내겠다. 쓰겠다.)
	 * 
	 */

	// 프로그램 (자바 또는 메모리) --> 외부매체(파일) (출력 : 프로그램상의 데이터를 파일로 내보내기, 즉 파일로 저장)
	public void fileSave() {

		// FileOutputStream : 파일과 직접적으로 연결해서 1바이트 단위로 출력하는 스트림

		// 1. 스트림 생성 (통로 만들기)
		// 2. 스트림으로 데이터를 출력 (메소드 활용)
		// 3. 다 사용 후 스트림 반납

		FileOutputStream fout = null; // null로 안하면 또 try catch 하라고함.
		try {
			// 1. FileOutputStream 객체 생성 => 해당 파일과의 연결통로 만들어짐
			// fout = new FileOutputStream("a_byte.txt");
			fout = new FileOutputStream("a_byte.txt"/* ,false */);

			/*
			 * true 미작성시 => 해당 파일이 존재할 경우 기존의 데이터 덮어 씌워짐(기본값이 false) true 작성시 => 해당 파일이 존재할
			 * 경우 기존의 데이터에 이어서 작성
			 */

			// 2. 파일에 데이터를 출력하고자 할 때 write 메소드 사용
			// 숫자를 출력하든 문자를 출력하든 실상 파일에 기록되는건 문자로 기록됨

			fout.write(97); // 'a'가 저장됨
			fout.write('b'); // 'b'가 저장됨
			// fout.write('헐'); // 한글은 2바이트 짜리여서 깨져서 저장됨 => 바이트 스트림으로는 제한이있음.

			// fout.write(byte[] b);

			byte[] arr = { 99, 100, 101 };
			fout.write(arr); // cde 문자 저장

			// fout.write(byte[], int off, int len); : 바이트배열의 off 인덱스부터 len 개수만큼 출력
			fout.write(arr, 1, 2); // de 문자 저장

			// 3. 스트림 이용했으면 반납하기! (반드시!!!!!!!!!!!)
			// fout.close(); 위에서 write()메소드 실행시 IOException 발생했을 경우 => catch 블럭 실행 후 빠져나감
			// (반납하는 코드 실행안됨!)
			// 반드시 실행해야하는 구문이기 때문에 finally{}에 기술

		} catch (FileNotFoundException e) { // 파일못찾거나 그럴때
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 이 안에 작성된 코드는 어떤 예외가 발생했던간에 마지막에 무조건 실행하고 빠져나갈거임
			try {
				// 3. 스트림 다 이용했으면 반납!!!
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

	// 프로그램 <---------- 파일 (입력 : 파일로부터 데이터 가져오기)
	public void fileRead() {
		// FileInputStream : 파일로부터 데이터를 1바이트 단위로 입력받는 스트림

		// 1. 스트림 생성(통로 만들기)
		// 2. 스트림 통해서 입력받아옴 (메소드 활용)
		// 3. 스트림 반납

		FileInputStream fin = null;

		// 1. FileInputStream 객체 생성 => 해당 파일과 연결통로 만들어짐
		try {
			fin = new FileInputStream("a_byte.txt"); // 없는 파일이면 FileNotFoundException 오류

			// 2. 파일로부터 데이터를 읽어들이고자 할 때 read 메소드 사용
			// 1byte 단위로 하나씩 읽어옴 / 반환형이 int여서 숫자로 읽어들임

			// 실제로 파일에 얼마만큼 데이터가 있는지 모를경우 => 반복문 활용

			/*
			 * System.out.println(fin.read()); //a System.out.println(fin.read()); //b
			 * System.out.println(fin.read()); //c System.out.println(fin.read()); //d
			 * System.out.println(fin.read()); //e System.out.println(fin.read()); //d
			 * System.out.println(fin.read()); //e
			 * 
			 * System.out.println(fin.read()); //파일의끝을 만나는 순간 -1 받아오는거 확인
			 */

			/*
			 * 반복문 수행시 매번 read()가 두번씩 실행되기 때문에 퐁당퐁당 읽어들여짐 => 잘못됨 while(fin.read() != -1) {
			 * // 읽어들인 값이 -1이 아닐 경우에만 반복적으로 실행하도록 하는 코드 System.out.println(fin.read()); }
			 */
			// read() 호출 반복문 수행시에만 실행되도록
			// 해결방법1. 무한반복을 돌리면서 매번 조건검사
			
			/*
			while(true) {
				int value = fin.read();
				if(value == -1) {
					break;
				}
				System.out.println(value);
			}
			*/
			
			// 해결방법2. 권장방법
			int value = 0;
			while((value = fin.read()) != -1) {
				System.out.println((char)value);
			}
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. 다 사용한 스트림 반납
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
