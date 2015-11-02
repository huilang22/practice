/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdThresholdFindNoOpRequest.java
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
 * NoOp class used to simulate a InvdThresholdFindNoOpRequest Udt Request/Response
 *
 */
public class InvdThresholdFindNoOpRequest extends InvdThresholdRequest {
/**
 *
 * Constructor to create a   InvdThresholdFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvdThresholdFindNoOpRequest(String id, InvdThresholdObjectDataList noOpIn) {
    super(id, "InvdThresholdFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvdThresholdObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvdThreshold", noOpIn);
      }
      addInput("InvdThreshold", mapList);
    }
  }
/**
 *
 * Retrieves the InvdThresholdObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvdThresholdObjectDataList getOutput() {
    return InvdThresholdObjectHelper.fromMapList(outputMap, "InvdThresholdList");
  }
}
