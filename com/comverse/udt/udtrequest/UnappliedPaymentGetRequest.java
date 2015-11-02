/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnappliedPaymentGetRequest.java
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
 * Class used to create a UnappliedPaymentGetRequest Udt Request
 *
 */

public class UnappliedPaymentGetRequest extends UnappliedPaymentSubRequestParent {
/**
 *
 * Constructor to create a  UnappliedPaymentGetRequest
 * @param id Unique request name
 * @param unappliedPaymentGetIn UnappliedPaymentObjectKeyData for UnappliedPaymentGetRequest
 *
 */
@JsonCreator
  public UnappliedPaymentGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnappliedPayment")UnappliedPaymentObjectKeyData unappliedPaymentGetIn) {
    super(id, "UnappliedPaymentGet");
    if (unappliedPaymentGetIn != null) {
      addInput("UnappliedPayment", UnappliedPaymentObjectKeyHelper.toMap(unappliedPaymentGetIn, new HashMap(), "UnappliedPaymentObjectKeyData").get("UnappliedPaymentObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the UnappliedPaymentObjectData that results from the UnappliedPaymentGetRequest call
 * @return UnappliedPaymentObjectData resulting from udt call
 *
 */

  public UnappliedPaymentObjectData getOutput() {
    return UnappliedPaymentObjectHelper.fromMap(outputMap, "UnappliedPayment");
  }
}
