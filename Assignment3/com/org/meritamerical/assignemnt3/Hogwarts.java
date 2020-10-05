package com.org.meritamerical.assignemnt2;

/*
 * File: Hogwarts.java
 * -------------------
 * This program is just testing your understanding of parameter passing.
 */
import acm.program.*;
public class Hogwarts extends ConsoleProgram {
 public void run() {
 bludger(2001);
 }
 private void bludger(int y) {
 int x = y / 1000;
 int z = (x + y);
 x = quaffle(z, y);
 /*for bludger: y = (2001/1000) + 2001 of which is (bludger int y + int x)  for now x is 2.001; x somehow equals 
  * 1001 of which is 2001-1000
 */
 println("bludger: x = " + x + ", y = " + y + ", z = " + z);
 }
 private int quaffle(int x, int y) {
 int z = snitch(x + y, y);
 y /= z;
 /*quaffle x will be 2003 of which is bludger's z, y is 1 as y and z equal and divide to 1 z is 1001 of which is bludger's x
  */
 println("quaffle: x = " + x + ", y = " + y + ", z = " + z);
 return z;
 }
 private int snitch(int x, int y) {
 y = x / (x % 10);
 /*
  * x equals 4004 of which is 1001 *4 and y equals 1001
  */
 println("snitch: x = " + x + ", y = " + y);
 return y;
 }
} 
