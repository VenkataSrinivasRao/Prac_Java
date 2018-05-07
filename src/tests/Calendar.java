package tests;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calendar {

	WebDriver driver ;
	public void Calender(int month,int year, String day){
		
		 int expmonth = month;
		 int expyear = year;
		 String expday = day;
		 String calMonth = null;
		 String calYear = null;
		 boolean dateNotFound;
		 boolean test = false;
			
		 List<String> monthList = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
		    
		 dateNotFound = true;
		     while(dateNotFound)
			  { 
			   // Get current month from the calendar popup
			   calMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			   // Get current year from the calendar popup
			     calYear = driver.findElement(By.className("ui-datepicker-year")).getText();
				 
				 // Check if current month and year are same as expected month and year , if true go inside the body and select the date 
				   if(monthList.indexOf(calMonth)+1 == expmonth && (expyear == Integer.parseInt(calYear)))
				    {
					   selectDate(expday); // Calling the function to select date
			    dateNotFound = false; // setting notfound to false
			    
			   }
			   
			    // Check if current month and year are less than expected month and year , if true then click on next button 
			   else if(monthList.indexOf(calMonth)+1 < expmonth && (expyear == Integer.parseInt(calYear)) || expyear > Integer.parseInt(calYear))
			   {
			   // clicking on next button
			   driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span")).click(); 
			   }
			   // Check if current month and year are greater than expected month and year , if true then click on previous button 
			   else if(monthList.indexOf(calMonth)+1 > expmonth && (expyear == Integer.parseInt(calYear)) || expyear < Integer.parseInt(calYear))
			   {
			   
			   // clicking on previous button
			  driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[1]/span")).click();
			   }
			    }
			  
			 } 
			
		 public void selectDate(String date)
		{
		 WebElement datatable = driver.findElement(By.id("ui-datepicker-div")); 
		 List<WebElement>alldates= datatable.findElements(By.tagName("td"));
		 // For all cells in table
		for (WebElement cell: alldates){
		// Check in date matches and click
		if (cell.getText().equals(date)){
		   cell.findElement(By.linkText(date)).click();
		   break;
		  }
		 }
		} 
}
