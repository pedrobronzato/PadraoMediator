public class Pessoa {

    public String elogiarLoja(String mensagem) {
        return Gerencia.getInstancia().receberElogioServico(mensagem);
    }

    public String reclamarLoja(String mensagem) {
        return Gerencia.getInstancia().receberReclamacaoServico(mensagem);
    }

    public String fazerPedido(String pedido) {
        return Gerencia.getInstancia().receberPedidoProduto(pedido);
    }


}
