package idk;

public class Down {
   private Matrix matrix;

    public Down(Matrix matrix) {
        this.matrix = matrix;
    }

    public void fill() {
        for (int i = matrix.getLvlRight(); i >= matrix.getLvlLeft(); i--) {
            if (matrix.getElement(matrix.getLvlDown(),i) == 0) {
                matrix.setElement(matrix.getLvlDown(),i,matrix.getCounter() + 1);
                matrix.incCounter();
            }
        }
        matrix.incLvlDown();
    }
}
