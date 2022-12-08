package ForLoops.ForLoopsLab;

public class NumbersFrom1To100_01 {
    public static void main(String[] args) {

        for (int i = 1 ; i<=100; i++){
            /*System.out.println(i);
            System.out.printf("%d, " + i);*/
            if (i<= 99){
                System.out.printf("%d, ",i);
            }else {
                System.out.print(i);
            }
        }
    }
}
