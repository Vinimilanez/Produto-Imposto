package br.com.satc;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("0.00");
        Scanner entrada = new Scanner(System.in); 
        float val1;
        System.out.println("Qual o valor do produto.");
        val1 = entrada.nextFloat();
        System.out.println("O produto e nacional?\n"
                + "Sim ou não");
        String nasci = entrada.next();
        if (nasci.toUpperCase().equals("SIM")) {
            if (val1 < 1000) {
                double resppag1 = val1 * 0.10;
                System.out.println("Paga-se:" + resppag1 + " reais de imposto.\n"
                        + "E do preoduto è:" + (val1 - resppag1) + ".");
            } else if (val1 >= 1000) {
                double resppag = (val1 * 0.15);
                System.out.println("Paga-se:" + resppag + " reais de imposto \n"
                        + " e o valor do produto sem imposto " + (val1 - resppag) + ".");
            }
        } else if (nasci.toUpperCase().equals("NAO")) {
            double resppag3 = (val1 * 0.5);
            System.out.println("Paga-se" + resppag3 + " de imposto.\n"
                    + "O valor do produto sem imposto é:\n"
                    + "" + (val1 - resppag3) + ".");
        }
    }

}
