/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.simop.view;

import br.edu.unifei.simop.model.Model;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Luiz Fernando
 */
public class ModelPanel extends JPanel{
    private Model model;

    public ModelPanel() {
        this.setBackground(Color.white);
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
    
}
