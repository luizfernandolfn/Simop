/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.simop.model;

import br.edu.unifei.simop.view.ModelPanel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Luiz Fernando
 */
public abstract class Model<C extends Component> {
    private ModelPanel panel;
    private String name;
    private Calendar date;
    private Component selectedComponent = null;
    private List<Component> components = new ArrayList<Component>();
    
    public abstract boolean addComponent(C comp);
    public abstract Component removeComponent(int index);
    public abstract Iterator iteratorComponent();

    public Model(ModelPanel panel) {
        this.panel = panel;
    }

    public ModelPanel getPanel() {
        return panel;
    }

    public void setPanel(ModelPanel panel) {
        this.panel = panel;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public Component getSelectedComponent() {
        return selectedComponent;
    }

    public void setSelectedComponent(Component selectedComponent) {
        this.selectedComponent = selectedComponent;
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }
    
}
