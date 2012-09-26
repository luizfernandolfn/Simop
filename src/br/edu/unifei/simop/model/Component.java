/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.simop.model;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.TransferHandler;

/**
 *
 * @author Luiz Fernando
 */
public abstract class Component extends JButton {

    private Model model;

    public Component(final Model model) {
        this.model = model;
        this.setVisible(true);
        this.setBounds(20, 20, 100, 40);
        this.setText("Component");
        
        
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                model.setSelectedComponent(Component.this);
            }
        });
    }
}
