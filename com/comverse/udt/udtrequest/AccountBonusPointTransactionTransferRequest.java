/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointTransactionTransferRequest.java
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
 * Class used to create a AccountBonusPointTransactionTransferRequest Udt Request
 *
 */

public class AccountBonusPointTransactionTransferRequest extends AccountBonusPointTransactionSubRequestParent {
/**
 *
 * Constructor to create a  AccountBonusPointTransactionTransferRequest
 * @param id Unique request name
 * @param AccountBonusPointTransactionTo AccountBonusPointTransactionObjectData for AccountBonusPointTransactionTransferRequest
 * @param AccountBonusPointTransactionFrom AccountBonusPointTransactionObjectData for AccountBonusPointTransactionTransferRequest
 *
 */
@JsonCreator
  public AccountBonusPointTransactionTransferRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountBonusPointTransactionTo")AccountBonusPointTransactionObjectData AccountBonusPointTransactionTo, @JsonProperty("AccountBonusPointTransactionFrom")AccountBonusPointTransactionObjectData AccountBonusPointTransactionFrom) {
    super(id, "AccountBonusPointTransactionTransfer");
    if (AccountBonusPointTransactionTo != null) {
      addInput("AccountBonusPointTransactionTo", AccountBonusPointTransactionObjectHelper.toMap(AccountBonusPointTransactionTo, new HashMap(), "AccountBonusPointTransactionTransferOutputData").get("AccountBonusPointTransactionTransferOutputData"));
    }
    if (AccountBonusPointTransactionFrom != null) {
      addInput("AccountBonusPointTransactionFrom", AccountBonusPointTransactionObjectHelper.toMap(AccountBonusPointTransactionFrom, new HashMap(), "AccountBonusPointTransactionTransferOutputData").get("AccountBonusPointTransactionTransferOutputData"));
    }
  }

/**
 *
 * Retrieves the AccountBonusPointTransactionTransferOutputData that results from the AccountBonusPointTransactionTransferRequest call
 * @return AccountBonusPointTransactionTransferOutputData resulting from udt call
 *
 */

  public AccountBonusPointTransactionTransferOutputData getOutput() {
    return AccountBonusPointTransactionTransferOutputHelper.fromMap(outputMap);
  }
}
