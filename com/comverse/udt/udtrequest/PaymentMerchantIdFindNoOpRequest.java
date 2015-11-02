/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentMerchantIdFindNoOpRequest.java
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
 * NoOp class used to simulate a PaymentMerchantIdFindNoOpRequest Udt Request/Response
 *
 */
public class PaymentMerchantIdFindNoOpRequest extends PaymentMerchantIdRequest {
/**
 *
 * Constructor to create a   PaymentMerchantIdFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PaymentMerchantIdFindNoOpRequest(String id, PaymentMerchantIdObjectDataList noOpIn) {
    super(id, "PaymentMerchantIdFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = PaymentMerchantIdObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PaymentMerchantId", noOpIn);
      }
      addInput("PaymentMerchantId", mapList);
    }
  }
/**
 *
 * Retrieves the PaymentMerchantIdObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public PaymentMerchantIdObjectDataList getOutput() {
    return PaymentMerchantIdObjectHelper.fromMapList(outputMap, "PaymentMerchantIdList");
  }
}
