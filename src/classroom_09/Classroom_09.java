package classroom_09;

import java.time.LocalDate;

public class Classroom_09 {//Classe principal que dá nome ao arquivo é, obrigatóriamente, declarada com a privacidade

    public static void main(String[] args) {
        //POO - Programação Orientada à Objetos

        Animal cao = new Animal("Yoshi", "Poodle", "Uivo");

        Animal et = new Animal("Predator");

        Animal bixo = new Animal();

        Animal b1 = new Animal(10);
        Animal b2 = new Animal(11);

        System.out.println(b1.nome + " " + b2.nome);

        Veiculo v1 = new Veiculo("Fiesta", 2005, "Prata", "azn1554");

        System.out.println("Modelo: " + v1.getModelo());
        v1.setModelo("Fiat Uno");
        System.out.println("Modelo: " + v1.getModelo());
    }

}

class Animal {// Classes auxiliares (são vistas apenas nesse pacote)

    String nome;
    String raca;
    String som;

    Animal(String nome, String raca, String som) {
        this.nome = nome;
        this.raca = raca;
        this.som = som;
    }

    Animal() {
    }

    ;// construtor padrão
    
    Animal(int valor) {
        if (valor > 10) {
            this.nome = "Rex";
            this.raca = "Bulldog";
            this.som = "Late";
        } else {
            this.nome = "Bola";
            this.raca = "Gato";
            this.som = "Mia";
        }
    }

    Animal(String nome) {
        this.nome = nome;
        this.raca = "indefinido";
        this.som = "indefinido";
    }
}

class Pessoa {

    String nome;
    LocalDate nascimento;
    String genero;

    public Pessoa(String nome, LocalDate nascimento, String genero) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.genero = genero;
    }

    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

}

class Veiculo {

    private String modelo;
    private int ano;
    private String cor;
    private String placa;

    public Veiculo() {
    }

    public Veiculo(String modelo, int ano, String cor, String placa) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

}
