/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentMerchantIdFindRequest.java
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
 * Class used to create a PaymentMerchantIdFindRequest Udt Request
 *
 */

public class PaymentMerchantIdFindRequest extends PaymentMerchantIdRequest {
/**
 *
 * Constructor to create a  PaymentMerchantIdFindRequest
 * @param id Unique request name
 * @param PaymentMerchantIdfindIn PaymentMerchantIdObjectFilter for PaymentMerchantIdFindRequest
 *
 */
@JsonCreator
  public PaymentMerchantIdFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("PaymentMerchantId")PaymentMerchantIdObjectFilter PaymentMerchantIdfindIn) {
    super(id, "PaymentMerchantIdFind");
    if (PaymentMerchantIdfindIn != null) {
      Integer index =  PaymentMerchantIdfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PaymentMerchantId", PaymentMerchantIdObjectHelper.toMap(PaymentMerchantIdfindIn, new HashMap(), "PaymentMerchantId").get("PaymentMerchantId"));
    }
  }

/**
 *
 * Retrieves the PaymentMerchantIdObjectDataList that results from the PaymentMerchantIdFindRequest call
 * @return PaymentMerchantIdObjectDataList resulting from udt call
 *
 */

  public PaymentMerchantIdObjectDataList getOutput() {
    return PaymentMerchantIdObjectHelper.fromMapList(outputMap, "PaymentMerchantIdList");
  }
}
