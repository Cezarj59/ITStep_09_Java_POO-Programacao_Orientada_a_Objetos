package homework_09;

public class Homework_09 {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Junior Cezar", "03/02/1993", "Masculino", 69, 1.74);
        Aluno a2 = new Aluno("Amber Santana", "30/11/2000", "Feminino", 69, 1.70);

        System.out.println("Nome: " + a1.getNome()
                + "\nNascimento: " + a1.getNascimento()
                + "\nGênero: " + a1.getGenero()
                + "\nPeso: " + a1.getPeso()
                + "\nAltura :" + a1.getAltura());
        
        System.out.println("");

        System.out.println("Nome: " + a2.getNome()
                + "\nNascimento: " + a2.getNascimento()
                + "\nGênero: " + a2.getGenero()
                + "\nPeso: " + a2.getPeso()
                + "\nAltura :" + a2.getAltura());

    }
}

class Aluno {

    private String nome;
    private String nascimento;
    private String genero;
    private double peso;
    private double altura;

    public Aluno() {
    }

    public Aluno(String nome, String nascimento, String genero, double peso, double altura) {
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
        return nascimento;
    }

    public void setNacimento(String nacimento) {
        this.nascimento = nascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
