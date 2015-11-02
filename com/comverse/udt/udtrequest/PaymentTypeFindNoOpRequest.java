/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a PaymentTypeFindNoOpRequest Udt Request/Response
 *
 */
public class PaymentTypeFindNoOpRequest extends PaymentTypeRequest {
/**
 *
 * Constructor to create a   PaymentTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PaymentTypeFindNoOpRequest(String id, PaymentTypeObjectDataList noOpIn) {
    super(id, "PaymentTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = PaymentTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PaymentType", noOpIn);
      }
      addInput("PaymentType", mapList);
    }
  }
/**
 *
 * Retrieves the PaymentTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public PaymentTypeObjectDataList getOutput() {
    return PaymentTypeObjectHelper.fromMapList(outputMap, "PaymentTypeList");
  }
}
