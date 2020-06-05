package com.verros.ws.api;

import com.verros.ws.dto.SumRequest;
import com.verros.ws.dto.SumResponse;

import com.verros.ws.fault.ServiceFaultBothValuesAreZero;
import com.verros.ws.fault.ServiceFaultNotANumber;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "SumWS")
public interface SumWS {

    @WebMethod
    @WebResult(name = "response") SumResponse calculateSum(@WebParam SumRequest request)
        throws ServiceFaultNotANumber, ServiceFaultBothValuesAreZero;
}
