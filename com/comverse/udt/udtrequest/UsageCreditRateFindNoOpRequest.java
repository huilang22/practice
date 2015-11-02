/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageCreditRateFindNoOpRequest.java
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
 * NoOp class used to simulate a UsageCreditRateFindNoOpRequest Udt Request/Response
 *
 */
public class UsageCreditRateFindNoOpRequest extends UsageCreditRateRequest {
/**
 *
 * Constructor to create a   UsageCreditRateFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UsageCreditRateFindNoOpRequest(String id, RUCreditObjectDataList noOpIn) {
    super(id, "UsageCreditRateFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RUCreditObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UsageCreditRate", noOpIn);
      }
      addInput("UsageCreditRate", mapList);
    }
  }
/**
 *
 * Retrieves the RUCreditObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RUCreditObjectDataList getOutput() {
    return RUCreditObjectHelper.fromMapList(outputMap, "UsageCreditRateList");
  }
}
