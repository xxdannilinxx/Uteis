package com.impostoderenda.xxdannilinxx;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        /**
         * variáveis e faixas
         */
        DecimalFormat df = new DecimalFormat("R$ ###,##0.00");
        DecimalFormat ds = new DecimalFormat("#,##%");
        Scanner sc = new Scanner(System.in);
        double salario;
        double IR = 0;
        double AE = 0;
        int faixa = 0;
        /**
         *  Início da execução com o salário
         *
         */
        System.out.println("/**************************************************************/");
        System.out.println("Número   Faixa de Renda             Alíquota   Valor cheio");
        System.out.println("1ª       Até 1.903,98               Isento     R$ 0,00");
        System.out.println("2ª       De 1.903,99 até 2.826,65   7,5        69,20");
        System.out.println("3ª       De 2.826,66 até 3.751,05   15         138,66");
        System.out.println("4ª       De 3.751,06 até 4.664,68   22,5       205,57");
        System.out.println("5ª       Acima de 4.664,68          27,5       Calcular o imposto pela alíquota");
        System.out.println("/**************************************************************/");
        System.out.println("Por favor, digite o valor do seu salário: ");
        salario = sc.nextDouble();
        /**
         * Regras de negócios
         */
        if (salario <= 1903.98) {
            System.out.println("Salários de até " + df.format(1903.98) + " são isentos de imposto de renda.");
            return;
        } else if ((salario >= 1903.99) && (salario <= 2826.65)) {
            IR = ((salario - 1903.98) * 7.5/100);
            AE = ((IR / salario) * 100);
            faixa = 2;
        } else if ((salario >= 2826.66) && (salario <= 3751.05)) {
            IR = (69.20 + (salario - 2826.65) * 15/100);
            AE = ((IR / salario) * 100);
            faixa = 3;
        } else if ((salario >= 3751.06) && (salario <= 4664.68)) {
            IR = (69.20 + 138.66 + (salario - 3751.05) * 22.5/100);
            AE = ((IR / salario) * 100);
            faixa = 4;
        } else {
            IR = (69.20 + 138.66 + 205.57 + (salario - 4664.68) * 27.5/100);
            AE = ((IR / salario) * 100);
            faixa = 5;
            }
            System.out.println("O imposto de renda para o salário de " + df.format(salario) + " é " + df.format(IR) + " e está na faixa" + faixa + " (Alíquota efetiva " + ds.format(AE) + ").");
            System.out.println("Para mais informações, consulte a tabela acima, obrigado!");
        }
}
