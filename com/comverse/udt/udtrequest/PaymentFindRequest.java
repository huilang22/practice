/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentFindRequest.java
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
 * Class used to create a PaymentFindRequest Udt Request
 *
 */

public class PaymentFindRequest extends PaymentRequest {
/**
 *
 * Constructor to create a  PaymentFindRequest
 * @param id Unique request name
 * @param findIn PaymentObjectFilter for PaymentFindRequest
 *
 */
@JsonCreator
  public PaymentFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Payment")PaymentObjectFilter findIn) {
    super(id, "PaymentFind");
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Payment", PaymentObjectHelper.toMap(findIn, new HashMap(), "Payment").get("Payment"));
    }
  }

/**
 *
 * Retrieves the PaymentObjectDataList that results from the PaymentFindRequest call
 * @return PaymentObjectDataList resulting from udt call
 *
 */

  public PaymentObjectDataList getOutput() {
    return PaymentObjectHelper.fromMapList(outputMap, "PaymentList");
  }
}
