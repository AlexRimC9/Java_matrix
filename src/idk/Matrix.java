package idk;

public class Matrix {
    int[][] matrix;
    private int lvlUp;
    private int lvlLeft;
    private int lvlRight;
    private int lvlDown;
    private final int maxX;
    private final int maxY;
    private int counter;

    public int getLvlUp() {
        return lvlUp;
    }

    public int getLvlDown() {
        return lvlDown;
    }

    public int getLvlRight() {
        return lvlRight;
    }

    public int getLvlLeft() {
        return lvlLeft;
    }

    public int getCounter() {
        return counter;
    }

    public void incCounter() {
        this.counter++;
    }

    public void incLvlUp() {
        this.lvlUp++;
    }

    public int getElement(int x, int y) {
        return matrix[x][y];
    }

    public void incLvlLeft() {
        this.lvlLeft++;
    }

    public void incLvlRight(){
        this.lvlRight--;
    }
    public void incLvlDown(){
        this.lvlDown--;
    }


    public int setElement(int x, int y, int c) {
        return this.matrix[x][y] = c;
    }

    public Matrix() {
        this.maxX = 1;
        this.maxY = 1;
        this.matrix = new int[maxX][maxY];
    }

    public Matrix(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
        this.counter = 0;
        this.lvlUp = 0;
        this.lvlLeft = 0;
        this.lvlRight = this.maxY - 1;
        this.lvlDown = this.maxX - 1;
        this.matrix = new int[maxX][maxY];
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
