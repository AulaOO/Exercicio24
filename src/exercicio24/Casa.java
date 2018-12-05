/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio24;

/**
 *
 * @author Luis Guilherme
 */
public class Casa {
    private String cor;
    private Porta porta1, porta2, porta3;

    public Casa() {
    }

    public Casa(String cor, Porta porta1, Porta porta2, Porta porta3) {
        this.cor = cor;
        this.porta1 = porta1;
        this.porta2 = porta2;
        this.porta3 = porta3;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Porta getPorta1() {
        return porta1;
    }

    public void setPorta1(Porta porta1) {
        this.porta1 = porta1;
    }

    public Porta getPorta2() {
        return porta2;
    }

    public void setPorta2(Porta porta2) {
        this.porta2 = porta2;
    }

    public Porta getPorta3() {
        return porta3;
    }

    public void setPorta3(Porta porta3) {
        this.porta3 = porta3;
    }
    
    
    
    public void pinta(String s){
        cor = s;
    }
    
    public int quantasPortasEstaoAbertas(){
        int conta = 0;
        if(porta1.estaAberta() == true){
            conta += 1;
        } 
        if(porta2.estaAberta() == true){
            conta += 1;
        }
        if(porta3.estaAberta() == true){
            conta += 1;
        }
        return conta;
    }
    
    public int totalDePortas(){
        return 3;
    }
}
