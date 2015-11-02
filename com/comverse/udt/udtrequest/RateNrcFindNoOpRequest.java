/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateNrcFindNoOpRequest.java
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
 * NoOp class used to simulate a RateNrcFindNoOpRequest Udt Request/Response
 *
 */
public class RateNrcFindNoOpRequest extends RateNrcRequest {
/**
 *
 * Constructor to create a   RateNrcFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateNrcFindNoOpRequest(String id, RateNrcObjectDataList noOpIn) {
    super(id, "RateNrcFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RateNrcObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RateNrc", noOpIn);
      }
      addInput("RateNrc", mapList);
    }
  }
/**
 *
 * Retrieves the RateNrcObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RateNrcObjectDataList getOutput() {
    return RateNrcObjectHelper.fromMapList(outputMap, "RateNrcList");
  }
}
