/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBalancesDeleteRequest.java
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
 * Class used to create a AccountBalancesDeleteRequest Udt Request
 *
 */

public class AccountBalancesDeleteRequest extends AccountBalancesSubRequestParent {
/**
 *
 * Constructor to create a  AccountBalancesDeleteRequest
 * @param id Unique request name
 * @param ABDeleteIn AccountBalancesObjectKeyData for AccountBalancesDeleteRequest
 * @param ABDCeaseDate Date for AccountBalancesDeleteRequest
 *
 */
@JsonCreator
  public AccountBalancesDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountBalances")AccountBalancesObjectKeyData ABDeleteIn, @JsonProperty("InactiveDate")Date ABDCeaseDate) {
    super(id, "AccountBalancesDelete");
    if (ABDeleteIn != null) {
      addInput("AccountBalances", AccountBalancesObjectKeyHelper.toMap(ABDeleteIn, new HashMap(), "AccountBalancesObjectKeyData").get("AccountBalancesObjectKeyData"));
    }
    if (ABDCeaseDate != null) {
      addInput("InactiveDate", ABDCeaseDate);
    }
  }

/**
 *
 * Retrieves the AccountBalancesObjectData that results from the AccountBalancesDeleteRequest call
 * @return AccountBalancesObjectData resulting from udt call
 *
 */

  public AccountBalancesObjectData getOutput() {
    return AccountBalancesObjectHelper.fromMap(outputMap, "AccountBalances");
  }
}
