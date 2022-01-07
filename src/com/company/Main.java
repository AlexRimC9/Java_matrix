package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int num_2 = input.nextInt();
        int[][] matrix = new int[num][num_2];
        int counter_end = num * num_2;
        int counter = 0;
        int lvl_up = 0;
        int lvl_left = 0;
        int lvl_right = num_2 - 1;
        int lvl_down = num - 1;
        while (counter < counter_end) {
            for (int i = lvl_left; i <= lvl_right; i++) {
                if (matrix[lvl_up][i] ==0){
                    matrix[lvl_up][i] = counter + 1;
                    counter++;
                }
            }
            lvl_up++;
            for (int i = lvl_up; i <= lvl_down; i++) {
                if (matrix[i][lvl_right]==0) {
                    matrix[i][lvl_right] = counter + 1;
                    counter++;
                }
            }
            lvl_right--;
            for (int i = lvl_right; i >= lvl_left; i--) {
                if (matrix[lvl_down][i] == 0){
                    matrix[lvl_down][i] = counter + 1;
                    counter++;
                }
            }
            lvl_down--;
            for (int i = lvl_down; i >= lvl_up; i--) {
                if (matrix[i][lvl_left] == 0) {
                    matrix[i][lvl_left] = counter + 1;
                    counter++;
                }
            }
            lvl_left++;
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num_2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
