package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

import DAO.CourseDao;

public class ReadExcel {
	
	public static void main(String[] args) throws IOException {
		ReadExcel readExcel=new ReadExcel();
		List<Course> courses=readExcel.readXls();
		CourseDao courseDao=new CourseDao();
		for(Course course:courses){
			courseDao.add(course);
		}
		System.out.println("yes");
	}
	public List<Course> readXls() throws IOException{
		InputStream is=new FileInputStream(Common.excel_path);
		HSSFWorkbook hssfWorkbook=new HSSFWorkbook(is);
		List<Course> courses =new ArrayList<Course>();
		Course course=null;
		for(int numSheet=0;numSheet<hssfWorkbook.getNumberOfSheets();numSheet++){
			HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
			if(hssfSheet==null){
				
				continue;
			}
			for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
				HSSFRow hssfRow=hssfSheet.getRow(rowNum);
				if(hssfRow!=null){
					course=new Course();
					
					HSSFCell grade=hssfRow.getCell(0);
					HSSFCell discipline=hssfRow.getCell(1);
					HSSFCell number =hssfRow.getCell(2);
					HSSFCell name =hssfRow.getCell(3);
					HSSFCell type =hssfRow.getCell(4);
					HSSFCell xuefen =hssfRow.getCell(5);
					HSSFCell learnhours =hssfRow.getCell(6);
					HSSFCell exphours =hssfRow.getCell(7);
					HSSFCell shangji =hssfRow.getCell(8);
					HSSFCell beginend =hssfRow.getCell(9);
					HSSFCell teacher =hssfRow.getCell(10);
					HSSFCell remark =hssfRow.getCell(11);
					grade.setCellType(Cell.CELL_TYPE_STRING);
					course.setGrade(grade.getStringCellValue());
					
					discipline.setCellType(Cell.CELL_TYPE_STRING);
					course.setDiscipline(discipline.getStringCellValue());
					
					number.setCellType(Cell.CELL_TYPE_STRING);
					course.setNumber(number.getStringCellValue());
				
					name.setCellType(Cell.CELL_TYPE_STRING);
					course.setName(name.getStringCellValue().trim());
					
					beginend.setCellType(Cell.CELL_TYPE_STRING);
					course.setBeginend(beginend.getStringCellValue());
					
					xuefen.setCellType(Cell.CELL_TYPE_STRING);
					course.setXuefen(xuefen.getStringCellValue());
					
					learnhours.setCellType(Cell.CELL_TYPE_STRING);
					course.setLearnhours(learnhours.getStringCellValue());
					
					shangji.setCellType(Cell.CELL_TYPE_STRING);
					course.setShangji(shangji.getStringCellValue());
					
					exphours.setCellType(Cell.CELL_TYPE_STRING);
					course.setExphours(exphours.getStringCellValue());
					
					remark.setCellType(Cell.CELL_TYPE_STRING);
					course.setRemark(remark.getStringCellValue());
					
					type.setCellType(Cell.CELL_TYPE_STRING);
					course.setType(type.getStringCellValue());
					
					teacher.setCellType(Cell.CELL_TYPE_STRING);
					course.setTeacher(teacher.getStringCellValue());
				
					courses.add(course);
				}
			}
		}
		return courses;
	}
}
