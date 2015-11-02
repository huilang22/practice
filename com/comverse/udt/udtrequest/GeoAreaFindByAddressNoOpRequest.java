/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaFindByAddressNoOpRequest.java
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
 * NoOp class used to simulate a GeoAreaFindByAddressNoOpRequest Udt Request/Response
 *
 */
public class GeoAreaFindByAddressNoOpRequest extends GeoAreaRequest {
/**
 *
 * Constructor to create a   GeoAreaFindByAddressNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GeoAreaFindByAddressNoOpRequest(String id, GAObjectDataList noOpIn) {
    super(id, "GeoAreaFindByAddressNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = GAObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GeoArea", noOpIn);
      }
      addInput("GeoArea", mapList);
    }
  }
/**
 *
 * Retrieves the GAObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public GAObjectDataList getOutput() {
    return GAObjectHelper.fromMapList(outputMap, "GeoAreaList");
  }
}
