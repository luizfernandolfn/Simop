/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.simop.model;

/**
 *
 * @author Luiz Fernando
 */
public class Switch extends ArchitectureComponent{
    private double bus;

    public Switch(Model model) {
        super(model);
    }
    
    public double getBus() {
        return bus;
    }

    public void setBus(double bus) {
        this.bus = bus;
    }
}
