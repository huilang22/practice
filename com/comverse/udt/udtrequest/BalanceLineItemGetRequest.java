/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceLineItemGetRequest.java
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
 * Class used to create a BalanceLineItemGetRequest Udt Request
 *
 */

public class BalanceLineItemGetRequest extends BalanceLineItemSubRequestParent {
/**
 *
 * Constructor to create a  BalanceLineItemGetRequest
 * @param id Unique request name
 * @param BalanceLineItemGetIn BalanceLineItemObjectKeyData for BalanceLineItemGetRequest
 *
 */
@JsonCreator
  public BalanceLineItemGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BalanceLineItem")BalanceLineItemObjectKeyData BalanceLineItemGetIn) {
    super(id, "BalanceLineItemGet");
    if (BalanceLineItemGetIn != null) {
      addInput("BalanceLineItem", BalanceLineItemObjectKeyHelper.toMap(BalanceLineItemGetIn, new HashMap(), "BalanceLineItemObjectKeyData").get("BalanceLineItemObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BalanceLineItemObjectData that results from the BalanceLineItemGetRequest call
 * @return BalanceLineItemObjectData resulting from udt call
 *
 */

  public BalanceLineItemObjectData getOutput() {
    return BalanceLineItemObjectHelper.fromMap(outputMap, "BalanceLineItem");
  }
}
