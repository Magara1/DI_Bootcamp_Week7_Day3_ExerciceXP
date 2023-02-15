import ecercice1.PrintElement;
import exercice2.SelectionSort;
import exercice3.Reverse;
import exercice4.Pi;

public class Main {
    public static void main(String[] args) {
        //Exercice 1
       
        String[] dataString = {"Magara", "Etchien", "Ngouan"};
        Integer[] dataInt = {1, 2, 3, 4, 5};
        PrintElement.printArray(dataString);
        PrintElement.printArray(dataInt);

        //Exercice 2
        
        Integer[] dataInt2 = {5, 1, 8, 26, 35, 87, 45, 50, 0};
        SelectionSort.SelectionSort(dataInt2);
        //Exercice 3
        String word = "HIPPOPOTAMUS";
        Reverse.Reverse(word);

        //Exercice 4
        Pi pi = () -> Math.PI;
        System.out.println("Valeur de PI " + pi.findPi());
    }
}