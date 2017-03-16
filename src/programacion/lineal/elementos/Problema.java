/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion.lineal.elementos;

import java.util.ArrayList;

/**
 *
 * @author José Velasco Mérida
 */
public class Problema {

    private FuncionObjetivo fo;
    private SujetoA sa;
    private ArrayList<String[]> restricciones;

    public FuncionObjetivo getFo() {
        return fo;
    }

    public void setFo(FuncionObjetivo fo) {
        this.fo = fo;
    }

    public SujetoA getSa() {
        return sa;
    }

    public void setSa(SujetoA sa) {
        this.sa = sa;
    }

    public ArrayList<String[]> getRestricciones() {
        return restricciones;
    }

    public void setRestricciones(ArrayList<String[]> restricciones) {
        this.restricciones = restricciones;
    }
}
