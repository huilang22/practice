/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaInventoryAssocFindNoOpRequest.java
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
 * NoOp class used to simulate a GeoAreaInventoryAssocFindNoOpRequest Udt Request/Response
 *
 */
public class GeoAreaInventoryAssocFindNoOpRequest extends GeoAreaInventoryAssocRequest {
/**
 *
 * Constructor to create a   GeoAreaInventoryAssocFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GeoAreaInventoryAssocFindNoOpRequest(String id, GeoAreaInventoryAssocObjectDataList noOpIn) {
    super(id, "GeoAreaInventoryAssocFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = GeoAreaInventoryAssocObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GeoAreaInventoryAssoc", noOpIn);
      }
      addInput("GeoAreaInventoryAssoc", mapList);
    }
  }
/**
 *
 * Retrieves the GeoAreaInventoryAssocObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public GeoAreaInventoryAssocObjectDataList getOutput() {
    return GeoAreaInventoryAssocObjectHelper.fromMapList(outputMap, "GeoAreaInventoryAssocList");
  }
}
