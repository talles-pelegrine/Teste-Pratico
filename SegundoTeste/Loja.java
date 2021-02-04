package SegundoTeste;

import java.util.List;

public class Loja {
    private String nome;
    private String cnpj;
    private List<Livro> livros;
    private List<VideoGame> videoGames;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<VideoGame> getVideoGames() {
        return videoGames;
    }

    public void setVideoGames(List<VideoGame> videoGames) {
        this.videoGames = videoGames;
    }

    public Loja(){}

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames){
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGames;
    }

    public void listaLivros(){
        if(livros.toArray().length > 0){
            for(int i=0; i < livros.toArray().length; i++){
                System.out.println(livros.toArray()[i]);
            }
        }else{
            System.out.println("A loja não tem livros no seu estoque");
        }
    }

    public void listaVideoGames(){
        if(videoGames.toArray().length > 0){
            for(int i=0; i < videoGames.toArray().length; i++){
                System.out.println(videoGames.toArray()[i]);
            }
        }else{
            System.out.println("A loja não tem videogames no seu estoque");
        }
    }

    public Double calculaPatrimonio(){
        Double somaVideoGames;
        Double somaLivros;
        for(int i=0; i < videoGames.toArray().length; i++){
        }
        return null;
    }
}
