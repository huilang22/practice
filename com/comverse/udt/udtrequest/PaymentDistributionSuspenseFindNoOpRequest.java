/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentDistributionSuspenseFindNoOpRequest.java
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
 * NoOp class used to simulate a PaymentDistributionSuspenseFindNoOpRequest Udt Request/Response
 *
 */
public class PaymentDistributionSuspenseFindNoOpRequest extends PaymentDistributionRequest {
/**
 *
 * Constructor to create a   PaymentDistributionSuspenseFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PaymentDistributionSuspenseFindNoOpRequest(String id, PaymentDistributionObjectDataList noOpIn) {
    super(id, "PaymentDistributionSuspenseFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = PaymentDistributionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PaymentDistribution", noOpIn);
      }
      addInput("PaymentDistribution", mapList);
    }
  }
/**
 *
 * Retrieves the PaymentDistributionObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public PaymentDistributionObjectDataList getOutput() {
    return PaymentDistributionObjectHelper.fromMapList(outputMap, "PaymentDistributionList");
  }
}
