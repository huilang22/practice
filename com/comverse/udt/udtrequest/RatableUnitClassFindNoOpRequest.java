/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatableUnitClassFindNoOpRequest.java
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
 * NoOp class used to simulate a RatableUnitClassFindNoOpRequest Udt Request/Response
 *
 */
public class RatableUnitClassFindNoOpRequest extends RatableUnitClassRequest {
/**
 *
 * Constructor to create a   RatableUnitClassFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RatableUnitClassFindNoOpRequest(String id, RUCObjectDataList noOpIn) {
    super(id, "RatableUnitClassFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RUCObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RatableUnitClass", noOpIn);
      }
      addInput("RatableUnitClass", mapList);
    }
  }
/**
 *
 * Retrieves the RUCObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RUCObjectDataList getOutput() {
    return RUCObjectHelper.fromMapList(outputMap, "RatableUnitClassList");
  }
}
