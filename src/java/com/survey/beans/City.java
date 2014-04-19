/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.survey.beans;

/**
 *
 * @author MAfzal
 */
public class City {
     int id = 0;
 String name = "";
 String country = "";
 String district = "";
 int population = 0;
 int lastYearPopulation = 0;
  
 public int getId() {
  return id;
 }
 public void setId(int id) {
  this.id = id;
 }
 public String getName() {
  return name;
 }
 public void setName(String name) {
  this.name = name;
 }
 public String getCountry() {
  return country;
 }
 public void setCountry(String country) {
  this.country = country;
 }
 public String getDistrict() {
  return district;
 }
 public void setDistrict(String district) {
  this.district = district;
 }
 public int getPopulation() {
  return population;
 }
 public void setPopulation(int population) {
  this.population = population;
 }
 public int getLastYearPopulation() {
  return lastYearPopulation;
 }
 public void setLastYearPopulation(int lastYearPopulation) {
  this.lastYearPopulation = lastYearPopulation;
 }
  
}
