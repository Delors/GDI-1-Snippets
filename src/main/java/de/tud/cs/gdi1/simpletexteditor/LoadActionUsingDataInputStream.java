package de.tud.cs.gdi1.simpletexteditor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class LoadActionUsingDataInputStream implements ActionListener {

    private JFileChooser fileChooser = new JFileChooser();

    private JTextArea textArea;

    public LoadActionUsingDataInputStream(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {

            try {
                DataInputStream in = null;
                try {
                    File file = fileChooser.getSelectedFile();
                    in = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
                    byte[] data = new byte[/* FIXME Hack */(int) file.length()];
                    in.readFully(data);
                    String s = new String(data);
                    textArea.setText(s);
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
