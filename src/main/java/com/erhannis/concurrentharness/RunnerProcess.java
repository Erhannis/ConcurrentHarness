/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erhannis.concurrentharness;

import jcsp.lang.AltingChannelInput;
import jcsp.lang.CSProcess;

/**
 *
 * @author erhannis
 */
public class RunnerProcess implements CSProcess {
  private final AltingChannelInput<Runnable> commandIn;
  private final Runnable response;

  public RunnerProcess(AltingChannelInput<Runnable> commandIn, Runnable response) {
    this.commandIn = commandIn;
    this.response = response;
  }
  
  @Override
  public void run() {
    while (true) {
      Runnable action = commandIn.read();
      action.run();
      response.run();
    }
  }
}
