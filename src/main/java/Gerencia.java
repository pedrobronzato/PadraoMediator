public class Gerencia {

    private static Gerencia instancia = new Gerencia();

    private Gerencia(){}

    public static Gerencia getInstancia(){
        return instancia;
    }

    public String receberElogioServico(String mensagem) {
        return "A Gerencia agradece seu contato.\n"+
                "Resposta ao elogio referente ao nosso serviço:\n" +
                ">>" + Caixa.getInstancia().receberElogio(mensagem);
    }


    public String receberReclamacaoServico(String mensagem) {
        return "A Gerencia agradece seu contato.\n"+
                "Resposta a reclamação referente ao nosso serviço:\n" +
                ">>" + Caixa.getInstancia().receberReclamacao(mensagem);
    }

    public String receberPedidoProduto(String produto){
        return "A Gerencia agradece seu pedido.\n"+
                "Recebemos o seguinte pedido:\n" +
                ">>" + Caixa.getInstancia().receberPedido(produto);
    }



}
