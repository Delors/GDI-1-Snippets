package de.tud.cs.gdi1.simpletexteditor;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SimpleEditor {

    public static void main(String[] args) {

        final JFrame f = new JFrame("Editor");
        JTextArea ta = new JTextArea();

        f.getContentPane().add(new JLabel("Enter text:"), BorderLayout.NORTH);

        JScrollPane scrollPane = new JScrollPane(ta);
        scrollPane.setPreferredSize(new Dimension(200, 150));
        f.getContentPane().add(scrollPane, BorderLayout.CENTER);
        JPanel buttons = new JPanel(new GridLayout(1, 2));
        JPanel buttonLayoutPanel = new JPanel(new BorderLayout());
        buttonLayoutPanel.add(buttons, BorderLayout.EAST);
        f.getContentPane().add(buttonLayoutPanel, BorderLayout.SOUTH);

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(new SaveAction(ta));
        buttons.add(saveButton);

        JButton loadButton = new JButton("Load");
        LoadAction loadAction = new LoadAction(ta);
        loadButton.addActionListener(loadAction);
        buttons.add(loadButton);

        JMenuBar menuBar = new JMenuBar();
        f.setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu("File");
        JMenuItem loadMenuItem = new JMenuItem("Load...");
        loadMenuItem.addActionListener(loadAction);
        fileMenu.add(loadMenuItem);
        menuBar.add(fileMenu);

        fileMenu.addSeparator();
        JMenuItem quitMenuItem = new JMenuItem("Quit");
        // quitMenuItem.addActionListener(new QuitAction());
        ActionListener quitAction = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                f.dispose();
            }

        };
        quitMenuItem.addActionListener(quitAction);
        fileMenu.add(quitMenuItem);

        f.pack();
        f.setVisible(true);
    }

}
