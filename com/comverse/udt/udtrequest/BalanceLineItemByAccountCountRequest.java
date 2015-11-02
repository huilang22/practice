/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceLineItemByAccountCountRequest.java
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
 * Class used to create a BalanceLineItemByAccountCountRequest Udt Request
 *
 */

public class BalanceLineItemByAccountCountRequest extends BalanceLineItemRequest {
/**
 *
 * Constructor to create a  BalanceLineItemByAccountCountRequest
 * @param id Unique request name
 * @param BalanceLineItemAcctFindCountIn BalanceLineItemAccountObjectFilter for BalanceLineItemByAccountCountRequest
 * @param LatestInvoice1 Boolean for BalanceLineItemByAccountCountRequest
 *
 */
@JsonCreator
  public BalanceLineItemByAccountCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("BalanceLineItem")BalanceLineItemAccountObjectFilter BalanceLineItemAcctFindCountIn, @JsonProperty("LatestInvoice")Boolean LatestInvoice1) {
    super(id, "BalanceLineItemByAccountCount");
    if (BalanceLineItemAcctFindCountIn != null) {
      Integer index =  BalanceLineItemAcctFindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BalanceLineItem", BalanceLineItemAccountObjectHelper.toMap(BalanceLineItemAcctFindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
    if (LatestInvoice1 != null) {
      addInput("LatestInvoice", LatestInvoice1);
    }
  }

/**
 *
 * Retrieves the Integer that results from the BalanceLineItemByAccountCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("TotalCount");
  }
}
