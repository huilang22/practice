/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointTransactionExpiringBalanceRequest.java
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
 * Class used to create a AccountBonusPointTransactionExpiringBalanceRequest Udt Request
 *
 */

public class AccountBonusPointTransactionExpiringBalanceRequest extends AccountBonusPointTransactionRequest {
/**
 *
 * Constructor to create a  AccountBonusPointTransactionExpiringBalanceRequest
 * @param id Unique request name
 * @param AccountInternalId Integer for AccountBonusPointTransactionExpiringBalanceRequest
 * @param from_date Date for AccountBonusPointTransactionExpiringBalanceRequest
 * @param to_date Date for AccountBonusPointTransactionExpiringBalanceRequest
 *
 */
@JsonCreator
  public AccountBonusPointTransactionExpiringBalanceRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountInternalId")Integer AccountInternalId, @JsonProperty("FromDate")Date from_date, @JsonProperty("ToDate")Date to_date) {
    super(id, "AccountBonusPointTransactionExpiringBalance");
    if (AccountInternalId != null) {
      addInput("AccountInternalId", AccountInternalId);
    }
    if (from_date != null) {
      addInput("FromDate", from_date);
    }
    if (to_date != null) {
      addInput("ToDate", to_date);
    }
  }

/**
 *
 * Retrieves the BigInteger that results from the AccountBonusPointTransactionExpiringBalanceRequest call
 * @return BigInteger resulting from udt call
 *
 */

  public BigInteger getOutput() {
    return  (BigInteger)outputMap.get("Amount");
  }
}
