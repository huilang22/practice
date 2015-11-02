/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentNoBackoutFindRequest.java
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
 * Class used to create a PaymentNoBackoutFindRequest Udt Request
 *
 */

public class PaymentNoBackoutFindRequest extends PaymentRequest {
/**
 *
 * Constructor to create a  PaymentNoBackoutFindRequest
 * @param id Unique request name
 * @param nbfindIn PaymentObjectFilter for PaymentNoBackoutFindRequest
 *
 */
@JsonCreator
  public PaymentNoBackoutFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Payment")PaymentObjectFilter nbfindIn) {
    super(id, "PaymentNoBackoutFind");
    if (nbfindIn != null) {
      Integer index =  nbfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Payment", PaymentObjectHelper.toMap(nbfindIn, new HashMap(), "Payment").get("Payment"));
    }
  }

/**
 *
 * Retrieves the PaymentObjectDataList that results from the PaymentNoBackoutFindRequest call
 * @return PaymentObjectDataList resulting from udt call
 *
 */

  public PaymentObjectDataList getOutput() {
    return PaymentObjectHelper.fromMapList(outputMap, "PaymentList");
  }
}
