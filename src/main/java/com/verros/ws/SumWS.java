package com.verros.ws;

import com.verros.ws.dto.SumRequest;
import com.verros.ws.dto.SumResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "SumWS")
public interface SumWS {

    @WebMethod
    @WebResult(name = "response") SumResponse calculateSum(@WebParam SumRequest request);
}
