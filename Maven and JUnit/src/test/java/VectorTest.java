import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** УРОВНИ ТЕСТИРОВАНИЯ
 * Модульное - тестирование класснов, методов
 * Интеграционное - работа нескольких модулей
 * Системное - система целиком
 **/

/* ЧТО ДЕЛАЕТ ТЕСТ
* Воспроизводит некоторые данные
* Выполняет тестируемый метод, правильный результат которого очевиден автору теста
* Соспоставление ожидаемого результата с фактическим
 */

public class VectorTest {
    private final double EPS = 1e-9;
    private /*static*/ Vector v1;

    @Before/*Class*/
    public /*static*/ void createNewVector(){
        v1 = new Vector();
    }

    @Test
    public void newVectorShouldHaveZeroLength(){
        //Vector v1 = new Vector();//action

        //assertion
        Assert.assertEquals(0,v1.length(),EPS);//delta - допутимое значение отклонения результата
    }

    @Test
    public void newVectorShouldHaveZeroX(){
        Assert.assertEquals(0, v1.getX(),EPS);
    }

    @Test
    public void newVectorShouldHaveZeroY(){
        Assert.assertEquals(0, v1.getY(),EPS);

    }

    @Test//такого следует избегать. каждый метод
    //нужно тестировать отдельно
    public void newVectorShouldHaveZeroXAndZeroY(){
        Assert.assertEquals(0, v1.getX(),EPS);
        Assert.assertEquals(0, v1.getY(),EPS);

    }
}
