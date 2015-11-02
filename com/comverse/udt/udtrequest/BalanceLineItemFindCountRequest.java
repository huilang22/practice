/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceLineItemFindCountRequest.java
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
 * Class used to create a BalanceLineItemFindCountRequest Udt Request
 *
 */

public class BalanceLineItemFindCountRequest extends BalanceLineItemRequest {
/**
 *
 * Constructor to create a  BalanceLineItemFindCountRequest
 * @param id Unique request name
 * @param BalanceLineItemFindCountIn BalanceLineItemObjectFilter for BalanceLineItemFindCountRequest
 *
 */
@JsonCreator
  public BalanceLineItemFindCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("BalanceLineItem")BalanceLineItemObjectFilter BalanceLineItemFindCountIn) {
    super(id, "BalanceLineItemFindCount");
    if (BalanceLineItemFindCountIn != null) {
      Integer index =  BalanceLineItemFindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BalanceLineItem", BalanceLineItemObjectHelper.toMap(BalanceLineItemFindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the BalanceLineItemFindCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("TotalCount");
  }
}
