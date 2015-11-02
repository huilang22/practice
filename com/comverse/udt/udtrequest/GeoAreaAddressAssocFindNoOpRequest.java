/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaAddressAssocFindNoOpRequest.java
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
 * NoOp class used to simulate a GeoAreaAddressAssocFindNoOpRequest Udt Request/Response
 *
 */
public class GeoAreaAddressAssocFindNoOpRequest extends GeoAreaAddressAssocRequest {
/**
 *
 * Constructor to create a   GeoAreaAddressAssocFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GeoAreaAddressAssocFindNoOpRequest(String id, GeoAreaAddressAssocObjectDataList noOpIn) {
    super(id, "GeoAreaAddressAssocFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = GeoAreaAddressAssocObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GeoAreaAddressAssoc", noOpIn);
      }
      addInput("GeoAreaAddressAssoc", mapList);
    }
  }
/**
 *
 * Retrieves the GeoAreaAddressAssocObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public GeoAreaAddressAssocObjectDataList getOutput() {
    return GeoAreaAddressAssocObjectHelper.fromMapList(outputMap, "GeoAreaAddressAssocList");
  }
}
