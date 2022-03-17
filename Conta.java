package RevisaoExercicios;
public class Conta {
//Atributos
    private float valor;
    private int conta;
    
public Conta(float valor, int conta){
    this.valor = valor;
    this.conta = conta;
}
       // MÃ©todos set e get
    public void setValor(float valor) {
        this.valor = valor;
    }
    public void setConta(int conta) {
        this.conta = conta;
    }   
    public float getValor() {
        return valor;
    }
    public int getConta() {
        return conta;
    }  
// Demais MÃ©todos
    public void Credita(float ValorCredito){
         this.valor = this.valor + ValorCredito;                
    }    
     public void debita(float ValorDebito){
         this.valor = this.valor - ValorDebito;
     }     
     public float ConsultaSaldo(){
         return this.valor;
    }
}

