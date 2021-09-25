package tarefa.pkg6.estrutura.de.dados.recursao;

/**
 *
 * @author Felipe
 */
public class Exercicio1_TGT2 {
    public String aprovaEmprestimo(int mtInSalario, String mtInBomPag, String mtInCasoEsp){
        
        String mtOutResp = "";
        
        if (mtInSalario > 1000 || mtInBomPag == "Sim" || mtInCasoEsp == "Sim"){
            mtOutResp = "Emprestimo Valido";
        }
        else if (mtInSalario <= 1000 && mtInBomPag == "Nao" && mtInCasoEsp == "Nao"){
            mtOutResp = "Emprestimo Invalido";
        }
        
        return mtOutResp;
    }   
}
