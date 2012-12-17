package de.tud.cs.gdi1.universitymanagement;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ThaiName implements Name {

    static {
        System.out.println("Loading list of names that are already used...");
        // TODO Support the loading of the list of names that are already used...
    }

    private static ArrayList<String> names = new ArrayList<>();

    private String familyName;

    private ThaiName(String familyName) throws NameException {
        if (familyName.length() == 1)
            throw new NameException();

        this.familyName = familyName;
    }

    /**
     * 
     * @param familyName
     * @return
     * @throws NameException
     * @throws ThaiNameException
     *             If the name is already used a ... Exception is thrown.
     * @throws IllegalArgumentException
     */
    public static ThaiName checkAndCreateThaiName(String familyName) throws NameException {
        if (familyName == null)
            throw new IllegalArgumentException();
        // check that the family name is unique
        if (names.contains(familyName)) {
            throw new ThaiNameException("the name " + familyName + " is already used");
        } else
            names.add(familyName);
        return new ThaiName(familyName);
    }

    @Override
    public String getFormOfAddress() {
        return familyName;
    }

    @Override
    public String toString() {
        return familyName;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            String name = JOptionPane.showInputDialog("Name");
            try {
                ThaiName.checkAndCreateThaiName(name);
            } catch (ThaiNameException e) {
                throw new IllegalArgumentException(e);
            } catch (NameException ne) {
                JOptionPane.showMessageDialog(null, "The name is too short.");
            } catch (IllegalArgumentException ia) {
                JOptionPane.showMessageDialog(null, "Operation canceled.");
            } finally {
                System.out.println(name);
            }
        }
        JOptionPane.showMessageDialog(null, "Program succeeded");

        // System.err.println(ThaiName.checkAndCreateThaiName("Eichberg"));
        // System.err.println(ThaiName.checkAndCreateThaiName("Müller"));
        // System.err.println(ThaiName.checkAndCreateThaiName("Eichberg")); // will throw an Error!
    }
}
