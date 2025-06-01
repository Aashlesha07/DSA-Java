package TenthClass;

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();//n
        int col = sc.nextInt();//m
        int array[][] = new int[row][col];

        for (int i = 0; i<row; i++){
            for (int j= 0; j<col; j++){
                array[i][j]=sc.nextInt();
            }
        }
        int left = 0;//row start
        int right = col-1;//row end
        int top = 0;//col start
        int bottom = row-1;//col end
        

        while (top<=bottom &&  left<=right){
            for (int i=top; i<=bottom; i++){
                System.out.println(array[left][i]);
            }
            left++;
            for (int j=left; j<=right; j++){
                System.out.println(array[j][bottom]);
            }
            bottom--;
            for(int i=bottom; i>=top; i--){
                System.out.print(array[right][i]);
            }
            right--;
            for(int j=right;j>=left;j--){
                System.out.println(array[j][top]);
            }
            top++;

            System.out.println();
        }

    }
    
}
