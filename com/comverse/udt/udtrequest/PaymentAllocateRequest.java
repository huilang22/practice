/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentAllocateRequest.java
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
 * Class used to create a PaymentAllocateRequest Udt Request
 *
 */

public class PaymentAllocateRequest extends PaymentRequest {
/**
 *
 * Constructor to create a  PaymentAllocateRequest
 * @param id Unique request name
 * @param payAllocateIn PaymentObjectData for PaymentAllocateRequest
 *
 */
@JsonCreator
  public PaymentAllocateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Payment")PaymentObjectData payAllocateIn) {
    super(id, "PaymentAllocate");
    if (payAllocateIn != null) {
      addInput("Payment", PaymentObjectHelper.toMap(payAllocateIn, new HashMap(), "Void").get("Void"));
    }
  }

}
