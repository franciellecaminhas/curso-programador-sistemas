package RevisaoExercicios;
import java.util.Scanner;
public class Curso {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DiarioClasse dc1 = new DiarioClasse();
        
        System.out.println("Nome do curso: ");
        dc1.setNomeCurso(input.nextLine());
        
        System.out.println("Nome do professor: ");
        dc1.setNomeProfessor(input.nextLine());
        
        dc1.apresentaMensagem();
        
    }
    
}
