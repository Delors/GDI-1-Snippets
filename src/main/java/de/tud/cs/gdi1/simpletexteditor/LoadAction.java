package de.tud.cs.gdi1.simpletexteditor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import org.apache.commons.io.FileUtils;

public class LoadAction implements ActionListener {

    private JFileChooser fileChooser = new JFileChooser();

    private JTextArea textArea;

    public LoadAction(JTextArea textArea) {
        this.textArea = textArea;
        fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {

            @Override
            public String getDescription() {
                return "*.txt | *.sh";
            }

            @Override
            public boolean accept(File f) {
                if (f.isDirectory())
                    return true;
                else {
                    String fileName = f.toString();
                    return fileName.endsWith(".txt") || fileName.endsWith(".sh");
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {

            try {
                textArea.setText(FileUtils.readFileToString(fileChooser.getSelectedFile()));
            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, "An error occured while reading the file. \n"
                        + (e1.getMessage()), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}
