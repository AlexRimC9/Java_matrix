package idk;

public class Up {
    private Matrix matrix;

    public Up(Matrix matrix) {
        this.matrix = matrix;
    }

    public void fill() {
        for (int i = matrix.getLvlLeft(); i <= matrix.getLvlRight(); i++) {
            if (matrix.getElement(matrix.getLvlUp(), i) == 0) {
                matrix.setElement(matrix.getLvlUp(), i, matrix.getCounter() + 1);
                matrix.incCounter();
            }
        }
        matrix.incLvlUp();
    }
}
