/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtPaymentProfileFindNoOpRequest.java
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
 * NoOp class used to simulate a AxrtPaymentProfileFindNoOpRequest Udt Request/Response
 *
 */
public class AxrtPaymentProfileFindNoOpRequest extends AxrtPaymentProfileRequest {
/**
 *
 * Constructor to create a   AxrtPaymentProfileFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AxrtPaymentProfileFindNoOpRequest(String id, AxrtPaymentProfileObjectDataList noOpIn) {
    super(id, "AxrtPaymentProfileFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AxrtPaymentProfileObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AxrtPaymentProfile", noOpIn);
      }
      addInput("AxrtPaymentProfile", mapList);
    }
  }
/**
 *
 * Retrieves the AxrtPaymentProfileObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AxrtPaymentProfileObjectDataList getOutput() {
    return AxrtPaymentProfileObjectHelper.fromMapList(outputMap, "AxrtPaymentProfileList");
  }
}
