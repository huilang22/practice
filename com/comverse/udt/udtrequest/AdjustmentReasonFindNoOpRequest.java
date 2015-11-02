/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentReasonFindNoOpRequest.java
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
 * NoOp class used to simulate a AdjustmentReasonFindNoOpRequest Udt Request/Response
 *
 */
public class AdjustmentReasonFindNoOpRequest extends AdjustmentReasonRequest {
/**
 *
 * Constructor to create a   AdjustmentReasonFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AdjustmentReasonFindNoOpRequest(String id, AdjustmentReasonObjectDataList noOpIn) {
    super(id, "AdjustmentReasonFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AdjustmentReasonObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AdjustmentReason", noOpIn);
      }
      addInput("AdjustmentReason", mapList);
    }
  }
/**
 *
 * Retrieves the AdjustmentReasonObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AdjustmentReasonObjectDataList getOutput() {
    return AdjustmentReasonObjectHelper.fromMapList(outputMap, "AdjustmentReasonList");
  }
}
