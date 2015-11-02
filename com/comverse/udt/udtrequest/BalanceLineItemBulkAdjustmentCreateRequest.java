/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceLineItemBulkAdjustmentCreateRequest.java
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

import com.csgsystems.bat.data.*;
import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BalanceLineItemBulkAdjustmentCreateRequest Udt Request
 *
 */

public class BalanceLineItemBulkAdjustmentCreateRequest extends BalanceLineItemBulkAdjustmentSubRequestParent {
/**
 *
 * Constructor to create a  BalanceLineItemBulkAdjustmentCreateRequest
 * @param id Unique request name
 * @param ____BulkAdjustment BulkAdjustmentObjectData for BalanceLineItemBulkAdjustmentCreateRequest
 * @param ____BatchRequest BatchRequestObjectData for BalanceLineItemBulkAdjustmentCreateRequest
 * @param _____BalanceLineItem BalanceLineItemObjectData[] for BalanceLineItemBulkAdjustmentCreateRequest
 * @param ____BalanceLineItemQuery BalanceLineItemQueryObjectData for BalanceLineItemBulkAdjustmentCreateRequest
 * @param XMLFileName String for BalanceLineItemBulkAdjustmentCreateRequest
 * @param CDFFileName String for BalanceLineItemBulkAdjustmentCreateRequest
 *
 */
@JsonCreator
  public BalanceLineItemBulkAdjustmentCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BulkAdjustment")BulkAdjustmentObjectData ____BulkAdjustment, @JsonProperty("BatchRequest")BatchRequestObjectData ____BatchRequest, @JsonProperty("BalanceLineItem")BalanceLineItemObjectData[] _____BalanceLineItem, @JsonProperty("BalanceLineItemQuery")BalanceLineItemQueryObjectData ____BalanceLineItemQuery, @JsonProperty("XMLFileName")String XMLFileName, @JsonProperty("CDFFileName")String CDFFileName) {
    super(id, "BalanceLineItemBulkAdjustmentCreate");
    if (____BulkAdjustment != null) {
      addInput("BulkAdjustment", BulkAdjustmentObjectHelper.toMap(____BulkAdjustment, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (____BatchRequest != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(____BatchRequest, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (_____BalanceLineItem != null) {
      Object[] list = new Object[_____BalanceLineItem.length];
      for (int i = 0; i < _____BalanceLineItem.length; i++) {
        list[i] = BalanceLineItemObjectHelper.getMap(_____BalanceLineItem[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "BalanceLineItem");
      }
      addInput("BalanceLineItemList", list);
    }
    if (____BalanceLineItemQuery != null) {
      addInput("BalanceLineItemQuery", BalanceLineItemQueryObjectHelper.toMap(____BalanceLineItemQuery, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (XMLFileName != null) {
      addInput("XMLFileName", XMLFileName);
    }
    if (CDFFileName != null) {
      addInput("CDFFileName", CDFFileName);
    }
  }

/**
 *
 * Retrieves the BatchRequestObjectData that results from the BalanceLineItemBulkAdjustmentCreateRequest call
 * @return BatchRequestObjectData resulting from udt call
 *
 */

  public BatchRequestObjectData getOutput() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
}
