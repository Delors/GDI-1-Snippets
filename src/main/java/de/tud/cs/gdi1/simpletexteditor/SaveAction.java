package de.tud.cs.gdi1.simpletexteditor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class SaveAction implements ActionListener {

    private JTextArea textArea;

    JFileChooser fileChooser = new JFileChooser();

    public SaveAction(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            // Java 7 - try-with-resources statement
            try (ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(
                    fileChooser.getSelectedFile()))) {

                oout.writeObject(textArea.getDocument());
                JOptionPane.showMessageDialog(null, "File saved!");
            } catch (IOException e1) {
                JOptionPane.showMessageDialog(null, "Failed saving the file: " + e1.getMessage());
            }
        }
    }
}
