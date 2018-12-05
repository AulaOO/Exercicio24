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
public class Edificio {
    private String cor;
    private int totalDePortas;
    private int totalDeAndares;
    private Porta portas[];

    public Edificio() {
    }

    public Edificio(String cor, int totalDePortas, int totalDeAndares, Porta[] portas) {
        this.cor = cor;
        this.totalDePortas = totalDePortas;
        this.totalDeAndares = totalDeAndares;
        this.portas = portas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTotalDePortas() {
        return totalDePortas;
    }

    public void setTotalDePortas(int totalDePortas) {
        this.totalDePortas = totalDePortas;
    }

    public int getTotalDeAndares() {
        return totalDeAndares;
    }

    public void setTotalDeAndares(int totalDeAndares) {
        this.totalDeAndares = totalDeAndares;
    }

    public Porta[] getPortas() {
        return portas;
    }

    public void setPortas(Porta[] portas) {
        this.portas = portas;
    }
    
    public void pinta(String s){
        cor = s;
    }
    
    public void adicionaPorta(Porta p){
        for(int i = 0; i < 6; i ++){
        portas[i] = p;
    }
    }
}
