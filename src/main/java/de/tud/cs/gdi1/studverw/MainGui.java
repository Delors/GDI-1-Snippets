package de.tud.cs.gdi1.studverw;

import javax.swing.JOptionPane;

public class MainGui {

    public static void main(String[] args) {

        try {
            String givenName = JOptionPane.showInputDialog("Given Name?");
            if (givenName != null) {
                String familyName = JOptionPane.showInputDialog("Family Name?");
                Person p = new Person(givenName, familyName);
                System.out.println(p);
            }
            JOptionPane.showMessageDialog(null, "ciao");
            return;
        } catch (NameException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Wrong name.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An internal error occured.");
        }
    }
}
