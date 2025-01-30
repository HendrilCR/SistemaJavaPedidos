import java.util.Scanner;

public class Menu {
    private Scanner s1 ;
    private String op;
    
    Menu(){
        s1 = new Scanner(System.in);

        System.out.print("\nDigite uma opção:\n\t[Default] Testar Sistema\n--> ");


        op = s1.nextLine();
        System.out.println(op);

        switch(op){
            default:
                Main.testar();
                break;

        }
    }
}
