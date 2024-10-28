public class MiniChatbot {
    public String nome;

    public MiniChatbot() {
        this.nome = "MiniChatbot";
    }

    public String saudacao() {
        return "Olá! Como posso ajudar?";
    }

    public String responderNome() {
        return "Eu sou o " + this.nome + ", seu assistente virtual!";
    }

    public String comoEsta() {
        return "Estou funcionando perfeitamente, obrigado!";
    }

    public String respostaPadrao() {
        return "Desculpe, não entendi sua pergunta. Pode refazer?";
    }

    public String responder(String entradaUsuario) {
        entradaUsuario = entradaUsuario.toLowerCase();

        if (entradaUsuario.contains("oi") || entradaUsuario.contains("olá")) {
            return saudacao();
        } else if (entradaUsuario.contains("qual é o seu nome") || entradaUsuario.contains("seu nome")) {
            return responderNome();
        } else if (entradaUsuario.contains("como você está")) {
            return comoEsta();
        } else {
            return respostaPadrao();
        }
    }
}
