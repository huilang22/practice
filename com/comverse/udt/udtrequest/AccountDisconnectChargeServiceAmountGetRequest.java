/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountDisconnectChargeServiceAmountGetRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a AccountDisconnectChargeServiceAmountGetRequest Udt Request
 *
 */

public class AccountDisconnectChargeServiceAmountGetRequest extends CustomerContractSubRequestParent {
/**
 *
 * Constructor to create a  AccountDisconnectChargeServiceAmountGetRequest
 * @param id Unique request name
 * @param account_internal_id Integer for AccountDisconnectChargeServiceAmountGetRequest
 * @param effective_date Date for AccountDisconnectChargeServiceAmountGetRequest
 *
 */
@JsonCreator
  public AccountDisconnectChargeServiceAmountGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountInternalId")Integer account_internal_id, @JsonProperty("EffectiveDate")Date effective_date) {
    super(id, "AccountDisconnectChargeServiceAmountGet");
    if (account_internal_id != null) {
      addInput("AccountInternalId", account_internal_id);
    }
    if (effective_date != null) {
      addInput("EffectiveDate", effective_date);
    }
  }

/**
 *
 * Retrieves the AccountDisconnectChargeServiceAmountGetOutputData that results from the AccountDisconnectChargeServiceAmountGetRequest call
 * @return AccountDisconnectChargeServiceAmountGetOutputData resulting from udt call
 *
 */

  public AccountDisconnectChargeServiceAmountGetOutputData getOutput() {
    return AccountDisconnectChargeServiceAmountGetOutputHelper.fromMap(outputMap);
  }
}
