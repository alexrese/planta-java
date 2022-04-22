/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planta;

/**
 *
 * @author Alex Rese
 */
public class Casa {

    private String cor;
    private int quarto;
    private int banheiro;
    private float valor;
    private int garagem;

    public Casa(String cor, int quarto, int banheiro, float valor, int garagem) {
        this.cor = cor;
        this.quarto = quarto;
        this.banheiro = banheiro;
        this.valor = valor;
        this.garagem = garagem;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the quarto
     */
    public int getQuarto() {
        return quarto;
    }

    /**
     * @param quarto the quarto to set
     */
    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    /**
     * @return the banheiro
     */
    public int getBanheiro() {
        return banheiro;
    }

    /**
     * @param banheiro the banheiro to set
     */
    public void setBanheiro(int banheiro) {
        this.banheiro = banheiro;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * @return the garagem
     */
    public int getGaragem() {
        return garagem;
    }

    /**
     * @param garagem the garagem to set
     */
    public void setGaragem(int garagem) {
        this.garagem = garagem;
    }
}
