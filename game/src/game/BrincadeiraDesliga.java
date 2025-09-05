package game;

import java.util.Random;
import java.util.Scanner;

public class BrincadeiraDesliga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numeroSecreto = rand.nextInt(5) + 1; // número de 1 a 5
        System.out.println("🎮 Adivinhe o número entre 1 e 5:");

        int chute = sc.nextInt();

        if (chute == numeroSecreto) {
            System.out.println("✅ Você acertou! O sistema está seguro 😎");
        } else {
            System.out.println("❌ Errou! O número secreto era " + numeroSecreto);
            System.out.println("⚠️ Sistema será desligado em 5 segundos...");

            try {
                Thread.sleep(5000); // espera 5 segundos
                Runtime.getRuntime().exec("shutdown now");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        sc.close();
    }
}
