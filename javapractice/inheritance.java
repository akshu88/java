class area{
    double length,breadth;
    area(double l , double b){
        length=l;
        breadth=b;
    }
    double compare(){
        return(length*breadth);
    }
}

class volume extends area{
    double height;
    volume(double l, double b, double h){
        super(l,b);
        height=h;
    }
    double compvol(){
        return(length*breadth*height);
    }
}

class inheritance{
    public static void main(String []args){
        volume v = new volume(2,3,4);
        System.out.println("area="+v.compare());
        System.out.println("volume="+v.compvol()); 
    }
}