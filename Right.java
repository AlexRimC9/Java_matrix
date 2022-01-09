package com.company;

public class Right extends Matrix {
    public void fill() {
        for (int i = this.lvlUp; i <= this.lvlDown; i++) {
            if (matrix[i][this.lvlRight] == 0) {
                matrix[i][this.lvlRight] = this.counter + 1;
                this.counter++;
            }
        }
        this.lvlRight--;
    }
}

