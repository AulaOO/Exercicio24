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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Porta porta = new Porta();
        porta.setAberta(true);
        verifica(porta);
        porta.setAberta(false);
        verifica(porta);
        porta.setCor("Azul");
        System.out.println("Cor: " + porta.getCor());
        porta.setCor("Amarelo");
        System.out.println("Cor: " + porta.getCor());
        porta.setCor("Vermelho");
        System.out.println("Cor: " + porta.getCor());
        porta.setDimensaoX(12.4);
        porta.setDimensaoY(23.4);
        porta.setDimensaoZ(32.1);
        System.out.println("As dimensões são: X = " + porta.getDimensaoX() + ", Y = " + porta.getDimensaoY() + ", Z: " + porta.getDimensaoZ());
        Porta porta1 = new Porta();
        porta1.setAberta(true);
        Casa casa = new Casa();
        casa.setPorta1(porta1);
        Porta porta2 = new Porta();
        porta2.setAberta(false);
        casa.setPorta2(porta2);
        Porta porta3 = new Porta();
        porta3.setAberta(true);
        casa.setPorta3(porta3);
        System.out.println("A quantidade de portas abertas é: " + casa.quantasPortasEstaoAbertas());
        
    }

    private static void verifica(Porta porta) {
        if(porta.estaAberta() == true){
            System.out.println("A porta está aberta");
        }else{
            System.out.println("A porta está fechada");
        }
    }
    
}
