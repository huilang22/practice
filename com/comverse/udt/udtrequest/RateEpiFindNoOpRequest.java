/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateEpiFindNoOpRequest.java
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
 * NoOp class used to simulate a RateEpiFindNoOpRequest Udt Request/Response
 *
 */
public class RateEpiFindNoOpRequest extends RateEpiRequest {
/**
 *
 * Constructor to create a   RateEpiFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateEpiFindNoOpRequest(String id, RateEpiObjectDataList noOpIn) {
    super(id, "RateEpiFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RateEpiObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RateEpi", noOpIn);
      }
      addInput("RateEpi", mapList);
    }
  }
/**
 *
 * Retrieves the RateEpiObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RateEpiObjectDataList getOutput() {
    return RateEpiObjectHelper.fromMapList(outputMap, "RateEpiList");
  }
}
