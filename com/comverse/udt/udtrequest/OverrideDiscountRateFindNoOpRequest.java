/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OverrideDiscountRateFindNoOpRequest.java
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
 * NoOp class used to simulate a OverrideDiscountRateFindNoOpRequest Udt Request/Response
 *
 */
public class OverrideDiscountRateFindNoOpRequest extends OverrideDiscountRateRequest {
/**
 *
 * Constructor to create a   OverrideDiscountRateFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OverrideDiscountRateFindNoOpRequest(String id, RDOverrideObjectDataList noOpIn) {
    super(id, "OverrideDiscountRateFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RDOverrideObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("OverrideDiscountRate", noOpIn);
      }
      addInput("OverrideDiscountRate", mapList);
    }
  }
/**
 *
 * Retrieves the RDOverrideObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RDOverrideObjectDataList getOutput() {
    return RDOverrideObjectHelper.fromMapList(outputMap, "OverrideDiscountRateList");
  }
}
