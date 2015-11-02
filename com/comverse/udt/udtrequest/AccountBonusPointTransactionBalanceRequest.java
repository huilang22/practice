/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointTransactionBalanceRequest.java
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
 * Class used to create a AccountBonusPointTransactionBalanceRequest Udt Request
 *
 */

public class AccountBonusPointTransactionBalanceRequest extends AccountBonusPointTransactionRequest {
/**
 *
 * Constructor to create a  AccountBonusPointTransactionBalanceRequest
 * @param id Unique request name
 * @param account_internal_id Integer for AccountBonusPointTransactionBalanceRequest
 * @param current_date Date for AccountBonusPointTransactionBalanceRequest
 *
 */
@JsonCreator
  public AccountBonusPointTransactionBalanceRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountInternalId")Integer account_internal_id, @JsonProperty("CurrentDate")Date current_date) {
    super(id, "AccountBonusPointTransactionBalance");
    if (account_internal_id != null) {
      addInput("AccountInternalId", account_internal_id);
    }
    if (current_date != null) {
      addInput("CurrentDate", current_date);
    }
  }

/**
 *
 * Retrieves the BigInteger that results from the AccountBonusPointTransactionBalanceRequest call
 * @return BigInteger resulting from udt call
 *
 */

  public BigInteger getOutput() {
    return  (BigInteger)outputMap.get("Amount");
  }
}
