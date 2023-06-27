import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveElogiarServicoLoja() {
        Cliente cliente = new Cliente();
        assertEquals("A Gerencia agradece seu contato.\nResposta ao elogio referente ao nosso serviço:\n" +
                        ">>A Loja agradece a mensagem: Ambiente agradavel",
                cliente.elogiarLoja("Ambiente agradavel"));
    }

    @Test
    void deveReclamarServicoLoja() {
        Cliente cliente = new Cliente();
        assertEquals("A Gerencia agradece seu contato.\nResposta a reclamação referente ao nosso serviço:\n" +
                        ">>A Loja vai procurar melhorar o serviço da reclamação: Demora no atendimento",
                cliente.reclamarLoja("Demora no atendimento"));
    }

    @Test
    void deveFazerPedido() {
        Cliente cliente = new Cliente();
        assertEquals("A Gerencia agradece seu pedido.\nRecebemos o seguinte pedido:\n" +
                        ">>Pedido realizado com sucesso: Tenis nike air max",
                cliente.fazerPedido("Tenis nike air max"));
    }

}