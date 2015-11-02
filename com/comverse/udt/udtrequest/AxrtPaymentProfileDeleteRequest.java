/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtPaymentProfileDeleteRequest.java
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
 * Class used to create a AxrtPaymentProfileDeleteRequest Udt Request
 *
 */

public class AxrtPaymentProfileDeleteRequest extends AxrtPaymentProfileSubRequestParent {
/**
 *
 * Constructor to create a  AxrtPaymentProfileDeleteRequest
 * @param id Unique request name
 * @param axrtppdIn AxrtPaymentProfileObjectData for AxrtPaymentProfileDeleteRequest
 *
 */
@JsonCreator
  public AxrtPaymentProfileDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("AxrtPaymentProfile")AxrtPaymentProfileObjectData axrtppdIn) {
    super(id, "AxrtPaymentProfileDelete");
    if (axrtppdIn != null) {
      addInput("AxrtPaymentProfile", AxrtPaymentProfileObjectHelper.toMap(axrtppdIn, new HashMap(), "AxrtPaymentProfile").get("AxrtPaymentProfile"));
    }
  }

/**
 *
 * Retrieves the AxrtPaymentProfileObjectData that results from the AxrtPaymentProfileDeleteRequest call
 * @return AxrtPaymentProfileObjectData resulting from udt call
 *
 */

  public AxrtPaymentProfileObjectData getOutput() {
    return AxrtPaymentProfileObjectHelper.fromMap(outputMap, "AxrtPaymentProfile");
  }
}
