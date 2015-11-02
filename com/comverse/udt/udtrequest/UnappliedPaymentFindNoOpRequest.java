/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnappliedPaymentFindNoOpRequest.java
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
 * NoOp class used to simulate a UnappliedPaymentFindNoOpRequest Udt Request/Response
 *
 */
public class UnappliedPaymentFindNoOpRequest extends UnappliedPaymentRequest {
/**
 *
 * Constructor to create a   UnappliedPaymentFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UnappliedPaymentFindNoOpRequest(String id, UnappliedPaymentObjectDataList noOpIn) {
    super(id, "UnappliedPaymentFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = UnappliedPaymentObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UnappliedPayment", noOpIn);
      }
      addInput("UnappliedPayment", mapList);
    }
  }
/**
 *
 * Retrieves the UnappliedPaymentObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public UnappliedPaymentObjectDataList getOutput() {
    return UnappliedPaymentObjectHelper.fromMapList(outputMap, "UnappliedPaymentList");
  }
}
