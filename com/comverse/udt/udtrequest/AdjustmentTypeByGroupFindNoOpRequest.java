/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTypeByGroupFindNoOpRequest.java
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
 * NoOp class used to simulate a AdjustmentTypeByGroupFindNoOpRequest Udt Request/Response
 *
 */
public class AdjustmentTypeByGroupFindNoOpRequest extends AdjustmentTypeRequest {
/**
 *
 * Constructor to create a   AdjustmentTypeByGroupFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AdjustmentTypeByGroupFindNoOpRequest(String id, AdjustmentTypeObjectDataList noOpIn) {
    super(id, "AdjustmentTypeByGroupFindNoOpRequest");
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
