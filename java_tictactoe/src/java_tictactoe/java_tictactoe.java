package java_tictactoe;
import java.util.*;

public class java_tictactoe {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[][ ] arrays= new char[3][3];
		for(int i =0; i<arrays.length; i++) {
			for(int l =0; l<arrays[i].length; l++) {
				arrays[i][l]=' ';
			}
		}
		do {
		for(int i =0; i<arrays.length; i++) {
				System.out.println(" "+arrays[i][0]+" |"+" "+arrays[i][1]+" |"+" "+arrays[i][2]);
				if(i!=2) {
					System.out.println("---|---|---");
				}
		}
		System.out.print("���� ���� ��ǥ�� �Է��Ͻÿ�: ");
		int x=scan.nextInt();
		int y=scan.nextInt();
		
		if(arrays[x][y]!=' ') {
			System.out.println("�߸��� ��ġ�Դϴ�.");
			continue;
		}else 
			arrays[x][y]='X';
		int i=0,l=0;
		for(i=0; i<3; i++) {
			for(l=0; l<3; l++) {
				if(arrays[i][l]==' ')
					break;
			}
			if(arrays[i][l]==' ')		
				break;
			
		}
		if(i<3 && l<3)
			arrays[i][l]='0';
		}while(true);
	}

}
