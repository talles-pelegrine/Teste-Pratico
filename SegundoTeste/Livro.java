package SegundoTeste;

public class Livro extends Produto implements Imposto{
    private String autor;
    private String tema;
    private int qtdPag;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getQtdPag() {
        return qtdPag;
    }

    public void setQtdPag(int qtdPag) {
        this.qtdPag = qtdPag;
    }

    public Livro(){}

    public Livro(String nome, Double preco, int qtd,String autor, String tema, int qtdPag){
        super.setNome(nome);
        super.setPreco(preco);
        super.setQtd(qtd);
        this.autor = autor;
        this.tema = tema;
        this.qtdPag = qtdPag;
    }

    @Override
    public double calculaImposto() {
        if(tema == "educativo"){
            return 0;
        }else{
            return ((getPreco() * 10) / 100);
        }
    }
}
