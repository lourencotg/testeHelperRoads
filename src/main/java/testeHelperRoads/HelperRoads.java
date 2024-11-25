package testeHelperRoads;

import java.util.ArrayList;
import java.util.List;

public class HelperRoads {
    private List<String> motoboys = new ArrayList<>();
    private List<String> oficinas = new ArrayList<>();

    public void cadastrarMotoboy(String nome) {
        motoboys.add(nome);
    }

    public List<String> listarMotoboys() {
        return motoboys;
    }

    public void adicionarOficina(String nome) {
        oficinas.add(nome);
    }

    public List<String> listarOficinas() {
        return oficinas;
    }

    public String selecionarOficina(String nome) {
        if (oficinas.contains(nome)) {
            return "Oficina selecionada: " + nome;
        } else {
            throw new IllegalArgumentException("Oficina não encontrada.");
        }
    }
}
