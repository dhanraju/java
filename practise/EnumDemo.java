class FreshJuice {
    enum FreshJuiceEnum{ SMALL, MEDIUM, LARGE }
    FreshJuiceEnum size;
}

public class EnumDemo {

    public static void main(String args[]) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceEnum.MEDIUM;
        System.out.println("Size: " + juice.size);
    }
}

/*
Compile-Run-Output:
$ javac EnumDemo.java 
$ java EnumDemo 
Size: MEDIUM
*/
