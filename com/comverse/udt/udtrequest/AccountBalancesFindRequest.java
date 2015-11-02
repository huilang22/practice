/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBalancesFindRequest.java
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
 * Class used to create a AccountBalancesFindRequest Udt Request
 *
 */

public class AccountBalancesFindRequest extends AccountBalancesRequest {
/**
 *
 * Constructor to create a  AccountBalancesFindRequest
 * @param id Unique request name
 * @param ABFindIn AccountBalancesObjectFilter for AccountBalancesFindRequest
 *
 */
@JsonCreator
  public AccountBalancesFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountBalances")AccountBalancesObjectFilter ABFindIn) {
    super(id, "AccountBalancesFind");
    if (ABFindIn != null) {
      Integer index =  ABFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountBalances", AccountBalancesObjectHelper.toMap(ABFindIn, new HashMap(), "AccountBalances").get("AccountBalances"));
    }
  }

/**
 *
 * Retrieves the AccountBalancesObjectDataList that results from the AccountBalancesFindRequest call
 * @return AccountBalancesObjectDataList resulting from udt call
 *
 */

  public AccountBalancesObjectDataList getOutput() {
    return AccountBalancesObjectHelper.fromMapList(outputMap, "AccountBalancesList");
  }
}
