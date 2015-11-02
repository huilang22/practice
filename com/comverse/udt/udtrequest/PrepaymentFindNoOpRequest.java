/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PrepaymentFindNoOpRequest.java
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
 * NoOp class used to simulate a PrepaymentFindNoOpRequest Udt Request/Response
 *
 */
public class PrepaymentFindNoOpRequest extends PrepaymentRequest {
/**
 *
 * Constructor to create a   PrepaymentFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PrepaymentFindNoOpRequest(String id, PrepaymentObjectDataList noOpIn) {
    super(id, "PrepaymentFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = PrepaymentObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Prepayment", noOpIn);
      }
      addInput("Prepayment", mapList);
    }
  }
/**
 *
 * Retrieves the PrepaymentObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public PrepaymentObjectDataList getOutput() {
    return PrepaymentObjectHelper.fromMapList(outputMap, "PrepaymentList");
  }
}
