/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.survey.beans;

/**
 *
 * @author MAfzal
 */
import java.sql.Connection;          
import java.sql.ResultSet;           
import java.sql.SQLException;        
import java.sql.PreparedStatement;   
import java.util.ArrayList;
 
import javax.naming.Context;         
import javax.naming.InitialContext;  
import javax.sql.DataSource;         
 
public class CityInformation {   
  
 Connection conn = null;             
 PreparedStatement stmt = null;      
 String sql = null;
  
 public ArrayList<City> getCities(String start, String limit) {  
 
  ArrayList<City> cityList = new ArrayList<City>();    
 
  try {       
   Context ctx = (Context) new InitialContext().lookup("java:comp/env");
   conn = ((DataSource) ctx.lookup("jdbc/mysql")).getConnection(); 
 
   sql = "SELECT * FROM city where countrycode = 'USA' order by population desc LIMIT ?,?";                       
   stmt = conn.prepareStatement(sql);
   stmt.setInt(1, Integer.parseInt(start));
   stmt.setInt(2, Integer.parseInt(limit));
   ResultSet rs = stmt.executeQuery();  
    
   while(rs.next()){ 
    City city = new City();
    city.setId(rs.getInt("id"));
    city.setName(rs.getString("name").trim());
    city.setCountry(rs.getString("countrycode").trim());
    city.setDistrict(rs.getString("district").trim());
    city.setPopulation(rs.getInt("population"));
    city.setLastYearPopulation((int) (rs.getInt("population") * 0.85));
    cityList.add(city);
   }                                                                          
 
   rs.close();                                                                
   stmt.close();                                                              
   stmt = null;                                                               
 
 
   conn.close();                                                              
   conn = null;                                                    
 
  }                                                                
  catch(Exception e){System.out.println(e);}                       
 
  finally {                                                        
   if (stmt != null) {                                             
    try {                                                          
     stmt.close();                                                 
    } catch (SQLException sqlex) {                                 
     // ignore -- as we can't do anything about it here            
    }                                                              
 
    stmt = null;                                             
   }                                                         
 
   if (conn != null) {                                       
    try {                                                    
     conn.close();                                           
    } catch (SQLException sqlex) {                           
     // ignore -- as we can't do anything about it here      
    }                                                        
 
    conn = null;                                             
   }                                                         
  }               
 
  return cityList;
 
 }   
  
}   