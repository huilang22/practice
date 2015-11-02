/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointBalanceFindRequest.java
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
 * Class used to create a AccountBonusPointBalanceFindRequest Udt Request
 *
 */

public class AccountBonusPointBalanceFindRequest extends AccountBonusPointBalanceRequest {
/**
 *
 * Constructor to create a  AccountBonusPointBalanceFindRequest
 * @param id Unique request name
 * @param findIn AccountBonusPointBalanceObjectFilter for AccountBonusPointBalanceFindRequest
 *
 */
@JsonCreator
  public AccountBonusPointBalanceFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountBonusPointBalance")AccountBonusPointBalanceObjectFilter findIn) {
    super(id, "AccountBonusPointBalanceFind");
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountBonusPointBalance", AccountBonusPointBalanceObjectHelper.toMap(findIn, new HashMap(), "AccountBonusPointBalance").get("AccountBonusPointBalance"));
    }
  }

/**
 *
 * Retrieves the AccountBonusPointBalanceObjectDataList that results from the AccountBonusPointBalanceFindRequest call
 * @return AccountBonusPointBalanceObjectDataList resulting from udt call
 *
 */

  public AccountBonusPointBalanceObjectDataList getOutput() {
    return AccountBonusPointBalanceObjectHelper.fromMapList(outputMap, "AccountBonusPointBalanceList");
  }
}
