/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceLineItemBulkAdjustmentGetRequest.java
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
 * Class used to create a BalanceLineItemBulkAdjustmentGetRequest Udt Request
 *
 */

public class BalanceLineItemBulkAdjustmentGetRequest extends BalanceLineItemBulkAdjustmentSubRequestParent {
/**
 *
 * Constructor to create a  BalanceLineItemBulkAdjustmentGetRequest
 * @param id Unique request name
 * @param __BatchRequest BatchRequestObjectKeyData for BalanceLineItemBulkAdjustmentGetRequest
 *
 */
@JsonCreator
  public BalanceLineItemBulkAdjustmentGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequest")BatchRequestObjectKeyData __BatchRequest) {
    super(id, "BalanceLineItemBulkAdjustmentGet");
    if (__BatchRequest != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(__BatchRequest, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BalanceLineItemBulkAdjustmentGetOutputData that results from the BalanceLineItemBulkAdjustmentGetRequest call
 * @return BalanceLineItemBulkAdjustmentGetOutputData resulting from udt call
 *
 */

  public BalanceLineItemBulkAdjustmentGetOutputData getOutput() {
    return BalanceLineItemBulkAdjustmentGetOutputHelper.fromMap(outputMap);
  }
}
