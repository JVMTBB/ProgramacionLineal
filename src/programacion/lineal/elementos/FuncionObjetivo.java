/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion.lineal.elementos;

/**
 *
 * @author José Velasco Mérida
 */
public class FuncionObjetivo {

    private TipoFuncion tipoFuncion;
    private String[] funcion;

    public TipoFuncion getTipoFuncion() {
        return tipoFuncion;
    }

    public void setTipoFuncion(TipoFuncion tipoFuncion) {
        this.tipoFuncion = tipoFuncion;
    }

    public String[] getFuncion() {
        return funcion;
    }

    public void setFuncion(String[] funcion) {
        this.funcion = funcion;
    }
}
