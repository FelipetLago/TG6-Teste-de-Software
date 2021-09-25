package tarefa.pkg6.estrutura.de.dados.recursao;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Felipe
 */
public class Exercicio1_TGT2Test {
    Exercicio1_TGT2 emprestimo;
            
    public Exercicio1_TGT2Test() {
        emprestimo = new Exercicio1_TGT2();
    }

    @Test
    public void testEmprestimoValido() {
        System.out.println("Teste do Emprestimo VALIDO");
        
        assertEquals("Emprestimo Valido", emprestimo.aprovaEmprestimo(1001, "Sim", "Sim"));
        assertEquals("Emprestimo Valido", emprestimo.aprovaEmprestimo(1100, "Sim", "Nao"));
        assertEquals("Emprestimo Valido", emprestimo.aprovaEmprestimo(1500, "Nao", "Sim"));
        assertEquals("Emprestimo Valido", emprestimo.aprovaEmprestimo(2000, "Nao", "Nao"));
        assertEquals("Emprestimo Valido", emprestimo.aprovaEmprestimo(900, "Sim", "Sim"));
        assertEquals("Emprestimo Valido", emprestimo.aprovaEmprestimo(800, "Sim", "Nao"));
        assertEquals("Emprestimo Valido", emprestimo.aprovaEmprestimo(750, "Nao", "Sim"));
        assertEquals("Emprestimo Invalido", emprestimo.aprovaEmprestimo(500, "Nao", "Nao"));
        
    }
    
    @Test
    public void testEmprestimoInvalido() {
        System.out.println("Teste do Emprestimo Invalido");
        
        assertEquals("Emprestimo Valido", emprestimo.aprovaEmprestimo(1001, "Nao", "Nao"));
        assertEquals("Emprestimo Valido", emprestimo.aprovaEmprestimo(1002, "Nao", "Nao"));
        assertEquals("Emprestimo Invalido", emprestimo.aprovaEmprestimo(1000, "Nao", "Nao"));
        assertEquals("Emprestimo Invalido", emprestimo.aprovaEmprestimo(999, "Nao", "Nao"));
    }
 
}
