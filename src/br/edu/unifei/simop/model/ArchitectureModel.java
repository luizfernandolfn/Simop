/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.simop.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Luiz Fernando
 */
public class ArchitectureModel extends Model<ArchitectureComponent> implements Architecture {

    private List<ArchitectureComponent> architectureComponents = new ArrayList<ArchitectureComponent>();

    public List<ArchitectureComponent> getArchitectureComponents() {
        return architectureComponents;
    }

    public void setArchitectureComponents(List<ArchitectureComponent> architectureComponents) {
        this.architectureComponents = architectureComponents;
    }

    @Override
    public boolean addComponent(ArchitectureComponent comp) {
        return architectureComponents.add(comp);
    }

    @Override
    public Component removeComponent(int index) {
        return architectureComponents.remove(index);
    }

    @Override
    public Iterator iteratorComponent() {
        return architectureComponents.iterator();
    }
    
    
}
