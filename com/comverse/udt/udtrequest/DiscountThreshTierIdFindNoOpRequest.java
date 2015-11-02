/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountThreshTierIdFindNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a DiscountThreshTierIdFindNoOpRequest Udt Request/Response
 *
 */
public class DiscountThreshTierIdFindNoOpRequest extends DiscountThreshTierIdRequest {
/**
 *
 * Constructor to create a   DiscountThreshTierIdFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DiscountThreshTierIdFindNoOpRequest(String id, DTTObjectDataList noOpIn) {
    super(id, "DiscountThreshTierIdFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = DTTObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("DiscountThreshTierId", noOpIn);
      }
      addInput("DiscountThreshTierId", mapList);
    }
  }
/**
 *
 * Retrieves the DTTObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public DTTObjectDataList getOutput() {
    return DTTObjectHelper.fromMapList(outputMap, "DiscountThreshTierIdList");
  }
}
