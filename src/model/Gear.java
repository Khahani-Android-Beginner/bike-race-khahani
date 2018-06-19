package model;

public class Gear {
    /**
     * model
     * size (between 0 and 10)
     */

    public String model;

    private int mSize;

    public int getSize(){
        return mSize;
    }

    public void setSize(int size){
        if (size < 0 && size > 10){
            System.out.println("size is not valid");
            return;
        }

        mSize = size;
    }
}
