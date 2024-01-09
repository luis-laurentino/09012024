import java.util.*;

public class Input {
    public static void main(String[] args) {
        System.out.println("Digite o seu ano de nascimento e pressione Enter para confirmar");
        Scanner scnAno = new Scanner(System.in);
        int anoNascimento = scnAno.nextInt();
        System.out.println("Voce tem "+ (2024 - anoNascimento) + " anos");
        scnAno.close();


    }
}
