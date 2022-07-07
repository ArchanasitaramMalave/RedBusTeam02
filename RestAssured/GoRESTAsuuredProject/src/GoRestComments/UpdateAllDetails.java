package GoRestComments;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.reporters.XMLUtils;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class UpdateAllDetails {
	@Test
    public void UpdateUser() throws IOException {




     FileInputStream fis = new FileInputStream("C:\\Users\\ARMALVE\\Desktop\\selenium\\Data source\\Update.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet ws = workbook.getSheetAt(0);

            int rownum  = ws.getLastRowNum();
            int colnum = ws.getRow(0).getPhysicalNumberOfCells();
            System.out.println(colnum);
            System.out.println(rownum);
            XSSFCell id;
            XSSFCell newname;
            XSSFCell newemail;
            XSSFCell newgender;
            XSSFCell newstatus;

            for(int i = 0; i <= rownum ; i++) {

                id = ws.getRow(i).getCell(0);
                newname = ws.getRow(i).getCell(1);
                newemail = ws.getRow(i).getCell(2);
                newgender = ws.getRow(i).getCell(3);
                newstatus = ws.getRow(i).getCell(4);


                RestAssured.baseURI = "https://gorest.co.in";

                System.out.println(id.toString());
                System.out.println(newname.toString());
                System.out.println(newemail.toString());
                System.out.println(newgender.toString());
                System.out.println(newstatus.toString());

                RequestSpecification request = RestAssured.given();
                Response response = request.body("{\"name\":\"" + newname +"\", \"email\":\"" + newemail +"\", \"gender\":\""+ newgender +"\", \"status\":\""+ newstatus +"\"}").post("/public/v2/users/12");
                ResponseBody body = response.getBody();

                System.out.println(body.asString());

}
	}
}
