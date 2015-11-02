/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBalancesGetRequest.java
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
 * Class used to create a AccountBalancesGetRequest Udt Request
 *
 */

public class AccountBalancesGetRequest extends AccountBalancesSubRequestParent {
/**
 *
 * Constructor to create a  AccountBalancesGetRequest
 * @param id Unique request name
 * @param ABGetIn AccountBalancesObjectKeyData for AccountBalancesGetRequest
 *
 */
@JsonCreator
  public AccountBalancesGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountBalances")AccountBalancesObjectKeyData ABGetIn) {
    super(id, "AccountBalancesGet");
    if (ABGetIn != null) {
      addInput("AccountBalances", AccountBalancesObjectKeyHelper.toMap(ABGetIn, new HashMap(), "AccountBalancesObjectKeyData").get("AccountBalancesObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AccountBalancesObjectData that results from the AccountBalancesGetRequest call
 * @return AccountBalancesObjectData resulting from udt call
 *
 */

  public AccountBalancesObjectData getOutput() {
    return AccountBalancesObjectHelper.fromMap(outputMap, "AccountBalances");
  }
}
