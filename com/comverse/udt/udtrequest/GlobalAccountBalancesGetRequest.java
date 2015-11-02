/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalAccountBalancesGetRequest.java
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
 * Class used to create a GlobalAccountBalancesGetRequest Udt Request
 *
 */

public class GlobalAccountBalancesGetRequest extends GlobalAccountBalancesSubRequestParent {
/**
 *
 * Constructor to create a  GlobalAccountBalancesGetRequest
 * @param id Unique request name
 * @param GABGetIn GlobalAccountBalancesObjectKeyData for GlobalAccountBalancesGetRequest
 *
 */
@JsonCreator
  public GlobalAccountBalancesGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("GlobalAccountBalances")GlobalAccountBalancesObjectKeyData GABGetIn) {
    super(id, "GlobalAccountBalancesGet");
    if (GABGetIn != null) {
      addInput("GlobalAccountBalances", GlobalAccountBalancesObjectKeyHelper.toMap(GABGetIn, new HashMap(), "GlobalAccountBalancesObjectKeyData").get("GlobalAccountBalancesObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the GlobalAccountBalancesObjectData that results from the GlobalAccountBalancesGetRequest call
 * @return GlobalAccountBalancesObjectData resulting from udt call
 *
 */

  public GlobalAccountBalancesObjectData getOutput() {
    return GlobalAccountBalancesObjectHelper.fromMap(outputMap, "GlobalAccountBalances");
  }
}
