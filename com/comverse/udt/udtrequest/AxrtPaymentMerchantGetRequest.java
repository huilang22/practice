/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtPaymentMerchantGetRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a AxrtPaymentMerchantGetRequest Udt Request
 *
 */

public class AxrtPaymentMerchantGetRequest extends AxrtPaymentMerchantSubRequestParent {
/**
 *
 * Constructor to create a  AxrtPaymentMerchantGetRequest
 * @param id Unique request name
 * @param AxrtPayMerchantIn AxrtPaymentMerchantObjectKeyData for AxrtPaymentMerchantGetRequest
 *
 */
@JsonCreator
  public AxrtPaymentMerchantGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AxrtPaymentMerchant")AxrtPaymentMerchantObjectKeyData AxrtPayMerchantIn) {
    super(id, "AxrtPaymentMerchantGet");
    if (AxrtPayMerchantIn != null) {
      addInput("AxrtPaymentMerchant", AxrtPaymentMerchantObjectKeyHelper.toMap(AxrtPayMerchantIn, new HashMap(), "AxrtPaymentMerchantObjectKeyData").get("AxrtPaymentMerchantObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AxrtPaymentMerchantObjectData that results from the AxrtPaymentMerchantGetRequest call
 * @return AxrtPaymentMerchantObjectData resulting from udt call
 *
 */

  public AxrtPaymentMerchantObjectData getOutput() {
    return AxrtPaymentMerchantObjectHelper.fromMap(outputMap, "AxrtPaymentMerchant");
  }
}
