import java.util.*;
public class ConvertVar {
    public static void main(String[] args) {
        try {
            System.out.println("Digite apenas um número de 0 a 9");
            Scanner scnNum = new Scanner(System.in);
            int intVar = Integer.valueOf(scnNum.nextLine());
            System.out.println("O número digitado é: " + intVar);
            scnNum.close();
        } catch (Exception e) {
            System.out.println("Ops! Você não digitou um número. Tente novamente");
        }
    }
}