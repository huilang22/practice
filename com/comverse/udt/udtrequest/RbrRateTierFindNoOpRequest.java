/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateTierFindNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a RbrRateTierFindNoOpRequest Udt Request/Response
 *
 */
public class RbrRateTierFindNoOpRequest extends RbrRateTierRequest {
/**
 *
 * Constructor to create a   RbrRateTierFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RbrRateTierFindNoOpRequest(String id, RbrRteTierObjectDataList noOpIn) {
    super(id, "RbrRateTierFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RbrRteTierObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RbrRateTier", noOpIn);
      }
      addInput("RbrRateTier", mapList);
    }
  }
/**
 *
 * Retrieves the RbrRteTierObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RbrRteTierObjectDataList getOutput() {
    return RbrRteTierObjectHelper.fromMapList(outputMap, "RbrRateTierList");
  }
}
