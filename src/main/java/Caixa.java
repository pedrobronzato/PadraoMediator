public class Caixa implements Loja{
    private static Caixa instancia = new Caixa();

    private Caixa() {}

    public static Caixa getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "A Loja vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "A Loja agradece a mensagem: " + mensagem;
    }

    public String receberPedido(String pedido) {
        return "Pedido realizado com sucesso: " + pedido;
    }
}
