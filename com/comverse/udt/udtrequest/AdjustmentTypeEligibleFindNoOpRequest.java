/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTypeEligibleFindNoOpRequest.java
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
 * NoOp class used to simulate a AdjustmentTypeEligibleFindNoOpRequest Udt Request/Response
 *
 */
public class AdjustmentTypeEligibleFindNoOpRequest extends AdjustmentTypeRequest {
/**
 *
 * Constructor to create a   AdjustmentTypeEligibleFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AdjustmentTypeEligibleFindNoOpRequest(String id, AdjustmentTypeObjectDataList noOpIn) {
    super(id, "AdjustmentTypeEligibleFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AdjustmentTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AdjustmentType", noOpIn);
      }
      addInput("AdjustmentType", mapList);
    }
  }
/**
 *
 * Retrieves the AdjustmentTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AdjustmentTypeObjectDataList getOutput() {
    return AdjustmentTypeObjectHelper.fromMapList(outputMap, "AdjustmentTypeList");
  }
}
