package com.kh.run;

public class BubbleSortRun {

	public static void main(String[] args) {
		int[] arr = {22,99,30,68,87,1,13};
		// 임시 변수 => temp
		int temp = 0;
		
		for(int i =0; i<arr.length; i++) { // 전체 사이클
			for(int j =1; j<arr.length; j++) { // 안쪽 사이클
				if(arr[j-1] > arr[j]) { // 앞의 숫자가 뒤에 숫자보다 큰 경우
					temp = arr[j-1]; // 앞의 값을 임시저장해주고(이거없으면 값 사라짐!!)
					arr[j-1] = arr[j]; // 작은 수인 j인덱스 값을 앞으로 보내줌
					arr[j] = temp; // temp에 임시저장한 값을 j인덱스로 옮겨줌
				}
			}
			
		}

	}

}
