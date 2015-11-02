/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefundReasonFindNoOpRequest.java
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
 * NoOp class used to simulate a RefundReasonFindNoOpRequest Udt Request/Response
 *
 */
public class RefundReasonFindNoOpRequest extends RefundReasonRequest {
/**
 *
 * Constructor to create a   RefundReasonFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RefundReasonFindNoOpRequest(String id, RefundReasonObjectDataList noOpIn) {
    super(id, "RefundReasonFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RefundReasonObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RefundReason", noOpIn);
      }
      addInput("RefundReason", mapList);
    }
  }
/**
 *
 * Retrieves the RefundReasonObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RefundReasonObjectDataList getOutput() {
    return RefundReasonObjectHelper.fromMapList(outputMap, "RefundReasonList");
  }
}
