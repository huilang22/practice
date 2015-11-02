/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressGeoAreaFindNoOpRequest.java
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
 * NoOp class used to simulate a AddressGeoAreaFindNoOpRequest Udt Request/Response
 *
 */
public class AddressGeoAreaFindNoOpRequest extends AddressGeoAreaRequest {
/**
 *
 * Constructor to create a   AddressGeoAreaFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AddressGeoAreaFindNoOpRequest(String id, AGAObjectDataList noOpIn) {
    super(id, "AddressGeoAreaFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AGAObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AddressGeoArea", noOpIn);
      }
      addInput("AddressGeoArea", mapList);
    }
  }
/**
 *
 * Retrieves the AGAObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AGAObjectDataList getOutput() {
    return AGAObjectHelper.fromMapList(outputMap, "AddressGeoAreaList");
  }
}
