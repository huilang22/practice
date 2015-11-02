/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a GeoAreaTypeFindNoOpRequest Udt Request/Response
 *
 */
public class GeoAreaTypeFindNoOpRequest extends GeoAreaTypeRequest {
/**
 *
 * Constructor to create a   GeoAreaTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GeoAreaTypeFindNoOpRequest(String id, GeoAreaTypeObjectDataList noOpIn) {
    super(id, "GeoAreaTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = GeoAreaTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GeoAreaType", noOpIn);
      }
      addInput("GeoAreaType", mapList);
    }
  }
/**
 *
 * Retrieves the GeoAreaTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public GeoAreaTypeObjectDataList getOutput() {
    return GeoAreaTypeObjectHelper.fromMapList(outputMap, "GeoAreaTypeList");
  }
}
