package ch04.Exer04_18;

public class Conta {
    private int numero;
    private int saldoInicial;
    private int totalCompra;
    private int totalCredito;
    private int limiteCredito;
    
    public Conta(int n, int s, int tcomp, int tcred, int lm){
        this.numero = n;
        this.saldoInicial = s;
        this.totalCompra = tcomp;
        this.totalCredito = tcred;
        this.limiteCredito = lm;
    }
    
    public void setNumero( int numero){
        this.numero = numero;
    }
    
    public int getNumero(){ return numero;}
    
    public void setSaldoInicial(int saldoInicial){
        this.saldoInicial = saldoInicial;
    }
    
    public int getSaldoInicial(){ return saldoInicial;}
    
    public void setTotalCompra(int totalCompra){
        this.totalCompra = totalCompra;
    }
    
    public int getTotalCompra(){ return totalCompra;}
    
    public void setTotalCredito(int totalCredito){
        this.totalCredito = totalCredito;
    }
    
    public int getTotalCredito(){ return totalCredito;}
    
    public void setLimiteCredito(int limiteCredito){
        this.limiteCredito = limiteCredito;
    }
    
    public int getLimiteCredito(){ return limiteCredito;}
    
    public void novoSaldo(){
        saldoInicial = saldoInicial + totalCompra - totalCredito;
        if( totalCompra > totalCredito){   
            System.out.println("Limite de credito excedido!");
        }
        
    }
    
    
}
