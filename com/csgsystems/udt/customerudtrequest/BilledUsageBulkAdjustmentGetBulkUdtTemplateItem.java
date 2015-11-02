/*
 * Generated code DO NOT EDIT
 * Generated file: BilledUsageBulkAdjustmentGetBulkUdtTemplateItem.java
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
 * Class used to create a BilledUsageBulkAdjustmentGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BilledUsageBulkAdjustmentGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestObjectKeyData ___BatchRequest;
/**
 *
 * Constructor to create a  BilledUsageBulkAdjustmentGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BilledUsageBulkAdjustmentGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectKeyData ___BatchRequestIn) {
    super(id, context, "BilledUsageBulkAdjustmentGet");
    ___BatchRequest = ___BatchRequestIn;
  }

  public void translateToMap() {
    if (___BatchRequest != null) {
      ___BatchRequest.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(___BatchRequest, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchRequest
 * @param ___BatchRequestIn Value of the ___BatchRequest
 *
 */

  public void setBatchRequest(BatchRequestObjectKeyData ___BatchRequestIn) {
    ___BatchRequest = ___BatchRequestIn;
  }

  public void translateFromMap() {
    ___BatchRequest = BatchRequestObjectKeyHelper.fromMap(inputMap, "BatchRequest");
  }

/**
 *
 * Gets the BatchRequest
 * @return Value of the BatchRequest
 *
 */

  public BatchRequestObjectKeyData getBatchRequest( ) {
    return ___BatchRequest;
  }

}
