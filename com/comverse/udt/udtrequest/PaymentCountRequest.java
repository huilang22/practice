/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentCountRequest.java
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
 * Class used to create a PaymentCountRequest Udt Request
 *
 */

public class PaymentCountRequest extends PaymentRequest {
/**
 *
 * Constructor to create a  PaymentCountRequest
 * @param id Unique request name
 * @param payCountIn PaymentObjectData for PaymentCountRequest
 *
 */
@JsonCreator
  public PaymentCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("Payment")PaymentObjectData payCountIn) {
    super(id, "PaymentCount");
    if (payCountIn != null) {
      addInput("Payment", PaymentObjectHelper.toMap(payCountIn, new HashMap(), "NsfCount").get("NsfCount"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the PaymentCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("NsfCount");
  }
}
