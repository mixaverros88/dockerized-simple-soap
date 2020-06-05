package com.verros.ws.fault;

import javax.xml.ws.WebFault;

@WebFault
public class ServiceFaultNotANumber extends Exception {

  public ServiceFaultNotANumber() {
  }
}
