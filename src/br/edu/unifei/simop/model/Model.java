/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.simop.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Luiz Fernando
 */
public abstract class Model<C extends Component> {
    private String name;
    private Calendar date;
    private List<Component> components = new ArrayList<Component>();
    
    public abstract boolean addComponent(C comp);
    public abstract Component removeComponent(int index);
    public abstract Iterator iteratorComponent();
    
}
