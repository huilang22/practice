/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsRateCenterFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsRateCenterFindNoOpRequest Udt Request/Response
 *
 */
public class InvsRateCenterFindNoOpRequest extends InvsRateCenterRequest {
/**
 *
 * Constructor to create a   InvsRateCenterFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsRateCenterFindNoOpRequest(String id, InvsRateCenterObjectDataList noOpIn) {
    super(id, "InvsRateCenterFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsRateCenterObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsRateCenter", noOpIn);
      }
      addInput("InvsRateCenter", mapList);
    }
  }
/**
 *
 * Retrieves the InvsRateCenterObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsRateCenterObjectDataList getOutput() {
    return InvsRateCenterObjectHelper.fromMapList(outputMap, "InvsRateCenterList");
  }
}
