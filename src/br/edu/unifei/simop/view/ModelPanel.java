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
import java.awt.event.MouseMotionListener;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author Luiz Fernando
 */
public class ModelPanel extends JPanel implements MouseMotionListener {

    private Model model;

    public ModelPanel() {
        this.addMouseMotionListener(this);
        this.setBackground(Color.white);
        model = new ArchitectureModel(this);

        Station station1 = new Station(model);
        Station station2 = new Station(model);
        Station station3 = new Station(model);
        Station station4 = new Station(model);

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
    public void mouseDragged(MouseEvent e) {
        model.getSelectedComponent().setLocation(e.getPoint());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}