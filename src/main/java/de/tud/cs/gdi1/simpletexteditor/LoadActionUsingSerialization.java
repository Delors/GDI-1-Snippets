package de.tud.cs.gdi1.simpletexteditor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.text.Document;

public class LoadActionUsingSerialization implements ActionListener {

    private JFileChooser fileChooser = new JFileChooser();

    private JTextArea textArea;

    public LoadActionUsingSerialization(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {

            try {
                ObjectInputStream in = null;
                try {
                    in = new ObjectInputStream(new FileInputStream(fileChooser.getSelectedFile()));
                    Document document = (Document) in.readObject();
                    textArea.setDocument(document);
                } finally {
                    if (in != null)
                        in.close();
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }

            JOptionPane.showMessageDialog(null, "File loaded!");
        }
    }

}
