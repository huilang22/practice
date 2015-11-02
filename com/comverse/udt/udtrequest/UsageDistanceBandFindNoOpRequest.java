/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageDistanceBandFindNoOpRequest.java
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
 * NoOp class used to simulate a UsageDistanceBandFindNoOpRequest Udt Request/Response
 *
 */
public class UsageDistanceBandFindNoOpRequest extends UsageDistanceBandRequest {
/**
 *
 * Constructor to create a   UsageDistanceBandFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UsageDistanceBandFindNoOpRequest(String id, UsageDistBandObjectDataList noOpIn) {
    super(id, "UsageDistanceBandFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = UsageDistBandObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UsageDistanceBand", noOpIn);
      }
      addInput("UsageDistanceBand", mapList);
    }
  }
/**
 *
 * Retrieves the UsageDistBandObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public UsageDistBandObjectDataList getOutput() {
    return UsageDistBandObjectHelper.fromMapList(outputMap, "UsageDistanceBandList");
  }
}
