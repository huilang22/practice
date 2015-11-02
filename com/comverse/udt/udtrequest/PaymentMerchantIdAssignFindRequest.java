/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentMerchantIdAssignFindRequest.java
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
 * Class used to create a PaymentMerchantIdAssignFindRequest Udt Request
 *
 */

public class PaymentMerchantIdAssignFindRequest extends PaymentMerchantIdAssignRequest {
/**
 *
 * Constructor to create a  PaymentMerchantIdAssignFindRequest
 * @param id Unique request name
 * @param PaymentMerchantIdAssignfindIn PaymentMerchantIdAssignObjectFilter for PaymentMerchantIdAssignFindRequest
 *
 */
@JsonCreator
  public PaymentMerchantIdAssignFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("PaymentMerchantIdAssign")PaymentMerchantIdAssignObjectFilter PaymentMerchantIdAssignfindIn) {
    super(id, "PaymentMerchantIdAssignFind");
    if (PaymentMerchantIdAssignfindIn != null) {
      Integer index =  PaymentMerchantIdAssignfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PaymentMerchantIdAssign", PaymentMerchantIdAssignObjectHelper.toMap(PaymentMerchantIdAssignfindIn, new HashMap(), "PaymentMerchantIdAssign").get("PaymentMerchantIdAssign"));
    }
  }

/**
 *
 * Retrieves the PaymentMerchantIdAssignObjectDataList that results from the PaymentMerchantIdAssignFindRequest call
 * @return PaymentMerchantIdAssignObjectDataList resulting from udt call
 *
 */

  public PaymentMerchantIdAssignObjectDataList getOutput() {
    return PaymentMerchantIdAssignObjectHelper.fromMapList(outputMap, "PaymentMerchantIdAssignList");
  }
}
