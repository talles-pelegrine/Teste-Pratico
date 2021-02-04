package PrimeiroTeste;

import java.text.DecimalFormat;
import java.text.Normalizer;
import java.util.Scanner;

public class FormulaBhaskara {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Double valorA, valorB, valorC;
        System.out.print("A = ");
        valorA = input.nextDouble();
        input.nextLine();

        System.out.print("B = ");
        valorB = input.nextDouble();
        input.nextLine();

        System.out.print("C = ");
        valorC = input.nextDouble();
        input.nextLine();

        input.close();

        Double x1 = calcularBhaskaraAdicao(valorA,valorB,valorC);
        Double x2 = calcularBhaskaraSubtracao(valorA,valorB,valorC);

        if(x1 > -1.00){
            System.out.printf("X1 = %.5f\n", x1);
            System.out.printf("X2 = %.5f", x2);
        }else{
            System.out.println("Impossivel calcular.");
        }
    }

    public static Double calcularBhaskaraAdicao(Double valorA, Double valorB, Double valorC){
        final Double raiz = (valorB * valorB) - (4 * valorA * valorC);
        if(Math.sqrt(raiz) > 0 ) {
            Double resultado = ((-valorB + Math.sqrt(raiz)) / (2 * valorA));
            return resultado;
        }
        return -1.00;
    }

    public static Double calcularBhaskaraSubtracao(Double valorA, Double valorB, Double valorC){
        final Double raiz = (valorB * valorB) - (4 * valorA * valorC);
        if(Math.sqrt(raiz) > 0 ) {
            Double resultado = ((-valorB - Math.sqrt(raiz)) / (2 * valorA));
            return resultado;
        }
        return -1.00;
    }
}
