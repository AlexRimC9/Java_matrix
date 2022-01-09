package com.company;

public class Up extends Matrix {
    public void fill() {
        for (int i = this.lvlLeft; i <= this.lvlRight; i++) {
            if (matrix[this.lvlUp][i] == 0) {
                matrix[this.lvlUp][i] = this.counter + 1;
                this.counter++;
            }
        }
        this.lvlUp++;
    }

}

