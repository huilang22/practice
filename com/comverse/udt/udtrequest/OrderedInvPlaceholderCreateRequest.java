/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedInvPlaceholderCreateRequest.java
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

import com.csgsystems.iv.data.*;
import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a OrderedInvPlaceholderCreateRequest Udt Request
 *
 */

public class OrderedInvPlaceholderCreateRequest extends OrderedInvPlaceholderSubRequestParent {
/**
 *
 * Constructor to create a  OrderedInvPlaceholderCreateRequest
 * @param id Unique request name
 * @param oipcInvPlaceholderIn InvPlaceholderObjectData for OrderedInvPlaceholderCreateRequest
 * @param oipcOrderIn OrderObjectData for OrderedInvPlaceholderCreateRequest
 * @param oipcServiceOrderIn ServiceOrderObjectData for OrderedInvPlaceholderCreateRequest
 * @param oipcVerboseResponse Boolean for OrderedInvPlaceholderCreateRequest
 *
 */
@JsonCreator
  public OrderedInvPlaceholderCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvPlaceholder")InvPlaceholderObjectData oipcInvPlaceholderIn, @JsonProperty("Order")OrderObjectData oipcOrderIn, @JsonProperty("ServiceOrder")ServiceOrderObjectData oipcServiceOrderIn, @JsonProperty("VerboseResponse")Boolean oipcVerboseResponse) {
    super(id, "OrderedInvPlaceholderCreate");
    if (oipcInvPlaceholderIn != null) {
      addInput("InvPlaceholder", InvPlaceholderObjectHelper.toMap(oipcInvPlaceholderIn, new HashMap(), "OrderedInvPlaceholderCreateOutputData").get("OrderedInvPlaceholderCreateOutputData"));
    }
    if (oipcOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(oipcOrderIn, new HashMap(), "OrderedInvPlaceholderCreateOutputData").get("OrderedInvPlaceholderCreateOutputData"));
    }
    if (oipcServiceOrderIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(oipcServiceOrderIn, new HashMap(), "OrderedInvPlaceholderCreateOutputData").get("OrderedInvPlaceholderCreateOutputData"));
    }
    if (oipcVerboseResponse != null) {
      addInput("VerboseResponse", oipcVerboseResponse);
    }
  }

/**
 *
 * Retrieves the OrderedInvPlaceholderCreateOutputData that results from the OrderedInvPlaceholderCreateRequest call
 * @return OrderedInvPlaceholderCreateOutputData resulting from udt call
 *
 */

  public OrderedInvPlaceholderCreateOutputData getOutput() {
    return OrderedInvPlaceholderCreateOutputHelper.fromMap(outputMap);
  }
}
