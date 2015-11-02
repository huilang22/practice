/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingFindNoOpRequest.java
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
 * NoOp class used to simulate a CtcRatingFindNoOpRequest Udt Request/Response
 *
 */
public class CtcRatingFindNoOpRequest extends CtcRatingRequest {
/**
 *
 * Constructor to create a   CtcRatingFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcRatingFindNoOpRequest(String id, CtcRatingObjectDataList noOpIn) {
    super(id, "CtcRatingFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CtcRatingObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcRating", noOpIn);
      }
      addInput("CtcRating", mapList);
    }
  }
/**
 *
 * Retrieves the CtcRatingObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CtcRatingObjectDataList getOutput() {
    return CtcRatingObjectHelper.fromMapList(outputMap, "CtcRatingList");
  }
}
