import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MiniChatbot chatbot = new MiniChatbot();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Eu sou o MiniChatbot. Como posso te ajudar hoje?");

        while (true) {
            System.out.print("Usuário: ");
            String entradaUsuario = scanner.nextLine();

            if (entradaUsuario.equalsIgnoreCase("sair")) {
                System.out.println("MiniChatbot: Tchau! Até a próxima.");
                break;
            }

            String resposta = chatbot.responder(entradaUsuario);
            System.out.println("MiniChatbot: " + resposta);
        }

        scanner.close();
    }
}
