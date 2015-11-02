/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBalancesCountRequest.java
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
 * Class used to create a AccountBalancesCountRequest Udt Request
 *
 */

public class AccountBalancesCountRequest extends AccountBalancesRequest {
/**
 *
 * Constructor to create a  AccountBalancesCountRequest
 * @param id Unique request name
 * @param accIn CmfObjectKeyData for AccountBalancesCountRequest
 *
 */
@JsonCreator
  public AccountBalancesCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("Account")CmfObjectKeyData accIn) {
    super(id, "AccountBalancesCount");
    if (accIn != null) {
      addInput("Account", CmfObjectKeyHelper.toMap(accIn, new HashMap(), "CmfObjectKeyData").get("CmfObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the AccountBalancesCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("BalanceCount");
  }
}
