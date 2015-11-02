/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceLineItemBulkAdjustmentUpdateRequest.java
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
 * Class used to create a BalanceLineItemBulkAdjustmentUpdateRequest Udt Request
 *
 */

public class BalanceLineItemBulkAdjustmentUpdateRequest extends BalanceLineItemBulkAdjustmentSubRequestParent {
/**
 *
 * Constructor to create a  BalanceLineItemBulkAdjustmentUpdateRequest
 * @param id Unique request name
 * @param ___BulkAdjustment BulkAdjustmentObjectData for BalanceLineItemBulkAdjustmentUpdateRequest
 * @param ______BatchRequest BatchRequestObjectData for BalanceLineItemBulkAdjustmentUpdateRequest
 * @param ________BalanceLineItem BalanceLineItemObjectData[] for BalanceLineItemBulkAdjustmentUpdateRequest
 * @param __BalanceLineItemQuery BalanceLineItemQueryObjectData for BalanceLineItemBulkAdjustmentUpdateRequest
 * @param __XMLFileName String for BalanceLineItemBulkAdjustmentUpdateRequest
 * @param __CDFFileName String for BalanceLineItemBulkAdjustmentUpdateRequest
 *
 */
@JsonCreator
  public BalanceLineItemBulkAdjustmentUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BulkAdjustment")BulkAdjustmentObjectData ___BulkAdjustment, @JsonProperty("BatchRequest")BatchRequestObjectData ______BatchRequest, @JsonProperty("BalanceLineItem")BalanceLineItemObjectData[] ________BalanceLineItem, @JsonProperty("BalanceLineItemQuery")BalanceLineItemQueryObjectData __BalanceLineItemQuery, @JsonProperty("XMLFileName")String __XMLFileName, @JsonProperty("CDFFileName")String __CDFFileName) {
    super(id, "BalanceLineItemBulkAdjustmentUpdate");
    if (___BulkAdjustment != null) {
      addInput("BulkAdjustment", BulkAdjustmentObjectHelper.toMap(___BulkAdjustment, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (______BatchRequest != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(______BatchRequest, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (________BalanceLineItem != null) {
      Object[] list = new Object[________BalanceLineItem.length];
      for (int i = 0; i < ________BalanceLineItem.length; i++) {
        list[i] = BalanceLineItemObjectHelper.getMap(________BalanceLineItem[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "BalanceLineItem");
      }
      addInput("BalanceLineItemList", list);
    }
    if (__BalanceLineItemQuery != null) {
      addInput("BalanceLineItemQuery", BalanceLineItemQueryObjectHelper.toMap(__BalanceLineItemQuery, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (__XMLFileName != null) {
      addInput("XMLFileName", __XMLFileName);
    }
    if (__CDFFileName != null) {
      addInput("CDFFileName", __CDFFileName);
    }
  }

/**
 *
 * Retrieves the BatchRequestObjectData that results from the BalanceLineItemBulkAdjustmentUpdateRequest call
 * @return BatchRequestObjectData resulting from udt call
 *
 */

  public BatchRequestObjectData getOutput() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
}
