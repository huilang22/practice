/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalAccountBalancesDeleteRequest.java
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
 * Class used to create a GlobalAccountBalancesDeleteRequest Udt Request
 *
 */

public class GlobalAccountBalancesDeleteRequest extends GlobalAccountBalancesSubRequestParent {
/**
 *
 * Constructor to create a  GlobalAccountBalancesDeleteRequest
 * @param id Unique request name
 * @param GABDeleteIn GlobalAccountBalancesObjectKeyData for GlobalAccountBalancesDeleteRequest
 *
 */
@JsonCreator
  public GlobalAccountBalancesDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("GlobalAccountBalances")GlobalAccountBalancesObjectKeyData GABDeleteIn) {
    super(id, "GlobalAccountBalancesDelete");
    if (GABDeleteIn != null) {
      addInput("GlobalAccountBalances", GlobalAccountBalancesObjectKeyHelper.toMap(GABDeleteIn, new HashMap(), "GlobalAccountBalancesObjectKeyData").get("GlobalAccountBalancesObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the GlobalAccountBalancesObjectData that results from the GlobalAccountBalancesDeleteRequest call
 * @return GlobalAccountBalancesObjectData resulting from udt call
 *
 */

  public GlobalAccountBalancesObjectData getOutput() {
    return GlobalAccountBalancesObjectHelper.fromMap(outputMap, "GlobalAccountBalances");
  }
}
