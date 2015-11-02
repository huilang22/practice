/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedAccountDisconnectRequest.java
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
 * Class used to create a OrderedAccountDisconnectRequest Udt Request
 *
 */

public class OrderedAccountDisconnectRequest extends OrderedAccountSubRequestParent {
/**
 *
 * Constructor to create a  OrderedAccountDisconnectRequest
 * @param id Unique request name
 * @param oadAccountIn AccountObjectData for OrderedAccountDisconnectRequest
 * @param StatusReasonId Integer for OrderedAccountDisconnectRequest
 * @param InactiveDt Date for OrderedAccountDisconnectRequest
 * @param Annotation String for OrderedAccountDisconnectRequest
 * @param WaiveInstallmentNrc Integer for OrderedAccountDisconnectRequest
 * @param WaiveUnbilledNrc Integer for OrderedAccountDisconnectRequest
 * @param WaiveTerminationObligation Integer for OrderedAccountDisconnectRequest
 * @param WaiveUnmetObligation Integer for OrderedAccountDisconnectRequest
 * @param WaiveRefinanceNrc Integer for OrderedAccountDisconnectRequest
 * @param NewPostpaidAccountInternalId Integer for OrderedAccountDisconnectRequest
 * @param NewBalanceAccountInternalId Integer for OrderedAccountDisconnectRequest
 * @param NewOpenItemId Integer for OrderedAccountDisconnectRequest
 * @param oadVerboseResponse Boolean for OrderedAccountDisconnectRequest
 *
 */
@JsonCreator
  public OrderedAccountDisconnectRequest(@JsonProperty("RequestId") String id, @JsonProperty("Account")AccountObjectData oadAccountIn, @JsonProperty("StatusReasonId")Integer StatusReasonId, @JsonProperty("InactiveDt")Date InactiveDt, @JsonProperty("Annotation")String Annotation, @JsonProperty("WaiveInstallmentNrc")Integer WaiveInstallmentNrc, @JsonProperty("WaiveUnbilledNrc")Integer WaiveUnbilledNrc, @JsonProperty("WaiveTerminationObligation")Integer WaiveTerminationObligation, @JsonProperty("WaiveUnmetObligation")Integer WaiveUnmetObligation, @JsonProperty("WaiveRefinanceNrc")Integer WaiveRefinanceNrc, @JsonProperty("NewPostpaidAccountInternalId")Integer NewPostpaidAccountInternalId, @JsonProperty("NewBalanceAccountInternalId")Integer NewBalanceAccountInternalId, @JsonProperty("NewOpenItemId")Integer NewOpenItemId, @JsonProperty("VerboseResponse")Boolean oadVerboseResponse) {
    super(id, "OrderedAccountDisconnect");
    if (oadAccountIn != null) {
      addInput("Account", AccountObjectHelper.toMap(oadAccountIn, new HashMap(), "OrderedAccountDisconnectOutputData").get("OrderedAccountDisconnectOutputData"));
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
    if (WaiveInstallmentNrc != null) {
      addInput("WaiveInstallmentNrc", WaiveInstallmentNrc);
    }
    if (WaiveUnbilledNrc != null) {
      addInput("WaiveUnbilledNrc", WaiveUnbilledNrc);
    }
    if (WaiveTerminationObligation != null) {
      addInput("WaiveTerminationObligation", WaiveTerminationObligation);
    }
    if (WaiveUnmetObligation != null) {
      addInput("WaiveUnmetObligation", WaiveUnmetObligation);
    }
    if (WaiveRefinanceNrc != null) {
      addInput("WaiveRefinanceNrc", WaiveRefinanceNrc);
    }
    if (NewPostpaidAccountInternalId != null) {
      addInput("NewPostpaidAccountInternalId", NewPostpaidAccountInternalId);
    }
    if (NewBalanceAccountInternalId != null) {
      addInput("NewBalanceAccountInternalId", NewBalanceAccountInternalId);
    }
    if (NewOpenItemId != null) {
      addInput("NewOpenItemId", NewOpenItemId);
    }
    if (oadVerboseResponse != null) {
      addInput("VerboseResponse", oadVerboseResponse);
    }
  }

/**
 *
 * Retrieves the OrderedAccountDisconnectOutputData that results from the OrderedAccountDisconnectRequest call
 * @return OrderedAccountDisconnectOutputData resulting from udt call
 *
 */

  public OrderedAccountDisconnectOutputData getOutput() {
    return OrderedAccountDisconnectOutputHelper.fromMap(outputMap);
  }
}
