package RevisaoExercicios;

public class DiarioClasse {
    private String nomeCurso; 
    private String nomeProfessor;
    
    // Método construtor
//public DiarioClasse(String nCurso, String nProfessor){    
    // Método
    public void apresentaMensagem(){
        System.out.println("Olá, seja bem-vindo ao curso " + nomeCurso + 
                " Sob a responsabilidade do(a) professor(a) " + nomeProfessor);
            }    
   // Método set e get de nomeCurso
    public void setNomeCurso(String nCurso){
        nomeCurso = nCurso;
    }
    public String getNomeCurso(){
        return nomeCurso;
    }
    public void setNomeProfessor(String nProfessor){
        nomeProfessor = nProfessor;
    }
    public String getNomeProfessor(){
        return nomeProfessor;
    }
}
