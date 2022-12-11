import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Digite um outro numero: ");
        Scanner sca = new Scanner(System.in);
        int y = sca.nextInt();
        System.out.println("Digite mais um numero: ");
        Scanner scan = new Scanner(System.in);
        int z = scan.nextInt();
        
        sc.close();
        sca.close();
        scan.close();

        int soma = x + y + z;

        System.out.println("A soma dos 3 numeros eh = " + soma);
    }
}