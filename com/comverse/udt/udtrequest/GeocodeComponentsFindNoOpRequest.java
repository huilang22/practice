/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeocodeComponentsFindNoOpRequest.java
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
 * NoOp class used to simulate a GeocodeComponentsFindNoOpRequest Udt Request/Response
 *
 */
public class GeocodeComponentsFindNoOpRequest extends GeocodeRequest {
/**
 *
 * Constructor to create a   GeocodeComponentsFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GeocodeComponentsFindNoOpRequest(String id, GeocodeComponentsObjectDataList noOpIn) {
    super(id, "GeocodeComponentsFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = GeocodeComponentsObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GeocodeComponents", noOpIn);
      }
      addInput("GeocodeComponents", mapList);
    }
  }
/**
 *
 * Retrieves the GeocodeComponentsObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public GeocodeComponentsObjectDataList getOutput() {
    return GeocodeComponentsObjectHelper.fromMapList(outputMap, "GeocodeComponentsList");
  }
}
