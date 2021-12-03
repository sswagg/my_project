import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        ArrayList<Printable> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Square/Trangle/print/delete");
            String str = scanner.nextLine();
            switch(str){
                case "Square":
                    arrayList.add(new Square());
                    break;
                case "Trangle":
                    arrayList.add(new Triangle());
                    break;
                case "print":
                    for(Printable a : arrayList){
                        a.print();
                    }
                    break;
                case "delete":
                    System.out.println("введите номер обекта");
                    int n = scanner.nextInt();
                    arrayList.remove(n);
                    for(Printable a : arrayList){
                        a.print();
                    }
                    break;
                default:
                    System.out.println("введите одно из предложенных");
            }
        }
    }
}
