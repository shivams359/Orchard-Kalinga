package com.mindtree.EmployeeSatisfactionSurvey.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.EmployeeSatisfactionSurvey.dao.CountryDAO;
import com.mindtree.EmployeeSatisfactionSurvey.entity.Country;



@Service("countryService")
public class CountryService {
 
 @Autowired
 CountryDAO countryDao;
 
 @Transactional
 public List getAllCountries() {
  return countryDao.getAllCountries();
 }
 
 @Transactional
 public Country getCountry(int id) {
  return countryDao.getCountry(id);
 }
 
 @Transactional
 public void addCountry(Country country) {
  countryDao.addCountry(country);
 }
 
 @Transactional
 public void updateCountry(Country country) {
  countryDao.updateCountry(country);
 
 }
 
 @Transactional
 public void deleteCountry(int id) {
  countryDao.deleteCountry(id);
 }
}
