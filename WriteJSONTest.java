import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteJSONTest {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        JSONObject employeeDetail = new JSONObject();
        employeeDetail.put("firtsName", "Dang");
        employeeDetail.put("lastName", "Kim Thi");
        employeeDetail.put("website", "codelean.vn");

        JSONObject EmployeeObject = new JSONObject();
        EmployeeObject.put("employee", employeeDetail);
        
        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firstName", "code");
        employeeDetails2.put("lastName", "Lean");
        employeeDetails2.put("website", "codelean.com");
        
        JSONObject employeeObject2 = new JSONObject();
        employeeObject2.put("employee", employeeObject2);
        
        JSONArray employList = new JSONArray();
        employList.add(employeeObject);
        employList.add(employeeObject2);
        try (FileWriter file = new FileWriter("employee.json")){
            file.write(employList.toJSONString());
            file.flush();
        }catch (IOException e) {
            e.prinStackTRace();
        }

    }
}
