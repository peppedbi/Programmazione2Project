package data;


public class Map {
    private Block[][] b;

    private int dim1 = 9;
    private int dim2 = 9;

    public Map() {
        this.b = new Block[dim1][dim2];
        for(int i = 0; i < dim1; i++) {
            for(int j = 0; j < dim2; j++) {
                b[i][j] = new Block();
            }
        }
    }
    public void display_on_out() {
        for(int i = 0; i < dim1; i++) {
            for(int j = 0; j < dim2; j++) {
                System.out.print(b[i][j]+" ");
            }
        }
    }
    public void change_cell(int x, int y) {
        this.b[x][y] = new Block('A');
    }

    public int getDim1() {
        return dim1;
    }

    public int getDim2() {
        return dim2;
    }

    public void swap(int x,int y) {
        Block temp;
        temp = this.b[x][y];
        this.b[x][y] = this.b[x][y+1];
        this.b[x][y+1] = this.b[x][y];
    }
}
