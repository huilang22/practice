/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateFindNoOpRequest.java
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
 * NoOp class used to simulate a RbrRateFindNoOpRequest Udt Request/Response
 *
 */
public class RbrRateFindNoOpRequest extends RbrRateRequest {
/**
 *
 * Constructor to create a   RbrRateFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RbrRateFindNoOpRequest(String id, RbrRatesObjectDataList noOpIn) {
    super(id, "RbrRateFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RbrRatesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RbrRate", noOpIn);
      }
      addInput("RbrRate", mapList);
    }
  }
/**
 *
 * Retrieves the RbrRatesObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RbrRatesObjectDataList getOutput() {
    return RbrRatesObjectHelper.fromMapList(outputMap, "RbrRateList");
  }
}
