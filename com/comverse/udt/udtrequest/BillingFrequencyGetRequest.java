/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillingFrequencyGetRequest.java
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
 * Class used to create a BillingFrequencyGetRequest Udt Request
 *
 */

public class BillingFrequencyGetRequest extends BillingFrequencySubRequestParent {
/**
 *
 * Constructor to create a  BillingFrequencyGetRequest
 * @param id Unique request name
 * @param BFGetIn BFObjectKeyData for BillingFrequencyGetRequest
 *
 */
@JsonCreator
  public BillingFrequencyGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillingFrequency")BFObjectKeyData BFGetIn) {
    super(id, "BillingFrequencyGet");
    if (BFGetIn != null) {
      addInput("BillingFrequency", BFObjectKeyHelper.toMap(BFGetIn, new HashMap(), "BFObjectKeyData").get("BFObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BFObjectData that results from the BillingFrequencyGetRequest call
 * @return BFObjectData resulting from udt call
 *
 */

  public BFObjectData getOutput() {
    return BFObjectHelper.fromMap(outputMap, "BillingFrequency");
  }
}
