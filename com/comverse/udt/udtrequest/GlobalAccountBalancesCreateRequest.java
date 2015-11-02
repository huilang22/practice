/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalAccountBalancesCreateRequest.java
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
 * Class used to create a GlobalAccountBalancesCreateRequest Udt Request
 *
 */

public class GlobalAccountBalancesCreateRequest extends GlobalAccountBalancesSubRequestParent {
/**
 *
 * Constructor to create a  GlobalAccountBalancesCreateRequest
 * @param id Unique request name
 * @param GABCreateIn GlobalAccountBalancesObjectData for GlobalAccountBalancesCreateRequest
 *
 */
@JsonCreator
  public GlobalAccountBalancesCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GlobalAccountBalances")GlobalAccountBalancesObjectData GABCreateIn) {
    super(id, "GlobalAccountBalancesCreate");
    if (GABCreateIn != null) {
      addInput("GlobalAccountBalances", GlobalAccountBalancesObjectHelper.toMap(GABCreateIn, new HashMap(), "GlobalAccountBalances").get("GlobalAccountBalances"));
    }
  }

/**
 *
 * Retrieves the GlobalAccountBalancesObjectData that results from the GlobalAccountBalancesCreateRequest call
 * @return GlobalAccountBalancesObjectData resulting from udt call
 *
 */

  public GlobalAccountBalancesObjectData getOutput() {
    return GlobalAccountBalancesObjectHelper.fromMap(outputMap, "GlobalAccountBalances");
  }
}
