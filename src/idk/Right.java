package idk;

public class Right {
    private Matrix matrix;

    public Right(Matrix matrix) {
        this.matrix = matrix;
    }

    public void fill() {
        for (int i = matrix.getLvlUp(); i <= matrix.getLvlDown(); i++) {
            if (matrix.getElement(i,matrix.getLvlRight()) == 0) {
                matrix.setElement(i,matrix.getLvlRight(),matrix.getCounter() + 1);
                matrix.incCounter();
            }
        }
        matrix.incLvlRight();
    }
}
