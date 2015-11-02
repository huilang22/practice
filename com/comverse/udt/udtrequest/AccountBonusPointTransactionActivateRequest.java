/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointTransactionActivateRequest.java
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
 * Class used to create a AccountBonusPointTransactionActivateRequest Udt Request
 *
 */

public class AccountBonusPointTransactionActivateRequest extends AccountBonusPointTransactionSubRequestParent {
/**
 *
 * Constructor to create a  AccountBonusPointTransactionActivateRequest
 * @param id Unique request name
 * @param actIn1 AccountBonusPointTransactionObjectKeyData for AccountBonusPointTransactionActivateRequest
 *
 */
@JsonCreator
  public AccountBonusPointTransactionActivateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountBonusPointTransaction")AccountBonusPointTransactionObjectKeyData actIn1) {
    super(id, "AccountBonusPointTransactionActivate");
    if (actIn1 != null) {
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectKeyHelper.toMap(actIn1, new HashMap(), "AccountBonusPointTransactionObjectKeyData").get("AccountBonusPointTransactionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AccountBonusPointTransactionObjectData that results from the AccountBonusPointTransactionActivateRequest call
 * @return AccountBonusPointTransactionObjectData resulting from udt call
 *
 */

  public AccountBonusPointTransactionObjectData getOutput() {
    return AccountBonusPointTransactionObjectHelper.fromMap(outputMap, "AccountBonusPointTransaction");
  }
}
