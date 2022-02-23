package day09;

import java.util.Random;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//준비
//		5x5의 빙고판을 만들고 중복없이 출력
		//준비
		int size = 5;
		int[][]map = new int[size][size];
		
		//계산 :1부터 25까지 순서대로 랜덤위치에 중복없이 작성
		Random rand = new Random();
		
		for(int i = 1; i<=size*size;i++) {
				int row = rand.nextInt(size);
				int col = rand.nextInt(size);
				if(map[row][col]==0) {//한번도 넣었던적이 없는칸이라면
					map[row][col] = i;
				}
				else {//한 번 값을 대입했던 칸이라면
					i--;
				}
		}
		
		//출력
		for(int r=0; r<size; r++) {
			for(int c=0; c<size; c++) {
				System.out.print(map[r][c]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
