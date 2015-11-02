/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnappliedPaymentUpdateRequest.java
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
 * Class used to create a UnappliedPaymentUpdateRequest Udt Request
 *
 */

public class UnappliedPaymentUpdateRequest extends UnappliedPaymentSubRequestParent {
/**
 *
 * Constructor to create a  UnappliedPaymentUpdateRequest
 * @param id Unique request name
 * @param unappliedPaymentUpdateIn UnappliedPaymentObjectData for UnappliedPaymentUpdateRequest
 *
 */
@JsonCreator
  public UnappliedPaymentUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnappliedPayment")UnappliedPaymentObjectData unappliedPaymentUpdateIn) {
    super(id, "UnappliedPaymentUpdate");
    if (unappliedPaymentUpdateIn != null) {
      addInput("UnappliedPayment", UnappliedPaymentObjectHelper.toMap(unappliedPaymentUpdateIn, new HashMap(), "UnappliedPayment").get("UnappliedPayment"));
    }
  }

/**
 *
 * Retrieves the UnappliedPaymentObjectData that results from the UnappliedPaymentUpdateRequest call
 * @return UnappliedPaymentObjectData resulting from udt call
 *
 */

  public UnappliedPaymentObjectData getOutput() {
    return UnappliedPaymentObjectHelper.fromMap(outputMap, "UnappliedPayment");
  }
}
