package com.verros.ws.impl;

import com.verros.ws.api.SumWS;
import com.verros.ws.dto.SumRequest;
import com.verros.ws.dto.SumResponse;

import com.verros.ws.fault.ServiceFaultBothValuesAreZero;
import com.verros.ws.fault.ServiceFaultNotANumber;
import javax.jws.WebService;

@WebService(
        name = "SumWSImpl",
        portName = "CalculatorPort",
        serviceName = "SumService")
public class SumWSImpl implements SumWS {

    @Override
    public SumResponse calculateSum(SumRequest request)
        throws ServiceFaultNotANumber, ServiceFaultBothValuesAreZero {

        SumResponse sumResponse =  new SumResponse();
        if(request.getNum1() != (int)request.getNum1() || request.getNum2() != (int)request.getNum2() ){
            throw new ServiceFaultNotANumber();
        }else if(request.getNum1() == 0 &&  request.getNum2() == 0 ){
            ServiceFaultBothValuesAreZero serviceFaultBothValuesAreZero = new ServiceFaultBothValuesAreZero("Invalid Input","Both of the numbers are zero");
            if ( serviceFaultBothValuesAreZero !=null) {
                System.out.println("not null");
            }else {
                System.out.println("null");
            }
            throw serviceFaultBothValuesAreZero;
        }else{
            int result = request.getNum1() + request.getNum2();
            sumResponse.setResult(result);
        }

        return  sumResponse;
    }
}
