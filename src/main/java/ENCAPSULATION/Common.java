package ENCAPSULATION;

public class Common {


  //public   int length  to private int length;     // we will put priavte to encapsulate data and no one can modify the class level data


    // to solve this problem we need to use getter and setter method

    private    int length ;
    private   int width ;
  private    int height ;

    public int getLength() {
        return length;
    }

    public int setLength(int length) {
        this.length = length;
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int setWidth(int width) {
        this.width = width;
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int setHeight(int height) {
        this.height = height;
        return height;
    }

    public void  setDimensionofBox(int l , int w , int h ){

        System.out.println("box dimesions " + (l + w + h) + "  ");
    }


}
