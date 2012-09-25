/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.simop.view;

import javax.swing.JFrame;

/**
 *
 * @author Luiz Fernando
 */
public class Form extends JFrame {
    private ModelPanel modelPanel = new ModelPanel();

    public Form() {
        initComponents();
    }

    private void initComponents() {
        this.add(modelPanel);
        this.setVisible(true);
        this.setSize(800, 600);
        this.setTitle("Simop");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
