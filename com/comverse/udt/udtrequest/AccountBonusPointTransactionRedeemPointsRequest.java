/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointTransactionRedeemPointsRequest.java
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
 * Class used to create a AccountBonusPointTransactionRedeemPointsRequest Udt Request
 *
 */

public class AccountBonusPointTransactionRedeemPointsRequest extends AccountBonusPointTransactionSubRequestParent {
/**
 *
 * Constructor to create a  AccountBonusPointTransactionRedeemPointsRequest
 * @param id Unique request name
 * @param RedeemPointIn AccountBonusPointTransactionObjectData for AccountBonusPointTransactionRedeemPointsRequest
 *
 */
@JsonCreator
  public AccountBonusPointTransactionRedeemPointsRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountBonusPointTransaction")AccountBonusPointTransactionObjectData RedeemPointIn) {
    super(id, "AccountBonusPointTransactionRedeemPoints");
    if (RedeemPointIn != null) {
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectHelper.toMap(RedeemPointIn, new HashMap(), "AccountBonusPointTransaction").get("AccountBonusPointTransaction"));
    }
  }

/**
 *
 * Retrieves the AccountBonusPointTransactionObjectData that results from the AccountBonusPointTransactionRedeemPointsRequest call
 * @return AccountBonusPointTransactionObjectData resulting from udt call
 *
 */

  public AccountBonusPointTransactionObjectData getOutput() {
    return AccountBonusPointTransactionObjectHelper.fromMap(outputMap, "AccountBonusPointTransaction");
  }
}
