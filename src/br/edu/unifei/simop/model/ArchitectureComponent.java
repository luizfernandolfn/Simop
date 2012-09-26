/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.simop.model;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luiz Fernando
 */
public class ArchitectureComponent extends Component {

    private List<Relation> relations = new ArrayList<Relation>();
    private int velocity;
    
    public ArchitectureComponent(Model model) {
        super(model);
    }
    
    public List<Relation> getRelations() {
        return relations;
    }

    public void setRelations(List<Relation> relations) {
        this.relations = relations;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }
}
