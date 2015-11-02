/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtPaymentProfileCreateRequest.java
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
 * Class used to create a AxrtPaymentProfileCreateRequest Udt Request
 *
 */

public class AxrtPaymentProfileCreateRequest extends AxrtPaymentProfileSubRequestParent {
/**
 *
 * Constructor to create a  AxrtPaymentProfileCreateRequest
 * @param id Unique request name
 * @param axrtppcIn AxrtPaymentProfileObjectData for AxrtPaymentProfileCreateRequest
 *
 */
@JsonCreator
  public AxrtPaymentProfileCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AxrtPaymentProfile")AxrtPaymentProfileObjectData axrtppcIn) {
    super(id, "AxrtPaymentProfileCreate");
    if (axrtppcIn != null) {
      addInput("AxrtPaymentProfile", AxrtPaymentProfileObjectHelper.toMap(axrtppcIn, new HashMap(), "AxrtPaymentProfile").get("AxrtPaymentProfile"));
    }
  }

/**
 *
 * Retrieves the AxrtPaymentProfileObjectData that results from the AxrtPaymentProfileCreateRequest call
 * @return AxrtPaymentProfileObjectData resulting from udt call
 *
 */

  public AxrtPaymentProfileObjectData getOutput() {
    return AxrtPaymentProfileObjectHelper.fromMap(outputMap, "AxrtPaymentProfile");
  }
}
