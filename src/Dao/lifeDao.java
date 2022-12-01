
package Dao;
import Model.LifeClass;
import java.util.List;
/**
 *
 * @author Brian
 */
public interface lifeDao {
    //Create
    void add(String name,String birth);
    void add(LifeClass L);//物件當引數 等於在外面先new student s;
    
    //Read
    String Q();
    //String Q2();
    //List<LifeClass> Q2();
    
    //update
    void update(LifeClass L);
    LifeClass Qid(int id);
    
    //Delete
    void delete(int id);
}
