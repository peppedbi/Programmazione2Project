package UI;

import Blocks.*;
import Exceptions.BlockErrorException;
import UI.coords.Coordinate;

import java.util.Arrays;
import java.util.Random;

public class Map {
    private static Block[][] b;
    private final int dim1 = Coordinate.MAX_ROWS;
    private final int dim2 = Coordinate.MAX_COLUMNS;

    public Map() {
        b = new Block[dim1][dim2];
        for(int i = 0; i < dim1; i++) {
            for(int j = 0; j < dim2; j++) {
                b[i][j] = new AirBlock();
            }
        }
       // addRowsOfWater(0,0);
        generateRandomMap();
    }
    public void display_on_out() {
        for(int i = 0; i < dim1; i++) {
            System.out.println();
            for(int j = 0; j < dim2; j++) {
                System.out.print(b[i][j].display() + " ");
            }
        }

    }
    public void change_cell(int x, int y) {
        this.b[x][y] = new SandBlock();
    }

    public int getDim1() {
        return dim1;
    }

    public int getDim2() {
        return dim2;
    }

    public void swap(int x,int y) {
        if(x > dim1-1 || y > dim2-1) {
            System.out.println("Out of bounds");
            return;
        } else {
            Block temp;
            temp = this.b[x][y];
            this.b[x][y] = this.b[x + 1][y];
            this.b[x + 1][y] = temp;
        }

    }

    public void insert_at_cords(int x, int y) {
        Random rdm = new Random();
        int randomChoice;
        randomChoice = rdm.nextInt(2 );
        if(randomChoice == 1) {
            b[x][y] = new SandBlock();
        } else {
            b[x][y] = new RawIronBlock();
        }
        if(x+1 >= dim1) {
            return;
        } else {
            if(b[x+1][y].isFall_through()) {
                System.out.println("CIAOO: "+b[x][y].isFalls_with_gravity());
                // swap(x,y);
                insert_rec(x,y);
            }
        }

    }
    public void insert_rec(int x,int y) {
        if(x < dim1-1 && b[x+1][y].isFall_through() && b[x][y].isFalls_with_gravity()) {
            swap(x,y);
            insert_rec(x+1,y);
        }
    }
    public void addRowsOfWater(int x, int y) {
        if(y <= dim2-1 && b[x+1][y].isFall_through()) {
            b[x][y] = new WaterBlock();
            addRowsOfWater(x,y+1);
        }
    }
    public void addSea(int x,int y) {
        if(y <= dim2-1 && b[x+1][y].isFall_through() && x < dim1-1) {
            for(int i = 0; i < 3; i++) {
                addRowsOfWater(x+i,y);
            }
        }
    }
    public boolean isSmeltable(int x, int y) {
        return this.b[x][y] instanceof SmeltableBlock;
    }
    public Block getSmeltable(int x, int y) throws BlockErrorException {

            if(isSmeltable(x,y)) {
                return this.b[x][y];
            } else {
                throw new BlockErrorException("Errore!");
            }



    }
    public void generateRandomMap() {
        Random rand = new Random();
        for(int i = 0 ; i < 36; i++){
            Block b = new SandBlock(); // create un SandBlock
            int row = rand.nextInt(dim1);
            int col = rand.nextInt(dim2);
            insert_at_cords(row,col);

        }
    }

    public Block getBlock(int x,int y) {
        return b[x][y];
    }
    public void fillWithVoid(int x, int y) {
        b[x][y] = new AirBlock();
    }
    private boolean isPickable(int x, int y) {
        return b[x][y].isPickable();
    }
    public Block gimme_pickable(int x, int y) throws BlockErrorException {
        if(isPickable(x,y)) {
            return b[x][y];
        } else {
            throw new BlockErrorException("Errore!");
        }
    }
    public void gravity() {
        for(int i = 0; i < dim1; i++) {
            for(int j = 0; j < dim2; j++) {
                if(b[i][j].isFalls_with_gravity() && b[i+1][j] instanceof AirBlock) {
                    while(b[i+1][j] instanceof AirBlock) {
                        swap(i, j);
                    }
                }
                if(b[i][j].isFalls_with_gravity() && b[i+1][j] instanceof TorchBlock) {
                    fillWithVoid(i,j);
                }
            }
        }
    }
    public void insertTorch(int x, int y) {
        b[x][y] = new TorchBlock();
    }
}
