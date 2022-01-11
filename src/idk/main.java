package idk;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int num2 = input.nextInt();
        int counter_end = num * num2;
        Matrix matrix = new Matrix(num, num2);
        Up up = new Up(matrix);
        Down down = new Down(matrix);
        Right right = new Right(matrix);
        Left left = new Left(matrix);
        while (matrix.getCounter() < counter_end){
            up.fill();
            right.fill();
            down.fill();
            left.fill();
        }
        matrix.printMatrix();
    }
}