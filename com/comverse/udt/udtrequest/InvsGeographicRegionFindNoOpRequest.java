/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsGeographicRegionFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsGeographicRegionFindNoOpRequest Udt Request/Response
 *
 */
public class InvsGeographicRegionFindNoOpRequest extends InvsGeographicRegionRequest {
/**
 *
 * Constructor to create a   InvsGeographicRegionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsGeographicRegionFindNoOpRequest(String id, InvsGeographicRegionObjectDataList noOpIn) {
    super(id, "InvsGeographicRegionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsGeographicRegionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsGeographicRegion", noOpIn);
      }
      addInput("InvsGeographicRegion", mapList);
    }
  }
/**
 *
 * Retrieves the InvsGeographicRegionObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsGeographicRegionObjectDataList getOutput() {
    return InvsGeographicRegionObjectHelper.fromMapList(outputMap, "InvsGeographicRegionList");
  }
}
