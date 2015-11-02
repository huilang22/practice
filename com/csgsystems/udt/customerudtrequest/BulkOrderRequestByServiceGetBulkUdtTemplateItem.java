/*
 * Generated code DO NOT EDIT
 * Generated file: BulkOrderRequestByServiceGetBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a BulkOrderRequestByServiceGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BulkOrderRequestByServiceGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestObjectData _________BatchRequest;
/**
 *
 * Constructor to create a  BulkOrderRequestByServiceGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BulkOrderRequestByServiceGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectData _________BatchRequestIn) {
    super(id, context, "BulkOrderRequestByServiceGet");
    _________BatchRequest = _________BatchRequestIn;
  }

  public void translateToMap() {
    if (_________BatchRequest != null) {
      _________BatchRequest.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(_________BatchRequest, new HashMap(), "BulkOrderRequestByServiceGetOutputData").get("BulkOrderRequestByServiceGetOutputData"));
    }
  }


/**
 *
 * Sets the BatchRequest
 * @param _________BatchRequestIn Value of the _________BatchRequest
 *
 */

  public void setBatchRequest(BatchRequestObjectData _________BatchRequestIn) {
    _________BatchRequest = _________BatchRequestIn;
  }

  public void translateFromMap() {
    _________BatchRequest = BatchRequestObjectHelper.fromMap(inputMap, "BatchRequest");
  }

/**
 *
 * Gets the BatchRequest
 * @return Value of the BatchRequest
 *
 */

  public BatchRequestObjectData getBatchRequest( ) {
    return _________BatchRequest;
  }

}
