import Enums.AlimentacaoAnimal;

public class Animal extends SerVivo{

    private AlimentacaoAnimal alimentacao;
    private boolean fome;
    private double peso, inteligencia;
    private String barulho;

    /**
     * Método Construtor
     * @param nome nome do animal
     * @param especie especie do animal
     * @param pais pais de origem do animal
     * @param idade idade do animal
     * @param alimentacao alimentacao do animal
     * @param fome true se tem fome, false se não tem fome
     * @param peso peso do animal em kg
     * @param inteligencia inteligencia do animal (0-100)
     * @param barulho barulho do animal
     */
    public Animal(String nome, String especie, String pais, int idade, AlimentacaoAnimal alimentacao, boolean fome, double peso, double inteligencia, String barulho) {
        super(nome, especie, pais, idade);
        this.alimentacao = alimentacao;
        this.fome = fome;
        this.peso = peso;
        this.inteligencia = inteligencia;
        this.barulho = "au au au";
    }

}
