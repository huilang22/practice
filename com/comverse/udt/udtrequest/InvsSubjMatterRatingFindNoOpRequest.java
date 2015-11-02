/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSubjMatterRatingFindNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsSubjMatterRatingFindNoOpRequest Udt Request/Response
 *
 */
public class InvsSubjMatterRatingFindNoOpRequest extends InvsSubjMatterRatingRequest {
/**
 *
 * Constructor to create a   InvsSubjMatterRatingFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsSubjMatterRatingFindNoOpRequest(String id, InvsSubjMatterRatingObjectDataList noOpIn) {
    super(id, "InvsSubjMatterRatingFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsSubjMatterRatingObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsSubjMatterRating", noOpIn);
      }
      addInput("InvsSubjMatterRating", mapList);
    }
  }
/**
 *
 * Retrieves the InvsSubjMatterRatingObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSubjMatterRatingObjectDataList getOutput() {
    return InvsSubjMatterRatingObjectHelper.fromMapList(outputMap, "InvsSubjMatterRatingList");
  }
}
