/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointTransactionFindbyRewardbalanceRequest.java
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
 * Class used to create a AccountBonusPointTransactionFindbyRewardbalanceRequest Udt Request
 *
 */

public class AccountBonusPointTransactionFindbyRewardbalanceRequest extends AccountBonusPointTransactionRequest {
/**
 *
 * Constructor to create a  AccountBonusPointTransactionFindbyRewardbalanceRequest
 * @param id Unique request name
 * @param findByIn AccountBonusPointTransactionObjectFilter for AccountBonusPointTransactionFindbyRewardbalanceRequest
 *
 */
@JsonCreator
  public AccountBonusPointTransactionFindbyRewardbalanceRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountBonusPointTransaction")AccountBonusPointTransactionObjectFilter findByIn) {
    super(id, "AccountBonusPointTransactionFindbyRewardbalance");
    if (findByIn != null) {
      Integer index =  findByIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectHelper.toMap(findByIn, new HashMap(), "AccountBonusPointTransaction").get("AccountBonusPointTransaction"));
    }
  }

/**
 *
 * Retrieves the AccountBonusPointTransactionObjectDataList that results from the AccountBonusPointTransactionFindbyRewardbalanceRequest call
 * @return AccountBonusPointTransactionObjectDataList resulting from udt call
 *
 */

  public AccountBonusPointTransactionObjectDataList getOutput() {
    return AccountBonusPointTransactionObjectHelper.fromMapList(outputMap, "AccountBonusPointTransactionList");
  }
}
