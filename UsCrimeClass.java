/* File: States.java
 * Author: Tom Frazier
 * 05-07-2020
 * Purpose: class file for the StatesDataTest.java class file
 */

public class UsCrimeClass {

  // Declare Variables
  private int year;
  private int population;
  private int vTotal;
  private float vRate;
  private int mTotal;
  private float mRate;
  private int rTotal;
  private float rRate;
  private int rbTotal;
  private float rbRate;
  private int aTotal;
  private float aRate;
  private int pTotal;
  private float pRate;
  private int bTotal;
  private float bRate;
  private int lTotal;
  private float lRate;
  private int mvTotal;
  private float mvRate;

  // Constructor
  public UsCrimeClass(int year) {
    this.year = year;
  }

  // Getters
  public int getYear() {
    return year;
  }

  public int getPopulation() {
    return population;
  }

  public int getViolentCrimeTotal() {
    return vTotal;
  }

  public float getViolentCrimeRate() {
    return vRate;
  }

  public int getMurderTotal() {
    return mTotal;
  }

  public float getMurderRate() {
    return mRate;
  }

  public int getRapeTotal() {
    return rTotal;
  }

  public float getRapeRate() {
    return rRate;
  }

  public int getRobberyTotal() {
    return rbTotal;
  }

  public float getRobberyRate() {
    return rbRate;
  }

  public int getAssaultTotal() {
    return aTotal;
  }

  public float getAssaultRate() {
    return aRate;
  }

  public int getPropertyTotal() {
    return pTotal;
  }

  public float getPropertyRate() {
    return pRate;
  }

  public int getBurglaryTotal() {
    return bTotal;
  }

  public float getBurglaryRate() {
    return bRate;
  }

  public int getLarcenyTotal() {
    return lTotal;
  }

  public float getLarcenyRate() {
    return lRate;
  }

  public int getMotorVehicleTotal() {
    return vTotal;
  }

  public float getMotorVehicleRate() {
    return vRate;
  }

  // Setters
  public void setPopulation(int population) {
    this.population = population;
  }

  public void setViolentCrimeTotal(int vTotal) {
    this.vTotal = vTotal;
  }

  public void setViolentCrimeRate(float vRate) {
    this.vRate = vRate;
  }

  public void setMurderTotal(int mTotal) {
    this.mTotal = mTotal;
  }

  public void setMurderRate(float mRate) {
    this.mRate = mRate;
  }

  public void setRapeTotal(int rTotal) {
    this.rTotal = rTotal;
  }

  public void setRapeRate(float rRate) {
    this.rRate = rRate;
  }

  public void setRobberyTotal(int rbTotal) {
    this.rbTotal = rbTotal;
  }

  public void setRobberyRate(float rbRate) {
    this.rbRate = rbRate;
  }

  public void setAssaultTotal(int aTotal) {
    this.aTotal = aTotal;
  }

  public void setAssaultRate(float aRate) {
    this.aRate = aRate;
  }

  public void setPropertyTotal(int pTotal) {
    this.pTotal = pTotal;
  }

  public void setPropertyRate(float pRate) {
    this.pRate = pRate;
  }

  public void setBurglaryTotal(int bTotal) {
    this.bTotal = bTotal;
  }

  public void setBurglaryRate(float bRate) {
    this.bRate = bRate;
  }

  public void setLarcenyTotal(int lTotal) {
    this.lTotal = lTotal;
  }

  public void setLarcenyRate(float lRate) {
    this.lRate = lRate;
  }

  public void setMotorVehicleTotal(int mvTotal) {
    this.mvTotal = mvTotal;
  }

  public void setMotorVehicleRate(float mvRate) {
    this.mvRate = mvRate;
  }
}