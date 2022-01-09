package com.company;

public class Left extends Matrix {
    public void fill() {
        for (int i = this.lvlDown; i >= this.lvlUp; i--) {
            if (matrix[i][lvlLeft] == 0) {
                matrix[i][lvlLeft] = this.counter + 1;
                this.counter++;
            }
        }
        this.lvlLeft++;
    }
}