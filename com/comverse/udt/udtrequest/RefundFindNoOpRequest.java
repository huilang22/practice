/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefundFindNoOpRequest.java
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
 * NoOp class used to simulate a RefundFindNoOpRequest Udt Request/Response
 *
 */
public class RefundFindNoOpRequest extends RefundRequest {
/**
 *
 * Constructor to create a   RefundFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RefundFindNoOpRequest(String id, RefundObjectDataList noOpIn) {
    super(id, "RefundFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RefundObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Refund", noOpIn);
      }
      addInput("Refund", mapList);
    }
  }
/**
 *
 * Retrieves the RefundObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RefundObjectDataList getOutput() {
    return RefundObjectHelper.fromMapList(outputMap, "RefundList");
  }
}
