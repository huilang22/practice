/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingReasonFindNoOpRequest.java
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

import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcRatingReasonFindNoOpRequest Udt Request/Response
 *
 */
public class CtcRatingReasonFindNoOpRequest extends CtcRatingReasonRequest {
/**
 *
 * Constructor to create a   CtcRatingReasonFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcRatingReasonFindNoOpRequest(String id, CtcRatingReasonObjectDataList noOpIn) {
    super(id, "CtcRatingReasonFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CtcRatingReasonObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcRatingReason", noOpIn);
      }
      addInput("CtcRatingReason", mapList);
    }
  }
/**
 *
 * Retrieves the CtcRatingReasonObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CtcRatingReasonObjectDataList getOutput() {
    return CtcRatingReasonObjectHelper.fromMapList(outputMap, "CtcRatingReasonList");
  }
}
