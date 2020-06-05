package com.verros.ws.fault;

import javax.xml.ws.WebFault;

@WebFault
public class ServiceFaultBothValuesAreZero extends Exception {
  private String errorDetails;

  public ServiceFaultBothValuesAreZero(String reason, String errorDetails) {
    super(reason);
    this.errorDetails = errorDetails;
  }

  public String getErrorDetails() {
    return errorDetails;
  }

}
