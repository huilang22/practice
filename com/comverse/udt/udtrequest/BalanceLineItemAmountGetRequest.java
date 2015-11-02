/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceLineItemAmountGetRequest.java
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
 * Class used to create a BalanceLineItemAmountGetRequest Udt Request
 *
 */

public class BalanceLineItemAmountGetRequest extends BalanceLineItemRequest {
/**
 *
 * Constructor to create a  BalanceLineItemAmountGetRequest
 * @param id Unique request name
 * @param BalanceLineItemAmountGetIn BalanceLineItemObjectKeyData for BalanceLineItemAmountGetRequest
 *
 */
@JsonCreator
  public BalanceLineItemAmountGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BalanceLineItem")BalanceLineItemObjectKeyData BalanceLineItemAmountGetIn) {
    super(id, "BalanceLineItemAmountGet");
    if (BalanceLineItemAmountGetIn != null) {
      addInput("BalanceLineItem", BalanceLineItemObjectKeyHelper.toMap(BalanceLineItemAmountGetIn, new HashMap(), "BalanceLineItemObjectKeyData").get("BalanceLineItemObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BigInteger that results from the BalanceLineItemAmountGetRequest call
 * @return BigInteger resulting from udt call
 *
 */

  public BigInteger getOutput() {
    return  (BigInteger)outputMap.get("AdjustmentEligibleAmount");
  }
}
