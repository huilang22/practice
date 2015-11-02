/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillingFrequencyDeleteRequest.java
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
 * Class used to create a BillingFrequencyDeleteRequest Udt Request
 *
 */

public class BillingFrequencyDeleteRequest extends BillingFrequencySubRequestParent {
/**
 *
 * Constructor to create a  BillingFrequencyDeleteRequest
 * @param id Unique request name
 * @param BFDeleteIn BFObjectKeyData for BillingFrequencyDeleteRequest
 *
 */
@JsonCreator
  public BillingFrequencyDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillingFrequency")BFObjectKeyData BFDeleteIn) {
    super(id, "BillingFrequencyDelete");
    if (BFDeleteIn != null) {
      addInput("BillingFrequency", BFObjectKeyHelper.toMap(BFDeleteIn, new HashMap(), "BFObjectKeyData").get("BFObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BFObjectData that results from the BillingFrequencyDeleteRequest call
 * @return BFObjectData resulting from udt call
 *
 */

  public BFObjectData getOutput() {
    return BFObjectHelper.fromMap(outputMap, "BillingFrequency");
  }
}
