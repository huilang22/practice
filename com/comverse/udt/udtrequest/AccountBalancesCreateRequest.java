/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBalancesCreateRequest.java
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
 * Class used to create a AccountBalancesCreateRequest Udt Request
 *
 */

public class AccountBalancesCreateRequest extends AccountBalancesSubRequestParent {
/**
 *
 * Constructor to create a  AccountBalancesCreateRequest
 * @param id Unique request name
 * @param ABCreateIn AccountBalancesObjectData for AccountBalancesCreateRequest
 *
 */
@JsonCreator
  public AccountBalancesCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountBalances")AccountBalancesObjectData ABCreateIn) {
    super(id, "AccountBalancesCreate");
    if (ABCreateIn != null) {
      addInput("AccountBalances", AccountBalancesObjectHelper.toMap(ABCreateIn, new HashMap(), "AccountBalances").get("AccountBalances"));
    }
  }

/**
 *
 * Retrieves the AccountBalancesObjectData that results from the AccountBalancesCreateRequest call
 * @return AccountBalancesObjectData resulting from udt call
 *
 */

  public AccountBalancesObjectData getOutput() {
    return AccountBalancesObjectHelper.fromMap(outputMap, "AccountBalances");
  }
}
