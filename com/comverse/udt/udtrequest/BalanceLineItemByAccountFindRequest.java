/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceLineItemByAccountFindRequest.java
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
 * Class used to create a BalanceLineItemByAccountFindRequest Udt Request
 *
 */

public class BalanceLineItemByAccountFindRequest extends BalanceLineItemRequest {
/**
 *
 * Constructor to create a  BalanceLineItemByAccountFindRequest
 * @param id Unique request name
 * @param BalanceLineItemAcctFindIn BalanceLineItemAccountObjectFilter for BalanceLineItemByAccountFindRequest
 * @param LatestInvoice Boolean for BalanceLineItemByAccountFindRequest
 *
 */
@JsonCreator
  public BalanceLineItemByAccountFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BalanceLineItem")BalanceLineItemAccountObjectFilter BalanceLineItemAcctFindIn, @JsonProperty("LatestInvoice")Boolean LatestInvoice) {
    super(id, "BalanceLineItemByAccountFind");
    if (BalanceLineItemAcctFindIn != null) {
      Integer index =  BalanceLineItemAcctFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BalanceLineItem", BalanceLineItemAccountObjectHelper.toMap(BalanceLineItemAcctFindIn, new HashMap(), "BalanceLineItem").get("BalanceLineItem"));
    }
    if (LatestInvoice != null) {
      addInput("LatestInvoice", LatestInvoice);
    }
  }

/**
 *
 * Retrieves the BalanceLineItemObjectDataList that results from the BalanceLineItemByAccountFindRequest call
 * @return BalanceLineItemObjectDataList resulting from udt call
 *
 */

  public BalanceLineItemObjectDataList getOutput() {
    return BalanceLineItemObjectHelper.fromMapList(outputMap, "BalanceLineItemList");
  }
}
