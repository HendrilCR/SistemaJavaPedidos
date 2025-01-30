import java.util.Scanner;

public class Menu {
    private Scanner s1 ;
    private String op;
    
    Menu(){
        s1 = new Scanner(System.in);

        System.out.print("\nDigite uma opção:\n\t[Default] Testar Sistema\n\t[1] Criar Produto\n--> ");


        op = s1.nextLine();
        System.out.println(op);

        switch(op){
            case "1":
                break;
            default:
                Main.testar();
                break;

        }
    }
}
