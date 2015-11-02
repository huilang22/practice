/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceLineItemFindRequest.java
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
 * Class used to create a BalanceLineItemFindRequest Udt Request
 *
 */

public class BalanceLineItemFindRequest extends BalanceLineItemRequest {
/**
 *
 * Constructor to create a  BalanceLineItemFindRequest
 * @param id Unique request name
 * @param BalanceLineItemFindIn BalanceLineItemObjectFilter for BalanceLineItemFindRequest
 *
 */
@JsonCreator
  public BalanceLineItemFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BalanceLineItem")BalanceLineItemObjectFilter BalanceLineItemFindIn) {
    super(id, "BalanceLineItemFind");
    if (BalanceLineItemFindIn != null) {
      Integer index =  BalanceLineItemFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BalanceLineItem", BalanceLineItemObjectHelper.toMap(BalanceLineItemFindIn, new HashMap(), "BalanceLineItem").get("BalanceLineItem"));
    }
  }

/**
 *
 * Retrieves the BalanceLineItemObjectDataList that results from the BalanceLineItemFindRequest call
 * @return BalanceLineItemObjectDataList resulting from udt call
 *
 */

  public BalanceLineItemObjectDataList getOutput() {
    return BalanceLineItemObjectHelper.fromMapList(outputMap, "BalanceLineItemList");
  }
}
