/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentProfileFindNoOpRequest.java
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
 * NoOp class used to simulate a PaymentProfileFindNoOpRequest Udt Request/Response
 *
 */
public class PaymentProfileFindNoOpRequest extends PaymentProfileRequest {
/**
 *
 * Constructor to create a   PaymentProfileFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PaymentProfileFindNoOpRequest(String id, PaymentProfileObjectDataList noOpIn) {
    super(id, "PaymentProfileFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = PaymentProfileObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PaymentProfile", noOpIn);
      }
      addInput("PaymentProfile", mapList);
    }
  }
/**
 *
 * Retrieves the PaymentProfileObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public PaymentProfileObjectDataList getOutput() {
    return PaymentProfileObjectHelper.fromMapList(outputMap, "PaymentProfileList");
  }
}
