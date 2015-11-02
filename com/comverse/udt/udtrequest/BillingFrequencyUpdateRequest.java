/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillingFrequencyUpdateRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BillingFrequencyUpdateRequest Udt Request
 *
 */

public class BillingFrequencyUpdateRequest extends BillingFrequencySubRequestParent {
/**
 *
 * Constructor to create a  BillingFrequencyUpdateRequest
 * @param id Unique request name
 * @param BFUpdateIn BFObjectData for BillingFrequencyUpdateRequest
 *
 */
@JsonCreator
  public BillingFrequencyUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillingFrequency")BFObjectData BFUpdateIn) {
    super(id, "BillingFrequencyUpdate");
    if (BFUpdateIn != null) {
      addInput("BillingFrequency", BFObjectHelper.toMap(BFUpdateIn, new HashMap(), "BillingFrequency").get("BillingFrequency"));
    }
  }

/**
 *
 * Retrieves the BFObjectData that results from the BillingFrequencyUpdateRequest call
 * @return BFObjectData resulting from udt call
 *
 */

  public BFObjectData getOutput() {
    return BFObjectHelper.fromMap(outputMap, "BillingFrequency");
  }
}
