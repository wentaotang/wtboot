package com.hgcode.wtboot;


import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

//@SpringBootTest
class WtbootApplicationTests {

    @Test
    void contextLoads() {
        String str= "activity_booking_record_";

        for(int i =0;i<128;i++){
           String v =  String.format("%0" + 3 + "d", i);
            System.out.println(str+v);
        }
    }

    /**
     * The part /docProps/core.xml fail to be saved in the stream with marshaller Exception
     */
    @Test
    void poiExport() throws IOException {


       String src = "/Users/wentao/Documents/table.xls";
       FileOutputStream fileOutputStream=  new FileOutputStream(src);

        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("table");  //创建table工作薄

        HSSFRow row1,row2;
        row1 = sheet.createRow(0);
        row2 = sheet.createRow(1);
        HSSFCell cell1,cell2;
        int count=0;
        for(int i =0;i<5;i++)
        {
            cell1 = row1.createCell(count);
            cell2 = row2.createCell(count);
            cell1.setCellValue(i);
            cell2.setCellValue("value"+i);
            count++;
            wb.write(fileOutputStream);
        }



    }

}
