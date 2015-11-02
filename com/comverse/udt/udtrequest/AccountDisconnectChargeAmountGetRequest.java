/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountDisconnectChargeAmountGetRequest.java
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
 * Class used to create a AccountDisconnectChargeAmountGetRequest Udt Request
 *
 */

public class AccountDisconnectChargeAmountGetRequest extends CustomerContractSubRequestParent {
/**
 *
 * Constructor to create a  AccountDisconnectChargeAmountGetRequest
 * @param id Unique request name
 * @param AccountInternal_id Integer for AccountDisconnectChargeAmountGetRequest
 * @param EffectiveDate Date for AccountDisconnectChargeAmountGetRequest
 *
 */
@JsonCreator
  public AccountDisconnectChargeAmountGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountInternalId")Integer AccountInternal_id, @JsonProperty("EffectiveDate")Date EffectiveDate) {
    super(id, "AccountDisconnectChargeAmountGet");
    if (AccountInternal_id != null) {
      addInput("AccountInternalId", AccountInternal_id);
    }
    if (EffectiveDate != null) {
      addInput("EffectiveDate", EffectiveDate);
    }
  }

/**
 *
 * Retrieves the AccountDisconnectChargeAmountGetOutputData that results from the AccountDisconnectChargeAmountGetRequest call
 * @return AccountDisconnectChargeAmountGetOutputData resulting from udt call
 *
 */

  public AccountDisconnectChargeAmountGetOutputData getOutput() {
    return AccountDisconnectChargeAmountGetOutputHelper.fromMap(outputMap);
  }
}
