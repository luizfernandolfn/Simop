/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.simop.view;

import br.edu.unifei.simop.model.ArchitectureComponent;
import br.edu.unifei.simop.model.ArchitectureModel;
import br.edu.unifei.simop.model.Model;
import br.edu.unifei.simop.model.Station;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author Luiz Fernando
 */
public class ModelPanel extends JPanel implements MouseListener{

    private Model model;

    public ModelPanel() {
        this.setBackground(Color.white);
        model = new ArchitectureModel();
        
        Station station1 = new Station();
        Station station2 = new Station();
        Station station3 = new Station();
        Station station4 = new Station();
        
        station1.setLocation(10, 10);
        station2.setLocation(50, 10);
        station3.setLocation(80, 10);
        station4.setLocation(120, 10);
        
        model.addComponent(station1);
        model.addComponent(station2);
        model.addComponent(station3);
        model.addComponent(station4);

        List<ArchitectureComponent> list = ((ArchitectureModel) model).getArchitectureComponents();
        for (ArchitectureComponent architectureComponent : list) {
            this.add(architectureComponent);
        }
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        System.out.println("teste");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("testeeeee");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
