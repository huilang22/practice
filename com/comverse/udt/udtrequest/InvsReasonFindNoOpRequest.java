/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsReasonFindNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsReasonFindNoOpRequest Udt Request/Response
 *
 */
public class InvsReasonFindNoOpRequest extends InvsReasonRequest {
/**
 *
 * Constructor to create a   InvsReasonFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsReasonFindNoOpRequest(String id, InvsReasonObjectDataList noOpIn) {
    super(id, "InvsReasonFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsReasonObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsReason", noOpIn);
      }
      addInput("InvsReason", mapList);
    }
  }
/**
 *
 * Retrieves the InvsReasonObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsReasonObjectDataList getOutput() {
    return InvsReasonObjectHelper.fromMapList(outputMap, "InvsReasonList");
  }
}
