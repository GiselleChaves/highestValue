import java.util.Scanner;


public class Exercicio2 {
  /**
   * 2. Faça um programa que leia 3 valores e determine o maior deles. Use um método para 
   * encontrar o maior valor.
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double n1, n2, n3, maior;

    System.out.println("Informe três valores reais");
    n1 = in.nextDouble();
    n2 = in.nextDouble();
    n3 = in.nextDouble();

    maior = maiorValor(n1, n2, n3);
    System.out.printf("O maior valor é: %.2f ", maior);
    
    System.out.printf("\n.::Fim da Execução::.");
    in.close();
  }

  public static double maiorValor(double valor1, double valor2, double valor3){
    if(valor1 > valor2 && valor1 > valor3){
      return valor1;
    }else if(valor2 > valor1 && valor2 > valor3){
      return valor2;
    }else 
      return valor3;
    }
  }

