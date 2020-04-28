package com.verros.ws;

import com.verros.ws.dto.SumRequest;
import com.verros.ws.dto.SumResponse;

import javax.jws.WebService;

@WebService(
        name = "SumWSImpl",
        portName = "CalculatorPort",
        serviceName = "SumService")
public class SumWSImpl implements SumWS {

    @Override
    public SumResponse calculateSum(SumRequest request) {
        SumResponse sumResponse =  new SumResponse();
        int result = request.getNum1() + request.getNum2();
        sumResponse.setResult(result);
        return  sumResponse;
    }
}
