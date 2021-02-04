package SegundoTeste;

public class VideoGame extends Produto implements Imposto{

    private String marca;
    private String modelo;
    private boolean isUsado;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isUsado() {
        return isUsado;
    }

    public void setUsado(boolean usado) {
        isUsado = usado;
    }

    public VideoGame(){}

    public VideoGame(String nome, Double preco, int qtd, String marca, String modelo, boolean isUsado){
        super.setNome(nome);
        super.setPreco(preco);
        super.setQtd(qtd);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }

    @Override
    public double calculaImposto() {
        if(isUsado){
            return ((getPreco() * 25) / 100);
        }else{
            return ((getPreco() * 45) / 100);
        }
    }
}
