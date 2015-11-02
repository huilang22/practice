/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaServiceabilityFindNoOpRequest.java
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

import com.csgsystems.svbl.data.*;

/**
 *
 * NoOp class used to simulate a GeoAreaServiceabilityFindNoOpRequest Udt Request/Response
 *
 */
public class GeoAreaServiceabilityFindNoOpRequest extends GeoAreaServiceabilityRequest {
/**
 *
 * Constructor to create a   GeoAreaServiceabilityFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GeoAreaServiceabilityFindNoOpRequest(String id, GASObjDataList noOpIn) {
    super(id, "GeoAreaServiceabilityFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = GASObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GeoAreaServiceability", noOpIn);
      }
      addInput("GeoAreaServiceability", mapList);
    }
  }
/**
 *
 * Retrieves the GASObjDataList passed into the constructor
 * @return Simulated response
 *
 */
  public GASObjDataList getOutput() {
    return GASObjHelper.fromMapList(outputMap, "GeoAreaServiceabilityList");
  }
}
