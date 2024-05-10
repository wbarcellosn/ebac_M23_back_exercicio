/**
 * @author winic
 */
package wbarcellosn.tarefa;


import java.util.List;
import java.util.Scanner;

public class NamesByGender {
    Scanner s = new Scanner(System.in);

    String namesList;
    List<String> listNames;

    public void setNamesList(){
        String namesList;
        do {
            System.out.println("****Digite dois ou mais nomes com seus respectivos sexos na seguinte formatação 'nome-siglaDoSexo' e separe-os por vírgula****");
            namesList = s.nextLine();

            if(!namesList.isEmpty()){
                thereIsComma(namesList);
            }
            else {
                System.out.println("Você não digitou nada!\n");
            }
        } while(namesList.isEmpty());
    }

    public void thereIsComma(String tempNamesList){

        if (!tempNamesList.contains(",")) {
            System.out.println("Você não utilizou virgula ou digitou apenas um nome!\n");
            setNamesList();
        }
        else {
            this.namesList = tempNamesList;
            listNames = List.of(this.namesList.toUpperCase().split(","));
            sortByGenderAndPrint();
        }
    }

    public void sortByGenderAndPrint(){
        System.out.println("\n****LISTA GERAL****\n");
        listNames.forEach(System.out::println);

        System.out.println("\n****LISTA FEMININA****\n");
        listNames.stream()
                .filter(name -> name.contains("-F"))
                .toList()
                .forEach(System.out::println);
    }

}
