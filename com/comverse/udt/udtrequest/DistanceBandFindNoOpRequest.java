/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DistanceBandFindNoOpRequest.java
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
 * NoOp class used to simulate a DistanceBandFindNoOpRequest Udt Request/Response
 *
 */
public class DistanceBandFindNoOpRequest extends DistanceBandRequest {
/**
 *
 * Constructor to create a   DistanceBandFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DistanceBandFindNoOpRequest(String id, DistanceBandObjectDataList noOpIn) {
    super(id, "DistanceBandFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = DistanceBandObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("DistanceBand", noOpIn);
      }
      addInput("DistanceBand", mapList);
    }
  }
/**
 *
 * Retrieves the DistanceBandObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public DistanceBandObjectDataList getOutput() {
    return DistanceBandObjectHelper.fromMapList(outputMap, "DistanceBandList");
  }
}
