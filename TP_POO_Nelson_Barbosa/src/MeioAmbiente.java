import Enums.FamiliaPlanta;

import java.util.ArrayList;

public class MeioAmbiente {

    private String nome;
    private double agua;
    private ArrayList<SerVivo> seres;

    /**
     * Metodo construtor
     * @param nome nome do meio ambiente
     * @param agua litros de agua no meio ambiente
     */
    public MeioAmbiente(String nome, double agua) {
        this.nome = nome;
        this.agua = agua;
        this.seres = new ArrayList<SerVivo>(seres);
    }


    public boolean plantaBebe (int indexPlanta) {

        Planta plantabebe = (Planta) this.seres.get(indexPlanta); // Casting

        // Variáveis
        double aguaNecessaria = 0; // é em litros;


        if (indexPlanta >= 0 && indexPlanta < this.seres.size()) { //para definir se o index do array que definimos para os seres está em conformidade
            if (FamiliaPlanta.ARVORES.equals(plantabebe.getFamilia())) { // As árvores bebem 1 litro
                aguaNecessaria = 1;
            } else if (FamiliaPlanta.FLORES.equals(plantabebe.getFamilia())) { // As flores bebem 0.1 litros
                aguaNecessaria = 0.1;
            } else if (FamiliaPlanta.ERVAS.equals(plantabebe.getFamilia())) { // As ervas bebem 0.25 litros
                aguaNecessaria = 0.25;
            }
        } else {
            return false; // indice da planta não é valido
        }

        if (this.agua >= aguaNecessaria) { //
            this.agua = this.agua - aguaNecessaria; // retornamos true portanto diminuimos a agua no ambiente
            return true;

        } else {
            this.seres.remove(indexPlanta);
            return false; // a planta não bebe e seca, logo é removida
        }
    }

    public boolean plantaComeInsetos(int indexPlanta){

        Planta plantaInsetos = (Planta) this.seres.get(indexPlanta); //casting
    }

    public void plantaAbanaComVento(int indexPlanta){

        System.out.println("\n Está muito vento. \n");
        }


    public void animalFazBarulho(int indexAnimal){
            System.out.println();
        }
    }
}
