import java.util.Arrays;
import java.util.List;

public class Carga implements  ICarga {

    private int codigo;
    private String tipoCarga;
    private String origem;
    private String destino;
    private Float valorTotal;

    public Carga (int codigo){
        this.codigo = codigo;
        Carga object = BD.getCarga(codigo);
        this.tipoCarga = object.tipoCarga;
        this.origem = object.origem;
        this.destino = object.destino;
        this.valorTotal = object.valorTotal;
    }

    public Carga(int codigo, String tipoCarga, String origem, String destino, Float valorTotal) {
        this.codigo = codigo;
        this.tipoCarga = tipoCarga;
        this.origem = origem;
        this.destino = destino;
        this.valorTotal = valorTotal;
    }

    public Integer getCodigo(){
        return this.codigo;
    }

    @Override
    public List<String> obterDadosCarga() {
        return Arrays.asList(this.tipoCarga, this.origem, this.destino);
    }

    @Override
    public Float obterValorCarga(Funcionario funcionario) {
        return this.valorTotal;
    }
}
