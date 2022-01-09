package com.company;

public class Matrix {

    int[][] matrix;
    protected int lvlUp;
    protected int lvlLeft;
    protected int lvlRight;
    protected int lvlDown;
    private final int maxX;
    private final int maxY;
    protected int counter;

    public Matrix() {
        this.maxX = 1;
        this.maxY = 1;
        this.matrix = new int[maxX][maxY];
    }

    public Matrix(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
        this.counter = 1;
        this.lvlUp = 0;
        this.lvlLeft = 0;
        this.lvlRight = this.maxX - 1;
        this.lvlDown = this.maxY - 1;
        this.matrix = new int[maxX][maxY];
    }

    public void fill_circle(int maxX,int maxY){

    }


    public void printMatrix() {
        for (int i = 0; i < this.maxX; i++) {
            for (int j = 0; j < this.maxY; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}