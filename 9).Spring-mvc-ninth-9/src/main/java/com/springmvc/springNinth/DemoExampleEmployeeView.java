package com.springmvc.springNinth;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

public class DemoExampleEmployeeView extends AbstractXlsView{
    
    protected void buildExcelDocument(Map model, HSSFWorkbook workbook,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
    
        Map<String,String> employeeData = (Map<String,String>) model.get("employeeData");

        HSSFSheet sheet = workbook.createSheet("Employee Data");
        
        HSSFRow header = sheet.createRow(0);
        header.createCell(0).setCellValue("EmployeeAddress");
        header.createCell(1).setCellValue("EmployeeName");

        
        
        int rowNum = 1;
        for (Map.Entry<String, String> entry : employeeData.entrySet()) {
            //create the row data
            HSSFRow row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(entry.getKey());
            row.createCell(1).setCellValue(entry.getValue());
                }
    }

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
