/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentNoBackoutFindNoOpRequest.java
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
 * NoOp class used to simulate a AdjustmentNoBackoutFindNoOpRequest Udt Request/Response
 *
 */
public class AdjustmentNoBackoutFindNoOpRequest extends AdjustmentRequest {
/**
 *
 * Constructor to create a   AdjustmentNoBackoutFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AdjustmentNoBackoutFindNoOpRequest(String id, AdjustmentObjectDataList noOpIn) {
    super(id, "AdjustmentNoBackoutFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AdjustmentObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Adjustment", noOpIn);
      }
      addInput("Adjustment", mapList);
    }
  }
/**
 *
 * Retrieves the AdjustmentObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AdjustmentObjectDataList getOutput() {
    return AdjustmentObjectHelper.fromMapList(outputMap, "AdjustmentList");
  }
}
