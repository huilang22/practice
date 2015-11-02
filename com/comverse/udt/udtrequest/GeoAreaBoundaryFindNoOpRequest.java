/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaBoundaryFindNoOpRequest.java
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
 * NoOp class used to simulate a GeoAreaBoundaryFindNoOpRequest Udt Request/Response
 *
 */
public class GeoAreaBoundaryFindNoOpRequest extends GeoAreaBoundaryRequest {
/**
 *
 * Constructor to create a   GeoAreaBoundaryFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GeoAreaBoundaryFindNoOpRequest(String id, GeoAreaBoundaryObjectDataList noOpIn) {
    super(id, "GeoAreaBoundaryFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = GeoAreaBoundaryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GeoAreaBoundary", noOpIn);
      }
      addInput("GeoAreaBoundary", mapList);
    }
  }
/**
 *
 * Retrieves the GeoAreaBoundaryObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public GeoAreaBoundaryObjectDataList getOutput() {
    return GeoAreaBoundaryObjectHelper.fromMapList(outputMap, "GeoAreaBoundaryList");
  }
}
