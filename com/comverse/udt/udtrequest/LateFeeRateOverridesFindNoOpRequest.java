/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LateFeeRateOverridesFindNoOpRequest.java
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
 * NoOp class used to simulate a LateFeeRateOverridesFindNoOpRequest Udt Request/Response
 *
 */
public class LateFeeRateOverridesFindNoOpRequest extends LateFeeRateOverridesRequest {
/**
 *
 * Constructor to create a   LateFeeRateOverridesFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public LateFeeRateOverridesFindNoOpRequest(String id, LateFeeRateOverridesObjectDataList noOpIn) {
    super(id, "LateFeeRateOverridesFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = LateFeeRateOverridesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("LateFeeRateOverrides", noOpIn);
      }
      addInput("LateFeeRateOverrides", mapList);
    }
  }
/**
 *
 * Retrieves the LateFeeRateOverridesObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public LateFeeRateOverridesObjectDataList getOutput() {
    return LateFeeRateOverridesObjectHelper.fromMapList(outputMap, "LateFeeRateOverridesList");
  }
}
