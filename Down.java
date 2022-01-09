package com.company;

public class Down extends Matrix {
    public void fill() {
        for (int i = this.lvlRight; i >= this.lvlLeft; i--) {
            if (matrix[this.lvlDown][i] == 0) {
                matrix[this.lvlDown][i] = this.counter + 1;
                this.counter++;
            }
        }
        this.lvlDown--;
    }
}

