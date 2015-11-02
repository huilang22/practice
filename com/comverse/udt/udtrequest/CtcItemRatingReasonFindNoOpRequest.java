/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemRatingReasonFindNoOpRequest.java
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
 * NoOp class used to simulate a CtcItemRatingReasonFindNoOpRequest Udt Request/Response
 *
 */
public class CtcItemRatingReasonFindNoOpRequest extends CtcItemRatingReasonRequest {
/**
 *
 * Constructor to create a   CtcItemRatingReasonFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcItemRatingReasonFindNoOpRequest(String id, CtcItemRatingReasonObjectDataList noOpIn) {
    super(id, "CtcItemRatingReasonFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CtcItemRatingReasonObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcItemRatingReason", noOpIn);
      }
      addInput("CtcItemRatingReason", mapList);
    }
  }
/**
 *
 * Retrieves the CtcItemRatingReasonObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CtcItemRatingReasonObjectDataList getOutput() {
    return CtcItemRatingReasonObjectHelper.fromMapList(outputMap, "CtcItemRatingReasonList");
  }
}
