/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBalancesAlternateGetRequest.java
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
 * Class used to create a AccountBalancesAlternateGetRequest Udt Request
 *
 */

public class AccountBalancesAlternateGetRequest extends AccountBalancesSubRequestParent {
/**
 *
 * Constructor to create a  AccountBalancesAlternateGetRequest
 * @param id Unique request name
 * @param ABAlternateGetIn AccountBalancesObjectData for AccountBalancesAlternateGetRequest
 *
 */
@JsonCreator
  public AccountBalancesAlternateGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountBalances")AccountBalancesObjectData ABAlternateGetIn) {
    super(id, "AccountBalancesAlternateGet");
    if (ABAlternateGetIn != null) {
      addInput("AccountBalances", AccountBalancesObjectHelper.toMap(ABAlternateGetIn, new HashMap(), "AccountBalances").get("AccountBalances"));
    }
  }

/**
 *
 * Retrieves the AccountBalancesObjectData that results from the AccountBalancesAlternateGetRequest call
 * @return AccountBalancesObjectData resulting from udt call
 *
 */

  public AccountBalancesObjectData getOutput() {
    return AccountBalancesObjectHelper.fromMap(outputMap, "AccountBalances");
  }
}
