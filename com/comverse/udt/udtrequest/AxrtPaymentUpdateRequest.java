/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtPaymentUpdateRequest.java
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
 * Class used to create a AxrtPaymentUpdateRequest Udt Request
 *
 */

public class AxrtPaymentUpdateRequest extends AxrtPaymentSubRequestParent {
/**
 *
 * Constructor to create a  AxrtPaymentUpdateRequest
 * @param id Unique request name
 * @param axrtPayUpdateIn AxrtPaymentObjectData for AxrtPaymentUpdateRequest
 *
 */
@JsonCreator
  public AxrtPaymentUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AxrtPayment")AxrtPaymentObjectData axrtPayUpdateIn) {
    super(id, "AxrtPaymentUpdate");
    if (axrtPayUpdateIn != null) {
      addInput("AxrtPayment", AxrtPaymentObjectHelper.toMap(axrtPayUpdateIn, new HashMap(), "AxrtPayment").get("AxrtPayment"));
    }
  }

/**
 *
 * Retrieves the AxrtPaymentObjectData that results from the AxrtPaymentUpdateRequest call
 * @return AxrtPaymentObjectData resulting from udt call
 *
 */

  public AxrtPaymentObjectData getOutput() {
    return AxrtPaymentObjectHelper.fromMap(outputMap, "AxrtPayment");
  }
}
