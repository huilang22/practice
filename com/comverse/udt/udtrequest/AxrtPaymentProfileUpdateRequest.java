/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtPaymentProfileUpdateRequest.java
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
 * Class used to create a AxrtPaymentProfileUpdateRequest Udt Request
 *
 */

public class AxrtPaymentProfileUpdateRequest extends AxrtPaymentProfileSubRequestParent {
/**
 *
 * Constructor to create a  AxrtPaymentProfileUpdateRequest
 * @param id Unique request name
 * @param axrtppuIn AxrtPaymentProfileObjectData for AxrtPaymentProfileUpdateRequest
 *
 */
@JsonCreator
  public AxrtPaymentProfileUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AxrtPaymentProfile")AxrtPaymentProfileObjectData axrtppuIn) {
    super(id, "AxrtPaymentProfileUpdate");
    if (axrtppuIn != null) {
      addInput("AxrtPaymentProfile", AxrtPaymentProfileObjectHelper.toMap(axrtppuIn, new HashMap(), "AxrtPaymentProfile").get("AxrtPaymentProfile"));
    }
  }

/**
 *
 * Retrieves the AxrtPaymentProfileObjectData that results from the AxrtPaymentProfileUpdateRequest call
 * @return AxrtPaymentProfileObjectData resulting from udt call
 *
 */

  public AxrtPaymentProfileObjectData getOutput() {
    return AxrtPaymentProfileObjectHelper.fromMap(outputMap, "AxrtPaymentProfile");
  }
}
