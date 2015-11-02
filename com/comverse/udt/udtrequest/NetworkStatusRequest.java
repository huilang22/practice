/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NetworkStatusRequest.java
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
 * Class used to create a NetworkStatusRequest Udt Request
 *
 */

public class NetworkStatusRequest extends AccountSubRequestParent {
/**
 *
 * Constructor to create a  NetworkStatusRequest
 * @param id Unique request name
 * @param agnsIn AccountObjectKeyData for NetworkStatusRequest
 * @param effectiveDate Date for NetworkStatusRequest
 *
 */
@JsonCreator
  public NetworkStatusRequest(@JsonProperty("RequestId") String id, @JsonProperty("Account")AccountObjectKeyData agnsIn, @JsonProperty("EffectiveDate")Date effectiveDate) {
    super(id, "NetworkStatus");
    if (agnsIn != null) {
      addInput("Account", AccountObjectKeyHelper.toMap(agnsIn, new HashMap(), "AccountObjectKeyData").get("AccountObjectKeyData"));
    }
    if (effectiveDate != null) {
      addInput("EffectiveDate", effectiveDate);
    }
  }

/**
 *
 * Retrieves the NetworkStatusOutputData that results from the NetworkStatusRequest call
 * @return NetworkStatusOutputData resulting from udt call
 *
 */

  public NetworkStatusOutputData getOutput() {
    return NetworkStatusOutputHelper.fromMap(outputMap);
  }
}
