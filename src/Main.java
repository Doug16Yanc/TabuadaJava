import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        boolean valor = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao nosso sistema de tabuada de multiplicação de números");

        while (valor)
        {
            System.out.printf("Digite a opçao:\n1-Calcular\n2-Encerrar.\n");
            int opcao = scanner.nextInt();

            if (opcao == 1)
            {
                System.out.printf("Digite o número para que eu apresente a tabuada deste de 1 até 10:");
                int numero = scanner.nextInt();

                for (int contador = 1; contador < 11; contador++)
                {
                    int produto = 1;
                    produto = contador*numero;

                    System.out.printf("%s X %s = %s\n", numero, contador, produto);
                }
            }
            else if (opcao == 2)
            {
                break;
            }
        }
    }
}