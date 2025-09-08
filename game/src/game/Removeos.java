package game;


import java.util.Scanner;

public class Removeos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("🎮 Bem-vindo ao Jogo do Hack do Sistema!");
        System.out.println("Tente adivinhar o número secreto de 1 a 5.");

        int numeroSecreto = (int)(Math.random() * 5) + 1;
        System.out.print("Digite seu chute: ");
        int chute = sc.nextInt();

        if (chute == numeroSecreto) {
            System.out.println("✅ Parabéns! Você acertou o número secreto.");
            System.out.println("O sistema está seguro 😎");
        } else {
            System.out.println("❌ Errou! Número secreto era: " + numeroSecreto);
            System.out.println("⚠️ ALERTA: Sistema será destruído em breve...");
            
            try {
                for (int i = 5; i >= 1; i--) {
                    System.out.println(i + "...");
                    Thread.sleep(1000);
                }

                // Simulação de “apagando arquivos”
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Apagando arquivo crítico " + i + "...");
                    Thread.sleep(500);
                }

                System.out.println("\n💀 TUDO DELETADO");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        sc.close();
    }
}
