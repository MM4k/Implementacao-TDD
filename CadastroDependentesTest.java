
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import app.IRPF;

public class CadastroDependentesTest{
	private IRPF irpf;

	@Before
	public void setup(){
	irpf = new IRPF();
    }

    @Test
    public void testCadastrarUmDependente(){
        irpf.cadastrarDependente(“João”);
        assertEquals(189.59f, irpf.getDeducaoDependentes(), 0);
    }

    @Test
    public void testCadastrarDoisDependentes(){
        irpf.cadastrarDependente(“João”);
    irpf.cadastrarDependente(“Maria”);
        assertEquals(2 * 189.59f, irpf.getDeducaoDependentes(), 0);
    }

    @Test
    public void testCadastrarTresDependentes(){
        irpf.cadastrarDependente(“João”);
    irpf.cadastrarDependente(“Maria”);
    irpf.cadastrarDependente(“José”);
        assertEquals(3 * 189.59f, irpf.getDeducaoDependentes(), 0);
    }

    @Test
    public void testCadastrarCincoDependentes(){
        irpf.cadastrarDependente(“João”);
    irpf.cadastrarDependente(“Maria”);
    irpf.cadastrarDependente(“José”);
    irpf.cadastrarDependente(“Maria José”);
    irpf.cadastrarDependente(“José Maria”);
        assertEquals(5 * 189.59f, irpf.getDeducaoDependentes(), 0);
    }
}
