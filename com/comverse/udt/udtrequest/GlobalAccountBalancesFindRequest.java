/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalAccountBalancesFindRequest.java
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
 * Class used to create a GlobalAccountBalancesFindRequest Udt Request
 *
 */

public class GlobalAccountBalancesFindRequest extends GlobalAccountBalancesRequest {
/**
 *
 * Constructor to create a  GlobalAccountBalancesFindRequest
 * @param id Unique request name
 * @param GABFindIn GlobalAccountBalancesObjectFilter for GlobalAccountBalancesFindRequest
 *
 */
@JsonCreator
  public GlobalAccountBalancesFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("GlobalAccountBalances")GlobalAccountBalancesObjectFilter GABFindIn) {
    super(id, "GlobalAccountBalancesFind");
    if (GABFindIn != null) {
      Integer index =  GABFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GlobalAccountBalances", GlobalAccountBalancesObjectHelper.toMap(GABFindIn, new HashMap(), "GlobalAccountBalances").get("GlobalAccountBalances"));
    }
  }

/**
 *
 * Retrieves the GlobalAccountBalancesObjectDataList that results from the GlobalAccountBalancesFindRequest call
 * @return GlobalAccountBalancesObjectDataList resulting from udt call
 *
 */

  public GlobalAccountBalancesObjectDataList getOutput() {
    return GlobalAccountBalancesObjectHelper.fromMapList(outputMap, "GlobalAccountBalancesList");
  }
}
