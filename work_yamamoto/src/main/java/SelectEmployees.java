import java.util.List;

import dao.EmployeesDAO;
import model.Employee;

public class SelectEmployees {
  public static void main(String[] args) {
    // EMPLOYEESテーブルの全レコードを取得
    EmployeesDAO empDAO = new EmployeesDAO();
    //List<Employee> empList = empDAO.remove(1);
    List<Employee> pList = empDAO.remove();
    List<Employee> empList = empDAO.findAll();

    // 取得したレコードの内容を出力
    for (Employee emp : empList) {
      System.out.println("ID:" + emp.getId());
      System.out.println("名前:" + emp.getName());
      System.out.println("年齢:" + emp.getAge() + "\n");
    }
  }
}