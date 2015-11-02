/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemRatingFindNoOpRequest.java
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
 * NoOp class used to simulate a CtcItemRatingFindNoOpRequest Udt Request/Response
 *
 */
public class CtcItemRatingFindNoOpRequest extends CtcItemRatingRequest {
/**
 *
 * Constructor to create a   CtcItemRatingFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcItemRatingFindNoOpRequest(String id, CtcItemRatingObjectDataList noOpIn) {
    super(id, "CtcItemRatingFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CtcItemRatingObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcItemRating", noOpIn);
      }
      addInput("CtcItemRating", mapList);
    }
  }
/**
 *
 * Retrieves the CtcItemRatingObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CtcItemRatingObjectDataList getOutput() {
    return CtcItemRatingObjectHelper.fromMapList(outputMap, "CtcItemRatingList");
  }
}
