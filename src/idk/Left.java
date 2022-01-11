package idk;

public class Left {
    private Matrix matrix;

    public Left(Matrix matrix) {
        this.matrix = matrix;
    }

    public void fill() {
        for (int i = matrix.getLvlDown(); i >= matrix.getLvlUp(); i--) {
            if (matrix.getElement(i,matrix.getLvlLeft()) == 0) {
                matrix.setElement(i,matrix.getLvlLeft(),matrix.getCounter() + 1);
                matrix.incCounter();
            }
        }
        matrix.incLvlLeft();
    }
}


