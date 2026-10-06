package com.example;

import java.util.Scanner;

public class VetoresEMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 1 - Produção de Milho por Semana
        double[] producaoMilho = new double[7];
        double totalMilho = 0;
        double maiorMilho = 0;

        for (int i = 0; i < producaoMilho.length; i++) {
            System.out.print("Digite a produção em toneladas da Semana " + (i + 1) + ": ");
            producaoMilho[i] = scanner.nextDouble();
            totalMilho += producaoMilho[i];

            if (i == 0 || producaoMilho[i] > maiorMilho) {
                maiorMilho = producaoMilho[i];
            }
        }

        double mediaMilho = totalMilho / producaoMilho.length;
        System.out.println("Produção Total: " + totalMilho + " toneladas");
        System.out.println("Média Semanal: " + mediaMilho + " toneladas");
        System.out.println("Maior Produção Registrada: " + maiorMilho + " toneladas");


        // Exercício 2 - Temperatura em Estufa
        double[] temperaturas = new double[10];
        int diasAcima30 = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Digite a temperatura do Dia " + (i + 1) + " (°C): ");
            temperaturas[i] = scanner.nextDouble();

            if (temperaturas[i] > 30.0) {
                diasAcima30++;
            }
        }

        System.out.println("Quantidade de dias com temperatura acima de 30°C: " + diasAcima30);


        // Exercício 3 - Consumo de Água na Irrigação
        System.out.println("=== Exercício 3: Consumo de Água na Irrigação ===");
        double[] consumoAgua = new double[12];
        int setorMaiorConsumo = 0;
        double maiorConsumo = 0;

        for (int i = 0; i < consumoAgua.length; i++) {
            System.out.print("Digite o consumo de água do Setor " + (i + 1) + " (litros): ");
            consumoAgua[i] = scanner.nextDouble();

            if (i == 0 || consumoAgua[i] > maiorConsumo) {
                maiorConsumo = consumoAgua[i];
                setorMaiorConsumo = i + 1;
            }
        }

        System.out.println("O setor que mais consumiu água foi o Setor " + setorMaiorConsumo + " (" + maiorConsumo + " litros)");


        // Exercício 4 - Produção de Hortaliças por Talhão
        double[] hortalicas = new double[5];
        double totalHortalicas = 0;

        for (int i = 0; i < hortalicas.length; i++) {
            System.out.print("Digite a produção do Talhão " + (i + 1) + " (kg): ");
            hortalicas[i] = scanner.nextDouble();
            totalHortalicas += hortalicas[i];
        }

        System.out.println("\n--- Resumo da Produção por Talhão ---");
        for (int i = 0; i < hortalicas.length; i++) {
            System.out.println("Talhão " + (i + 1) + ": " + hortalicas[i] + " kg");
        }
        System.out.println("Total Geral Produzido: " + totalHortalicas + " kg");


        // Exercício 5 - Umidade do Solo
        double[] umidadeSolo = new double[8];
        int umidadeBaixa = 0;

        for (int i = 0; i < umidadeSolo.length; i++) {
            System.out.print("Digite a umidade da Área " + (i + 1) + " (%): ");
            umidadeSolo[i] = scanner.nextDouble();

            if (umidadeSolo[i] < 40.0) {
                umidadeBaixa++;
            }
        }

        System.out.println("Quantidade de áreas com umidade inferior a 40%: " + umidadeBaixa);


        // Exercício 6 - Produção Agrícola por Mês e Cultura
        double[][] producaoCulturas = new double[4][3]; // 4 meses x 3 culturas
        double[] totalPorCultura = new double[3];

        for (int mes = 0; mes < 4; mes++) {
            System.out.println("--- Mês " + (mes + 1) + " ---");
            for (int cultura = 0; cultura < 3; cultura++) {
                System.out.print("Produção da Cultura " + (cultura + 1) + ": ");
                producaoCulturas[mes][cultura] = scanner.nextDouble();
                totalPorCultura[cultura] += producaoCulturas[mes][cultura];
            }
        }

        System.out.println("\n--- Produção Total por Cultura ---");
        for (int cultura = 0; cultura < 3; cultura++) {
            System.out.println("Cultura " + (cultura + 1) + ": " + totalPorCultura[cultura]);
        }


        // Exercício 7 - Monitoramento de Chuvas
        double[][] chuvas = new double[7][4]; // 7 dias x 4 áreas
        double[] totalChuvaArea = new double[4];

        for (int dia = 0; dia < 7; dia++) {
            System.out.println("--- Dia " + (dia + 1) + " ---");
            for (int area = 0; area < 4; area++) {
                System.out.print("Chuva na Área " + (area + 1) + " (mm): ");
                chuvas[dia][area] = scanner.nextDouble();
                totalChuvaArea[area] += chuvas[dia][area];
            }
        }

        System.out.println("\n--- Total de Chuva por Área ---");
        for (int area = 0; area < 4; area++) {
            System.out.println("Área " + (area + 1) + ": " + totalChuvaArea[area] + " mm");
        }


        // Exercício 8 - Controle de Pragas
        int[][] pragas = new int[5][5];
        int maiorFocos = -1;
        int linhaMaior = 0;
        int colunaMaior = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Focos na região [" + i + "][" + j + "]: ");
                pragas[i][j] = scanner.nextInt();

                if (pragas[i][j] > maiorFocos) {
                    maiorFocos = pragas[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        System.out.println("Região com maior quantidade de focos: Linha " + linhaMaior + ", Coluna " + colunaMaior + " (Total: " + maiorFocos + " focos)");


        // Exercício 9 - Mapa de Fertilidade do Solo
        double[][] fertilidade = new double[6][6];

        for (int i = 0; i < 6; i++) {
            System.out.println("--- Preenchendo a Linha " + i + " ---");
            for (int j = 0; j < 6; j++) {
                System.out.print("Índice de fertilidade na posição [" + i + "][" + j + "]: ");
                fertilidade[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\n--- Média de Fertilidade de Cada Linha ---");
        for (int i = 0; i < 6; i++) {
            double somaLinha = 0;
            for (int j = 0; j < 6; j++) {
                somaLinha += fertilidade[i][j];
            }
            double mediaLinha = somaLinha / 6;
            System.out.println("Média da Linha " + i + ": " + mediaLinha);
        }

        
        // Exercício 10 - Produção de Frutas por Pomar
        double[][] pomares = new double[4][12];
        double maiorProducaoAnual = -1;
        int pomarCampeao = 0;

        for (int pomar = 0; pomar < 4; pomar++) {
            double totalAnualPomar = 0;
            System.out.println("--- Registrando dados para o Pomar " + (pomar + 1) + " ---");
            for (int mes = 0; mes < 12; mes++) {
                System.out.print("Produção no Mês " + (mes + 1) + ": ");
                pomares[pomar][mes] = scanner.nextDouble();
                totalAnualPomar += pomares[pomar][mes];
            }

            if (totalAnualPomar > maiorProducaoAnual) {
                maiorProducaoAnual = totalAnualPomar;
                pomarCampeao = pomar + 1;
            }
        }

        System.out.println("\nO pomar com maior produção anual foi o Pomar " + pomarCampeao + " com total de " + maiorProducaoAnual + " unidades/toneladas.");

        scanner.close();
    }
}