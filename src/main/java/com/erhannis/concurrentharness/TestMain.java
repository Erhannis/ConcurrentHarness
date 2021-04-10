/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erhannis.concurrentharness;

/**
 *
 * @author erhannis
 */
public class TestMain {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
//    new MainFrame(new Object[][] {
//      {"A",
//        "1", r(() -> {System.out.println("A1");}),
//        "2", r(() -> {System.out.println("A2");}),
//        "3", r(() -> {System.out.println("A3");}),
//        "4", r(() -> {System.out.println("A4");}),
//      },
//      {"B",
//        "1", r(() -> {System.out.println("B1");}),
//        "2", r(() -> {System.out.println("B2");}),
//        "3", r(() -> {System.out.println("B3");}),
//      },
//    }).setVisible(true);
    ABLock l = new ABLock();
    new MainFrame(new Object[][] {
      {"ABLock",
        "Lock   A1", r(() -> {l.lockA1();}),
        "Unlock A1", r(() -> {l.unlockA1();}),
        "Lock   A2", r(() -> {l.lockA2();}),
        "Unlock A2", r(() -> {l.unlockA2();}),
        "Lock   B", r(() -> {l.lockB();}),
        "Unlock B", r(() -> {l.unlockB();}),
      },
    }).setVisible(true);
  }
  
  public static Runnable r(Runnable r) {
    return r;
  }
}
