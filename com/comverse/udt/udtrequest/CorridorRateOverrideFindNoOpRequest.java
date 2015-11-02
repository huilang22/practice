/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorRateOverrideFindNoOpRequest.java
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
 * NoOp class used to simulate a CorridorRateOverrideFindNoOpRequest Udt Request/Response
 *
 */
public class CorridorRateOverrideFindNoOpRequest extends CorridorRateOverrideRequest {
/**
 *
 * Constructor to create a   CorridorRateOverrideFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CorridorRateOverrideFindNoOpRequest(String id, CROObjectDataList noOpIn) {
    super(id, "CorridorRateOverrideFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CROObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CorridorRateOverride", noOpIn);
      }
      addInput("CorridorRateOverride", mapList);
    }
  }
/**
 *
 * Retrieves the CROObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CROObjectDataList getOutput() {
    return CROObjectHelper.fromMapList(outputMap, "CorridorRateOverrideList");
  }
}
