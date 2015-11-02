/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountDisconnectChargeAccountAmountGetRequest.java
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
 * Class used to create a AccountDisconnectChargeAccountAmountGetRequest Udt Request
 *
 */

public class AccountDisconnectChargeAccountAmountGetRequest extends CustomerContractSubRequestParent {
/**
 *
 * Constructor to create a  AccountDisconnectChargeAccountAmountGetRequest
 * @param id Unique request name
 * @param Account_internal_id Integer for AccountDisconnectChargeAccountAmountGetRequest
 * @param Effective_date Date for AccountDisconnectChargeAccountAmountGetRequest
 *
 */
@JsonCreator
  public AccountDisconnectChargeAccountAmountGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountInternalId")Integer Account_internal_id, @JsonProperty("EffectiveDate")Date Effective_date) {
    super(id, "AccountDisconnectChargeAccountAmountGet");
    if (Account_internal_id != null) {
      addInput("AccountInternalId", Account_internal_id);
    }
    if (Effective_date != null) {
      addInput("EffectiveDate", Effective_date);
    }
  }

/**
 *
 * Retrieves the AccountDisconnectChargeAccountAmountGetOutputData that results from the AccountDisconnectChargeAccountAmountGetRequest call
 * @return AccountDisconnectChargeAccountAmountGetOutputData resulting from udt call
 *
 */

  public AccountDisconnectChargeAccountAmountGetOutputData getOutput() {
    return AccountDisconnectChargeAccountAmountGetOutputHelper.fromMap(outputMap);
  }
}
