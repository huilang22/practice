/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentMerchantIdAssignFindNoOpRequest.java
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
 * NoOp class used to simulate a PaymentMerchantIdAssignFindNoOpRequest Udt Request/Response
 *
 */
public class PaymentMerchantIdAssignFindNoOpRequest extends PaymentMerchantIdAssignRequest {
/**
 *
 * Constructor to create a   PaymentMerchantIdAssignFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PaymentMerchantIdAssignFindNoOpRequest(String id, PaymentMerchantIdAssignObjectDataList noOpIn) {
    super(id, "PaymentMerchantIdAssignFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = PaymentMerchantIdAssignObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PaymentMerchantIdAssign", noOpIn);
      }
      addInput("PaymentMerchantIdAssign", mapList);
    }
  }
/**
 *
 * Retrieves the PaymentMerchantIdAssignObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public PaymentMerchantIdAssignObjectDataList getOutput() {
    return PaymentMerchantIdAssignObjectHelper.fromMapList(outputMap, "PaymentMerchantIdAssignList");
  }
}
