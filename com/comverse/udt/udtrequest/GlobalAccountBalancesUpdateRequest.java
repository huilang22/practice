/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalAccountBalancesUpdateRequest.java
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
 * Class used to create a GlobalAccountBalancesUpdateRequest Udt Request
 *
 */

public class GlobalAccountBalancesUpdateRequest extends GlobalAccountBalancesSubRequestParent {
/**
 *
 * Constructor to create a  GlobalAccountBalancesUpdateRequest
 * @param id Unique request name
 * @param GABUpdateIn GlobalAccountBalancesObjectData for GlobalAccountBalancesUpdateRequest
 *
 */
@JsonCreator
  public GlobalAccountBalancesUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GlobalAccountBalances")GlobalAccountBalancesObjectData GABUpdateIn) {
    super(id, "GlobalAccountBalancesUpdate");
    if (GABUpdateIn != null) {
      addInput("GlobalAccountBalances", GlobalAccountBalancesObjectHelper.toMap(GABUpdateIn, new HashMap(), "GlobalAccountBalances").get("GlobalAccountBalances"));
    }
  }

/**
 *
 * Retrieves the GlobalAccountBalancesObjectData that results from the GlobalAccountBalancesUpdateRequest call
 * @return GlobalAccountBalancesObjectData resulting from udt call
 *
 */

  public GlobalAccountBalancesObjectData getOutput() {
    return GlobalAccountBalancesObjectHelper.fromMap(outputMap, "GlobalAccountBalances");
  }
}
