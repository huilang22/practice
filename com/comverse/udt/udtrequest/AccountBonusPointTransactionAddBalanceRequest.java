/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointTransactionAddBalanceRequest.java
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
 * Class used to create a AccountBonusPointTransactionAddBalanceRequest Udt Request
 *
 */

public class AccountBonusPointTransactionAddBalanceRequest extends AccountBonusPointTransactionSubRequestParent {
/**
 *
 * Constructor to create a  AccountBonusPointTransactionAddBalanceRequest
 * @param id Unique request name
 * @param ExtBalAddIn AccountBonusPointTransactionObjectData for AccountBonusPointTransactionAddBalanceRequest
 * @param AccountExternalId String for AccountBonusPointTransactionAddBalanceRequest
 * @param AccountExternalIdType BigInteger for AccountBonusPointTransactionAddBalanceRequest
 *
 */
@JsonCreator
  public AccountBonusPointTransactionAddBalanceRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountBonusPointTransaction")AccountBonusPointTransactionObjectData ExtBalAddIn, @JsonProperty("AccountExternalId")String AccountExternalId, @JsonProperty("AccountExternalIdType")BigInteger AccountExternalIdType) {
    super(id, "AccountBonusPointTransactionAddBalance");
    if (ExtBalAddIn != null) {
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectHelper.toMap(ExtBalAddIn, new HashMap(), "AccountBonusPointTransaction").get("AccountBonusPointTransaction"));
    }
    if (AccountExternalId != null) {
      addInput("AccountExternalId", AccountExternalId);
    }
    if (AccountExternalIdType != null) {
      addInput("AccountExternalIdType", AccountExternalIdType);
    }
  }

/**
 *
 * Retrieves the AccountBonusPointTransactionObjectData that results from the AccountBonusPointTransactionAddBalanceRequest call
 * @return AccountBonusPointTransactionObjectData resulting from udt call
 *
 */

  public AccountBonusPointTransactionObjectData getOutput() {
    return AccountBonusPointTransactionObjectHelper.fromMap(outputMap, "AccountBonusPointTransaction");
  }
}
