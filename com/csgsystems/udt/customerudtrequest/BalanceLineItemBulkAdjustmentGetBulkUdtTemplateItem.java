/*
 * Generated code DO NOT EDIT
 * Generated file: BalanceLineItemBulkAdjustmentGetBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bat.data.*;
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a BalanceLineItemBulkAdjustmentGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BalanceLineItemBulkAdjustmentGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestObjectKeyData __BatchRequest;
/**
 *
 * Constructor to create a  BalanceLineItemBulkAdjustmentGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BalanceLineItemBulkAdjustmentGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectKeyData __BatchRequestIn) {
    super(id, context, "BalanceLineItemBulkAdjustmentGet");
    __BatchRequest = __BatchRequestIn;
  }

  public void translateToMap() {
    if (__BatchRequest != null) {
      __BatchRequest.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(__BatchRequest, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchRequest
 * @param __BatchRequestIn Value of the __BatchRequest
 *
 */

  public void setBatchRequest(BatchRequestObjectKeyData __BatchRequestIn) {
    __BatchRequest = __BatchRequestIn;
  }

  public void translateFromMap() {
    __BatchRequest = BatchRequestObjectKeyHelper.fromMap(inputMap, "BatchRequest");
  }

/**
 *
 * Gets the BatchRequest
 * @return Value of the BatchRequest
 *
 */

  public BatchRequestObjectKeyData getBatchRequest( ) {
    return __BatchRequest;
  }

}
