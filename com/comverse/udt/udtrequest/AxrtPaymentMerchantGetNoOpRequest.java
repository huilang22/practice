/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtPaymentMerchantGetNoOpRequest.java
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
 * NoOp class used to simulate a AxrtPaymentMerchantGetNoOpRequest Udt Request/Response
 *
 */
public class AxrtPaymentMerchantGetNoOpRequest extends AxrtPaymentMerchantSubRequestParent {
/**
 *
 * Constructor to create a   AxrtPaymentMerchantGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AxrtPaymentMerchantGetNoOpRequest(String id, AxrtPaymentMerchantObjectData noOpIn) {
    super(id, "AxrtPaymentMerchantGetNoOpRequest");
    if (noOpIn != null) {
      addInput("AxrtPaymentMerchant", AxrtPaymentMerchantObjectHelper.toMap(noOpIn, new HashMap(), "AxrtPaymentMerchant").get("AxrtPaymentMerchant"));
    }
  }
/**
 *
 * Retrieves the AxrtPaymentMerchantObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AxrtPaymentMerchantObjectData getOutput() {
    return AxrtPaymentMerchantObjectHelper.fromMap(outputMap, "AxrtPaymentMerchant");
  }
}
