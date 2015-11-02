/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LocationCodeFindNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a LocationCodeFindNoOpRequest Udt Request/Response
 *
 */
public class LocationCodeFindNoOpRequest extends LocationCodeRequest {
/**
 *
 * Constructor to create a   LocationCodeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public LocationCodeFindNoOpRequest(String id, LOCObjectDataList noOpIn) {
    super(id, "LocationCodeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = LOCObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("LocationCode", noOpIn);
      }
      addInput("LocationCode", mapList);
    }
  }
/**
 *
 * Retrieves the LOCObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public LOCObjectDataList getOutput() {
    return LOCObjectHelper.fromMapList(outputMap, "LocationCodeList");
  }
}
