public class SerVivo {

    private String nome, especie, pais;
    private int idade;

    /**
     * Método Construtor
     * @param nome nome do animal
     * @param especie espécie do animal
     * @param pais país de origem do animal
     * @param idade idade do animal
     */
    public SerVivo(String nome, String especie, String pais, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.pais = pais;
        this.idade = idade;
    }
}
