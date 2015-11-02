/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeocodeFindNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a GeocodeFindNoOpRequest Udt Request/Response
 *
 */
public class GeocodeFindNoOpRequest extends GeocodeRequest {
/**
 *
 * Constructor to create a   GeocodeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GeocodeFindNoOpRequest(String id, GeocodeObjectDataList noOpIn) {
    super(id, "GeocodeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = GeocodeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Geocode", noOpIn);
      }
      addInput("Geocode", mapList);
    }
  }
/**
 *
 * Retrieves the GeocodeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public GeocodeObjectDataList getOutput() {
    return GeocodeObjectHelper.fromMapList(outputMap, "GeocodeList");
  }
}
