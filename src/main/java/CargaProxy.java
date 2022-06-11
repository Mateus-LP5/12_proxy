import java.util.List;

public class CargaProxy implements ICarga {

    private Carga carga;

    private Integer codigo;

    public CargaProxy(Integer codigo) {
        this.codigo = codigo;
    }

    @Override
    public List<String> obterDadosCarga() {
        if (this.carga == null) {
            this.carga = new Carga(this.codigo);
        }
        return this.carga.obterDadosCarga();
    }

    @Override
    public Float obterValorCarga(Funcionario funcionario) {
        if (!funcionario.isAdmin()) {
            throw new IllegalArgumentException("Funcionário não autorizado.");
        }
        if (this.carga == null) {
            this.carga = new Carga(this.codigo);
        }
        return this.carga.obterValorCarga(funcionario);
    }
}
