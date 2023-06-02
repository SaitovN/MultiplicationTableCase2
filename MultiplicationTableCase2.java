package academy.devonline.java.basic.section01_setup.section05_setup;

public class MultiplicationTableCase2 {
    public static void main(String[] args) {
        var to =9;
        for (int i = 2; i <=to; i++) {
            for (int j = 2; j <=5; j++) {
                var res = j+" * "+i+" = "+i*j;
                System.out.print(res+"\t");
            }
            System.out.println();

        }
        System.out.println();
        for (int i = 2; i <=to; i++) {
            for (int j = 6; j <=to; j++) {
                var res = j+" * "+i+" = "+i*j;
                System.out.print(res+"\t");
            }
            System.out.println();}
    }
}
