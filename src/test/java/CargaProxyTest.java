import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CargaProxyTest {

    @BeforeEach
    void setUp() {
        BD.addCarga(new Carga(1, "Móveis", "Juiz de Fora", "Rio de Janeiro", 40000.0f));
        BD.addCarga(new Carga(2, "Eletrodomésticos", "Vitória", "Maringá", 67500.0f));
    }

    @Test
    void deveRetornarDadosdaCarga() {
        CargaProxy carga = new CargaProxy(1);

        assertEquals(Arrays.asList("Móveis", "Juiz de Fora", "Rio de Janeiro"), carga.obterDadosCarga());
    }

    @Test
    void deveRetonarValorTotalCarga() {
        Funcionario funcionario = new Funcionario("John Wick", true);
        CargaProxy carga = new CargaProxy(2);

        assertEquals(67500.0f, carga.obterValorCarga(funcionario));
    }

    @Test
    void deveRetonarExcecaoFuncionarioNaoAutorizadoConsultarValorTotalCarga() {
        try {
            Funcionario funcionario = new Funcionario("John Strong", false);
            CargaProxy carga = new CargaProxy(2);

            carga.obterValorCarga(funcionario);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Funcionário não autorizado.", e.getMessage());
        }
    }

}