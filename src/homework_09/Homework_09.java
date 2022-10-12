package homework_09;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Homework_09 {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Junior Cezar", LocalDate.of(1993, 2, 3), "Masculino", 69, 1.74);
        Aluno a2 = new Aluno("Amber Santana", LocalDate.of(2000, 11, 3), "Feminino", 69, 1.70);

        System.out.println("Nome: " + a1.getNome()
                + "\nNascimento: " + a1.getNascimento()
                + "\nIdade :" + +a1.getIdade() + " anos"
                + "\nGênero: " + a1.getGenero()
                + "\nPeso: " + a1.getPeso()
                + "\nAltura :" + a1.getAltura());

        System.out.println("");

        System.out.println("Nome: " + a2.getNome()
                + "\nNascimento: " + a2.getNascimento()
                + "\nIdade :" + +a2.getIdade() + " anos"
                + "\nGênero: " + a2.getGenero()
                + "\nPeso: " + a2.getPesoFormatado()
                + "\nAltura :" + a2.getAlturaFormatado());

    }
}

class Aluno {

    private String nome;
    private LocalDate nascimento;
    private String genero;
    private double peso;
    private double altura;

    public Aluno() {
    }

    public Aluno(String nome, LocalDate nascimento, String genero, double peso, double altura) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return formato.format(this.nascimento);
    }

    public void setNacimento(LocalDate nacimento) {
        this.nascimento = nascimento;
    }

    public int getIdade() {
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(this.nascimento, hoje);

        return periodo.getYears();
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return this.peso;
    }

    public String getPesoFormatado() {
        DecimalFormat formato = new DecimalFormat("0.000");

        return formato.format(this.peso);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public String getAlturaFormatado() {
        DecimalFormat formato = new DecimalFormat("0.00");

        return formato.format(this.altura);
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
