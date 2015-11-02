/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentNoBackoutFindNoOpRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a PaymentNoBackoutFindNoOpRequest Udt Request/Response
 *
 */
public class PaymentNoBackoutFindNoOpRequest extends PaymentRequest {
/**
 *
 * Constructor to create a   PaymentNoBackoutFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PaymentNoBackoutFindNoOpRequest(String id, PaymentObjectDataList noOpIn) {
    super(id, "PaymentNoBackoutFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = PaymentObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Payment", noOpIn);
      }
      addInput("Payment", mapList);
    }
  }
/**
 *
 * Retrieves the PaymentObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public PaymentObjectDataList getOutput() {
    return PaymentObjectHelper.fromMapList(outputMap, "PaymentList");
  }
}
