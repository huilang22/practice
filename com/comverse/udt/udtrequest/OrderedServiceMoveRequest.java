/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedServiceMoveRequest.java
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
 * Class used to create a OrderedServiceMoveRequest Udt Request
 *
 */

public class OrderedServiceMoveRequest extends OrderedServiceSubRequestParent {
/**
 *
 * Constructor to create a  OrderedServiceMoveRequest
 * @param id Unique request name
 * @param osMoveServiceIn ServiceObjectData for OrderedServiceMoveRequest
 * @param osMoveReqServiceOrderIn ServiceOrderObjectData for OrderedServiceMoveRequest
 * @param AddressId Integer for OrderedServiceMoveRequest
 * @param PivotDate Date for OrderedServiceMoveRequest
 * @param UpdateAccountBillingAddress Integer for OrderedServiceMoveRequest
 * @param UpdateAccountAlternateAddress Integer for OrderedServiceMoveRequest
 * @param osMoveVerboseResponse Boolean for OrderedServiceMoveRequest
 *
 */
@JsonCreator
  public OrderedServiceMoveRequest(@JsonProperty("RequestId") String id, @JsonProperty("Service")ServiceObjectData osMoveServiceIn, @JsonProperty("ServiceOrder")ServiceOrderObjectData osMoveReqServiceOrderIn, @JsonProperty("AddressId")Integer AddressId, @JsonProperty("PivotDate")Date PivotDate, @JsonProperty("UpdateAccountBillingAddress")Integer UpdateAccountBillingAddress, @JsonProperty("UpdateAccountAlternateAddress")Integer UpdateAccountAlternateAddress, @JsonProperty("VerboseResponse")Boolean osMoveVerboseResponse) {
    super(id, "OrderedServiceMove");
    if (osMoveServiceIn != null) {
      addInput("Service", ServiceObjectHelper.toMap(osMoveServiceIn, new HashMap(), "OrderedServiceMoveOutputData").get("OrderedServiceMoveOutputData"));
    }
    if (osMoveReqServiceOrderIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(osMoveReqServiceOrderIn, new HashMap(), "OrderedServiceMoveOutputData").get("OrderedServiceMoveOutputData"));
    }
    if (AddressId != null) {
      addInput("AddressId", AddressId);
    }
    if (PivotDate != null) {
      addInput("PivotDate", PivotDate);
    }
    if (UpdateAccountBillingAddress != null) {
      addInput("UpdateAccountBillingAddress", UpdateAccountBillingAddress);
    }
    if (UpdateAccountAlternateAddress != null) {
      addInput("UpdateAccountAlternateAddress", UpdateAccountAlternateAddress);
    }
    if (osMoveVerboseResponse != null) {
      addInput("VerboseResponse", osMoveVerboseResponse);
    }
  }

/**
 *
 * Retrieves the OrderedServiceMoveOutputData that results from the OrderedServiceMoveRequest call
 * @return OrderedServiceMoveOutputData resulting from udt call
 *
 */

  public OrderedServiceMoveOutputData getOutput() {
    return OrderedServiceMoveOutputHelper.fromMap(outputMap);
  }
}
