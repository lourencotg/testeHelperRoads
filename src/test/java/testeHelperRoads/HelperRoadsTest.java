package testeHelperRoads;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

public class HelperRoadsTest {
	/*TesteRodando-------------------------------------------------------------------
    @Test
    public void testCadastrarMotoboy() {
        HelperRoads hr = new HelperRoads();
        hr.cadastrarMotoboy("João");
        List<String> motoboys = hr.listarMotoboys();
        assertEquals(1, motoboys.size());
        assertTrue(motoboys.contains("João"));
    }

    @Test
    public void testAdicionarOficina() {
        HelperRoads hr = new HelperRoads();
        hr.adicionarOficina("Oficina A");
        List<String> oficinas = hr.listarOficinas();
        assertEquals(1, oficinas.size());
        assertTrue(oficinas.contains("Oficina A"));
    }

    @Test
    public void testSelecionarOficina() {
        HelperRoads hr = new HelperRoads();
        hr.adicionarOficina("Oficina A");
        String resultado = hr.selecionarOficina("Oficina A");
        assertEquals("Oficina selecionada: Oficina A", resultado);
    }

    @Test
    public void testSelecionarOficinaNaoExistente() {
        HelperRoads hr = new HelperRoads();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            hr.selecionarOficina("Oficina B");
        });
        assertEquals("Oficina não encontrada.", exception.getMessage());
    }
    */
    //Teste falhando---------------------------------------------------------------
	
    @Test
    public void testCadastrarMotoboy() {
    HelperRoads hr = new HelperRoads();
    hr.cadastrarMotoboy("Carlos");
    List<String> motoboys = hr.listarMotoboys();
    assertEquals(1, motoboys.size());
    assertTrue(motoboys.contains("João"));
	}

    @Test
    public void testAdicionarOficina() {
    HelperRoads hr = new HelperRoads();
    hr.adicionarOficina("Oficina B");
    List<String> oficinas = hr.listarOficinas();
    assertEquals(1, oficinas.size());
    assertTrue(oficinas.contains("Oficina A"));
	}
    
    @Test
   public void testSelecionarOficina() {
    HelperRoads hr = new HelperRoads();
    // hr.adicionarOficina("Oficina A");
    String resultado = hr.selecionarOficina("Oficina A");
    assertEquals("Oficina selecionada: Oficina A", resultado);
	}
    
    @Test
    public String selecionarOficina(String nome, List<String> oficinas) {
    if (!oficinas.contains(nome)) {
        return "Nenhuma oficina encontrada.";
    }
    return "Oficina selecionada: " + nome;
	}

}
