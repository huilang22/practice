/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentTransFindNoOpRequest.java
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
 * NoOp class used to simulate a PaymentTransFindNoOpRequest Udt Request/Response
 *
 */
public class PaymentTransFindNoOpRequest extends PaymentTransRequest {
/**
 *
 * Constructor to create a   PaymentTransFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PaymentTransFindNoOpRequest(String id, PaymentTransObjectDataList noOpIn) {
    super(id, "PaymentTransFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = PaymentTransObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PaymentTrans", noOpIn);
      }
      addInput("PaymentTrans", mapList);
    }
  }
/**
 *
 * Retrieves the PaymentTransObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public PaymentTransObjectDataList getOutput() {
    return PaymentTransObjectHelper.fromMapList(outputMap, "PaymentTransList");
  }
}
