/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUnitCrFindNoOpRequest.java
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
 * NoOp class used to simulate a RateUnitCrFindNoOpRequest Udt Request/Response
 *
 */
public class RateUnitCrFindNoOpRequest extends RateUnitCrRequest {
/**
 *
 * Constructor to create a   RateUnitCrFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateUnitCrFindNoOpRequest(String id, RateUnitCrObjectDataList noOpIn) {
    super(id, "RateUnitCrFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RateUnitCrObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RateUnitCr", noOpIn);
      }
      addInput("RateUnitCr", mapList);
    }
  }
/**
 *
 * Retrieves the RateUnitCrObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RateUnitCrObjectDataList getOutput() {
    return RateUnitCrObjectHelper.fromMapList(outputMap, "RateUnitCrList");
  }
}
