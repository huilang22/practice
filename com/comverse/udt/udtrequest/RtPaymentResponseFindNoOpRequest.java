/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RtPaymentResponseFindNoOpRequest.java
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
 * NoOp class used to simulate a RtPaymentResponseFindNoOpRequest Udt Request/Response
 *
 */
public class RtPaymentResponseFindNoOpRequest extends RtPaymentResponseRequest {
/**
 *
 * Constructor to create a   RtPaymentResponseFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RtPaymentResponseFindNoOpRequest(String id, RtPaymentResponseObjectDataList noOpIn) {
    super(id, "RtPaymentResponseFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RtPaymentResponseObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RtPaymentResponse", noOpIn);
      }
      addInput("RtPaymentResponse", mapList);
    }
  }
/**
 *
 * Retrieves the RtPaymentResponseObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RtPaymentResponseObjectDataList getOutput() {
    return RtPaymentResponseObjectHelper.fromMapList(outputMap, "RtPaymentResponseList");
  }
}
