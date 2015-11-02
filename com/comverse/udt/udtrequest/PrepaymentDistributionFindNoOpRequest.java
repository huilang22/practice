/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PrepaymentDistributionFindNoOpRequest.java
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
 * NoOp class used to simulate a PrepaymentDistributionFindNoOpRequest Udt Request/Response
 *
 */
public class PrepaymentDistributionFindNoOpRequest extends PrepaymentDistributionRequest {
/**
 *
 * Constructor to create a   PrepaymentDistributionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PrepaymentDistributionFindNoOpRequest(String id, PrepaymentDistributionObjectDataList noOpIn) {
    super(id, "PrepaymentDistributionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = PrepaymentDistributionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PrepaymentDistribution", noOpIn);
      }
      addInput("PrepaymentDistribution", mapList);
    }
  }
/**
 *
 * Retrieves the PrepaymentDistributionObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public PrepaymentDistributionObjectDataList getOutput() {
    return PrepaymentDistributionObjectHelper.fromMapList(outputMap, "PrepaymentDistributionList");
  }
}
