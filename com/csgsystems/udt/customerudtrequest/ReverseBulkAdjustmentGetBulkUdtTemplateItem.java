/*
 * Generated code DO NOT EDIT
 * Generated file: ReverseBulkAdjustmentGetBulkUdtTemplateItem.java
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
 * Class used to create a ReverseBulkAdjustmentGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ReverseBulkAdjustmentGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestObjectKeyData _BatchRequest;
/**
 *
 * Constructor to create a  ReverseBulkAdjustmentGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ReverseBulkAdjustmentGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectKeyData _BatchRequestIn) {
    super(id, context, "ReverseBulkAdjustmentGet");
    _BatchRequest = _BatchRequestIn;
  }

  public void translateToMap() {
    if (_BatchRequest != null) {
      _BatchRequest.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(_BatchRequest, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchRequest
 * @param _BatchRequestIn Value of the _BatchRequest
 *
 */

  public void setBatchRequest(BatchRequestObjectKeyData _BatchRequestIn) {
    _BatchRequest = _BatchRequestIn;
  }

  public void translateFromMap() {
    _BatchRequest = BatchRequestObjectKeyHelper.fromMap(inputMap, "BatchRequest");
  }

/**
 *
 * Gets the BatchRequest
 * @return Value of the BatchRequest
 *
 */

  public BatchRequestObjectKeyData getBatchRequest( ) {
    return _BatchRequest;
  }

}
