/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaBoundaryConditionFindNoOpRequest.java
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
 * NoOp class used to simulate a GeoAreaBoundaryConditionFindNoOpRequest Udt Request/Response
 *
 */
public class GeoAreaBoundaryConditionFindNoOpRequest extends GeoAreaBoundaryConditionRequest {
/**
 *
 * Constructor to create a   GeoAreaBoundaryConditionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GeoAreaBoundaryConditionFindNoOpRequest(String id, GeoAreaBoundaryConditionObjectDataList noOpIn) {
    super(id, "GeoAreaBoundaryConditionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = GeoAreaBoundaryConditionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GeoAreaBoundaryCondition", noOpIn);
      }
      addInput("GeoAreaBoundaryCondition", mapList);
    }
  }
/**
 *
 * Retrieves the GeoAreaBoundaryConditionObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public GeoAreaBoundaryConditionObjectDataList getOutput() {
    return GeoAreaBoundaryConditionObjectHelper.fromMapList(outputMap, "GeoAreaBoundaryConditionList");
  }
}
