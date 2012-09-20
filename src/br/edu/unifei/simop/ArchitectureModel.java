/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.simop;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luiz Fernando
 */
public class ArchitectureModel extends Model implements Architecture{
    private List<ArchitectureComponent> architectureComponents = new ArrayList<ArchitectureComponent>();

    public List<ArchitectureComponent> getArchitectureComponents() {
        return architectureComponents;
    }

    public void setArchitectureComponents(List<ArchitectureComponent> architectureComponents) {
        this.architectureComponents = architectureComponents;
    }

    @Override
    public boolean addArchitectureComp(ArchitectureComponent station) {
        return architectureComponents.add(station);
    }

    @Override
    public ArchitectureComponent removeArchitectureComp(int index) {
        return architectureComponents.remove(index);
    }

}
