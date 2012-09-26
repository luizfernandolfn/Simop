/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.simop.model;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

/**
 *
 * @author Luiz Fernando
 */
public abstract class Component extends JPanel {

    private Model model;
    private boolean selected = false;

    public Component(final Model model) {
        this.model = model;
        this.setVisible(true);
        this.setBounds(20, 20, 100, 40);
        this.setBackground(Color.cyan);
//        this.setText("Component");
        this.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                Component.this.selected = true;
                System.out.println("entrou");
            }
            
            @Override
            public void mouseReleased(MouseEvent e) {
                Component.this.selected = false;
                System.out.println("saiu");
            }
        });
        this.addMouseMotionListener(new MouseMotionListener() {

            @Override
            public void mouseDragged(MouseEvent me) {
                if (Component.this.selected) {
                    System.out.println("moveu");
                    Component.this.setLocation((model.getPanel().getMousePosition().x-20), (model.getPanel().getMousePosition().y - 20));
                }
            }

            @Override
            public void mouseMoved(MouseEvent me) {
//                System.out.println("moveu1");
            }
        });
    }
}
