/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointTransactionDeleteRequest.java
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
 * Class used to create a AccountBonusPointTransactionDeleteRequest Udt Request
 *
 */

public class AccountBonusPointTransactionDeleteRequest extends AccountBonusPointTransactionSubRequestParent {
/**
 *
 * Constructor to create a  AccountBonusPointTransactionDeleteRequest
 * @param id Unique request name
 * @param CBPDelIn1 AccountBonusPointTransactionObjectKeyData for AccountBonusPointTransactionDeleteRequest
 *
 */
@JsonCreator
  public AccountBonusPointTransactionDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountBonusPointTransaction")AccountBonusPointTransactionObjectKeyData CBPDelIn1) {
    super(id, "AccountBonusPointTransactionDelete");
    if (CBPDelIn1 != null) {
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectKeyHelper.toMap(CBPDelIn1, new HashMap(), "AccountBonusPointTransactionObjectKeyData").get("AccountBonusPointTransactionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AccountBonusPointTransactionObjectData that results from the AccountBonusPointTransactionDeleteRequest call
 * @return AccountBonusPointTransactionObjectData resulting from udt call
 *
 */

  public AccountBonusPointTransactionObjectData getOutput() {
    return AccountBonusPointTransactionObjectHelper.fromMap(outputMap, "AccountBonusPointTransaction");
  }
}
