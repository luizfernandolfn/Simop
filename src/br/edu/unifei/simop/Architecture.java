/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.simop;

/**
 *
 * @author Luiz Fernando
 */
public interface Architecture extends TecType {

    public boolean addArchitectureComp(ArchitectureComponent station);

    public ArchitectureComponent removeArchitectureComp(int index);
}