package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	    Company firma = new Company("Company", 7);
        Department vorstand = new Department("Vorstand", 2);
        firma.addDepartment(vorstand);
	    Department einkauf = new Department("Einkauf", 2);
	    firma.addDepartment(einkauf);
	    Department einkaufEu = new Department("Einkauf Europa", 1);
	    firma.addDepartment(einkaufEu);
	    Department einkaufIt = new Department("Einkauf Italien", 1);
        firma.addDepartment(einkaufIt);
	    Department einkaufUsa = new Department("Einkauf USA",1);
        firma.addDepartment(einkaufUsa);
	    Department vertrieb = new Department("Vertrieb", 1);
        firma.addDepartment(vertrieb);
	    Department vertriebEu = new Department("Vertrieb Europa", 1);
        firma.addDepartment(vertriebEu);

	    File myFile = new File("C:\\Users\\DCV\\Desktop\\Abteilungen.txt");
        FileReader fileReader = new FileReader(myFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            String[] splittedValues = line.split(";");
            //mit .trim werden leerzeichen vor oder nach dem wort entfernt
            String name = splittedValues[0].trim();
            String dep = splittedValues[1].trim();
            Person newPerson = new Person(name);

            for (int i = 0; i < firma.company.length  ; i++) {
                    if (dep.equalsIgnoreCase(firma.company[i].name)) {
                        firma.company[i].addEmployer(newPerson);
                        break;
                }
            }
        }
        System.out.println(vertriebEu);

    }
}
