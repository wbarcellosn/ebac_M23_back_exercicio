/**
 * @author winic
 */
package wbarcellosn.tarefa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StreamsTaskTest {

    @Test
    public void onlyFemaleNames(){

        NamesByGender object = new NamesByGender();

        object.namesList = "Ana-F,Maria-F,João-M,Ricardo-M,Marcelly-F";
        object.thereIsComma(object.namesList);
        Assertions.assertFalse(object.listNames.contains("-M"), "A lista final deve conter apenas nomes femininos");
    }
}
