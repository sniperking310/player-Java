package models;

public class Position{

    int x = 0;
    int y = 0;
    int z = 0;

    public Position(int x, int y , int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getZ() {
        return z;
    }

    public int getY() {
        return y;
    }
}
