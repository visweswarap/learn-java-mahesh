package oops;

public class TamperedGlass {
    int width;  // Integer
    int height;
    float thickness;
    private int x = 10;

    TamperedGlass(int width1, int height1, float thickness){
        this.width = width1;
        this.height = height1;
        this.thickness = thickness;
        int a = 10;
    }

    TamperedGlass(){

    }

    float requiredRawMeteriel(){
        return width*height*thickness;
    }

    void abc(String s, int i){

    }

    void abc(String s){

    }
}
