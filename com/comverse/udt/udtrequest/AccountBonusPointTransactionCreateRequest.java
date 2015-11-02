/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointTransactionCreateRequest.java
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
 * Class used to create a AccountBonusPointTransactionCreateRequest Udt Request
 *
 */

public class AccountBonusPointTransactionCreateRequest extends AccountBonusPointTransactionSubRequestParent {
/**
 *
 * Constructor to create a  AccountBonusPointTransactionCreateRequest
 * @param id Unique request name
 * @param CBPCreateIn1 AccountBonusPointTransactionObjectData for AccountBonusPointTransactionCreateRequest
 *
 */
@JsonCreator
  public AccountBonusPointTransactionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountBonusPointTransaction")AccountBonusPointTransactionObjectData CBPCreateIn1) {
    super(id, "AccountBonusPointTransactionCreate");
    if (CBPCreateIn1 != null) {
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectHelper.toMap(CBPCreateIn1, new HashMap(), "AccountBonusPointTransaction").get("AccountBonusPointTransaction"));
    }
  }

/**
 *
 * Retrieves the AccountBonusPointTransactionObjectData that results from the AccountBonusPointTransactionCreateRequest call
 * @return AccountBonusPointTransactionObjectData resulting from udt call
 *
 */

  public AccountBonusPointTransactionObjectData getOutput() {
    return AccountBonusPointTransactionObjectHelper.fromMap(outputMap, "AccountBonusPointTransaction");
  }
}
