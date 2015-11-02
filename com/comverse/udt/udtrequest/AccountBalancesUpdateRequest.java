/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBalancesUpdateRequest.java
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
 * Class used to create a AccountBalancesUpdateRequest Udt Request
 *
 */

public class AccountBalancesUpdateRequest extends AccountBalancesSubRequestParent {
/**
 *
 * Constructor to create a  AccountBalancesUpdateRequest
 * @param id Unique request name
 * @param ABUpdateIn AccountBalancesObjectData for AccountBalancesUpdateRequest
 *
 */
@JsonCreator
  public AccountBalancesUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountBalances")AccountBalancesObjectData ABUpdateIn) {
    super(id, "AccountBalancesUpdate");
    if (ABUpdateIn != null) {
      addInput("AccountBalances", AccountBalancesObjectHelper.toMap(ABUpdateIn, new HashMap(), "AccountBalances").get("AccountBalances"));
    }
  }

/**
 *
 * Retrieves the AccountBalancesObjectData that results from the AccountBalancesUpdateRequest call
 * @return AccountBalancesObjectData resulting from udt call
 *
 */

  public AccountBalancesObjectData getOutput() {
    return AccountBalancesObjectHelper.fromMap(outputMap, "AccountBalances");
  }
}
