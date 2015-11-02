/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferCategoryFindNoOpRequest.java
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
 * NoOp class used to simulate a CtcOfferCategoryFindNoOpRequest Udt Request/Response
 *
 */
public class CtcOfferCategoryFindNoOpRequest extends CtcOfferCategoryRequest {
/**
 *
 * Constructor to create a   CtcOfferCategoryFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcOfferCategoryFindNoOpRequest(String id, CtcOfferCategoryObjectDataList noOpIn) {
    super(id, "CtcOfferCategoryFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CtcOfferCategoryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcOfferCategory", noOpIn);
      }
      addInput("CtcOfferCategory", mapList);
    }
  }
/**
 *
 * Retrieves the CtcOfferCategoryObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferCategoryObjectDataList getOutput() {
    return CtcOfferCategoryObjectHelper.fromMapList(outputMap, "CtcOfferCategoryList");
  }
}
