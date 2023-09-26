package local_inner_class;

public class Main {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult(30,5);
    }
}

class Math{
    int a =1;
    public void getResult(final int delimoe, final int delitel){
        int b = 2;
        class Delenie{

            public int getChastnoe(){
                return delimoe/delitel;
            }

            public int getOstatok(){
                return delimoe%delitel;
            }
        }
        Delenie delenie = new Delenie();
        System.out.println(delenie.getChastnoe());
        System.out.println(delenie.getOstatok());
    }
}