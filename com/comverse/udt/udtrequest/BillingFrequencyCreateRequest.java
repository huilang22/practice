/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillingFrequencyCreateRequest.java
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
 * Class used to create a BillingFrequencyCreateRequest Udt Request
 *
 */

public class BillingFrequencyCreateRequest extends BillingFrequencySubRequestParent {
/**
 *
 * Constructor to create a  BillingFrequencyCreateRequest
 * @param id Unique request name
 * @param BFCreateIn BFObjectData for BillingFrequencyCreateRequest
 *
 */
@JsonCreator
  public BillingFrequencyCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillingFrequency")BFObjectData BFCreateIn) {
    super(id, "BillingFrequencyCreate");
    if (BFCreateIn != null) {
      addInput("BillingFrequency", BFObjectHelper.toMap(BFCreateIn, new HashMap(), "BillingFrequency").get("BillingFrequency"));
    }
  }

/**
 *
 * Retrieves the BFObjectData that results from the BillingFrequencyCreateRequest call
 * @return BFObjectData resulting from udt call
 *
 */

  public BFObjectData getOutput() {
    return BFObjectHelper.fromMap(outputMap, "BillingFrequency");
  }
}
