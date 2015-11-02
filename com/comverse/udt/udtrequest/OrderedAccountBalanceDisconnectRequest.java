/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedAccountBalanceDisconnectRequest.java
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
import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a OrderedAccountBalanceDisconnectRequest Udt Request
 *
 */

public class OrderedAccountBalanceDisconnectRequest extends OrderedAccountBalanceSubRequestParent {
/**
 *
 * Constructor to create a  OrderedAccountBalanceDisconnectRequest
 * @param id Unique request name
 * @param oabdAccountBalancesIn AccountBalancesObjectData for OrderedAccountBalanceDisconnectRequest
 * @param oabdOrderIn OrderObjectData for OrderedAccountBalanceDisconnectRequest
 * @param StatusReasonId Integer for OrderedAccountBalanceDisconnectRequest
 * @param InactiveDt Date for OrderedAccountBalanceDisconnectRequest
 * @param Annotation String for OrderedAccountBalanceDisconnectRequest
 * @param NewBalanceAccountInternalId Integer for OrderedAccountBalanceDisconnectRequest
 * @param NewOpenItemId Integer for OrderedAccountBalanceDisconnectRequest
 * @param oabdVerboseResponse Boolean for OrderedAccountBalanceDisconnectRequest
 *
 */
@JsonCreator
  public OrderedAccountBalanceDisconnectRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountBalances")AccountBalancesObjectData oabdAccountBalancesIn, @JsonProperty("Order")OrderObjectData oabdOrderIn, @JsonProperty("StatusReasonId")Integer StatusReasonId, @JsonProperty("InactiveDt")Date InactiveDt, @JsonProperty("Annotation")String Annotation, @JsonProperty("NewBalanceAccountInternalId")Integer NewBalanceAccountInternalId, @JsonProperty("NewOpenItemId")Integer NewOpenItemId, @JsonProperty("VerboseResponse")Boolean oabdVerboseResponse) {
    super(id, "OrderedAccountBalanceDisconnect");
    if (oabdAccountBalancesIn != null) {
      addInput("AccountBalances", AccountBalancesObjectHelper.toMap(oabdAccountBalancesIn, new HashMap(), "OrderedAccountBalanceDisconnectOutputData").get("OrderedAccountBalanceDisconnectOutputData"));
    }
    if (oabdOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(oabdOrderIn, new HashMap(), "OrderedAccountBalanceDisconnectOutputData").get("OrderedAccountBalanceDisconnectOutputData"));
    }
    if (StatusReasonId != null) {
      addInput("StatusReasonId", StatusReasonId);
    }
    if (InactiveDt != null) {
      addInput("InactiveDt", InactiveDt);
    }
    if (Annotation != null) {
      addInput("Annotation", Annotation);
    }
    if (NewBalanceAccountInternalId != null) {
      addInput("NewBalanceAccountInternalId", NewBalanceAccountInternalId);
    }
    if (NewOpenItemId != null) {
      addInput("NewOpenItemId", NewOpenItemId);
    }
    if (oabdVerboseResponse != null) {
      addInput("VerboseResponse", oabdVerboseResponse);
    }
  }

/**
 *
 * Retrieves the OrderedAccountBalanceDisconnectOutputData that results from the OrderedAccountBalanceDisconnectRequest call
 * @return OrderedAccountBalanceDisconnectOutputData resulting from udt call
 *
 */

  public OrderedAccountBalanceDisconnectOutputData getOutput() {
    return OrderedAccountBalanceDisconnectOutputHelper.fromMap(outputMap);
  }
}
