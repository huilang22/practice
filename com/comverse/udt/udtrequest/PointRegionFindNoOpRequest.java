/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointRegionFindNoOpRequest.java
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
 * NoOp class used to simulate a PointRegionFindNoOpRequest Udt Request/Response
 *
 */
public class PointRegionFindNoOpRequest extends PointRegionRequest {
/**
 *
 * Constructor to create a   PointRegionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PointRegionFindNoOpRequest(String id, PointRegionObjectDataList noOpIn) {
    super(id, "PointRegionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = PointRegionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PointRegion", noOpIn);
      }
      addInput("PointRegion", mapList);
    }
  }
/**
 *
 * Retrieves the PointRegionObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public PointRegionObjectDataList getOutput() {
    return PointRegionObjectHelper.fromMapList(outputMap, "PointRegionList");
  }
}
