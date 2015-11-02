/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtPaymentTransUpdateRequest.java
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
 * Class used to create a AxrtPaymentTransUpdateRequest Udt Request
 *
 */

public class AxrtPaymentTransUpdateRequest extends AxrtPaymentTransSubRequestParent {
/**
 *
 * Constructor to create a  AxrtPaymentTransUpdateRequest
 * @param id Unique request name
 * @param AxrtPayTransUpdateIn AxrtPaymentTransObjectData for AxrtPaymentTransUpdateRequest
 *
 */
@JsonCreator
  public AxrtPaymentTransUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AxrtPaymentTrans")AxrtPaymentTransObjectData AxrtPayTransUpdateIn) {
    super(id, "AxrtPaymentTransUpdate");
    if (AxrtPayTransUpdateIn != null) {
      addInput("AxrtPaymentTrans", AxrtPaymentTransObjectHelper.toMap(AxrtPayTransUpdateIn, new HashMap(), "AxrtPaymentTrans").get("AxrtPaymentTrans"));
    }
  }

/**
 *
 * Retrieves the AxrtPaymentTransObjectData that results from the AxrtPaymentTransUpdateRequest call
 * @return AxrtPaymentTransObjectData resulting from udt call
 *
 */

  public AxrtPaymentTransObjectData getOutput() {
    return AxrtPaymentTransObjectHelper.fromMap(outputMap, "AxrtPaymentTrans");
  }
}
