/*
 * Generated code DO NOT EDIT
 * Generated file: BulkOrderRequestByAccountGetBulkUdtTemplateItem.java
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
 * Class used to create a BulkOrderRequestByAccountGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BulkOrderRequestByAccountGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestObjectData ___BatchRequest;
/**
 *
 * Constructor to create a  BulkOrderRequestByAccountGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BulkOrderRequestByAccountGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectData ___BatchRequestIn) {
    super(id, context, "BulkOrderRequestByAccountGet");
    ___BatchRequest = ___BatchRequestIn;
  }

  public void translateToMap() {
    if (___BatchRequest != null) {
      ___BatchRequest.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(___BatchRequest, new HashMap(), "BulkOrderRequestByAccountGetOutputData").get("BulkOrderRequestByAccountGetOutputData"));
    }
  }


/**
 *
 * Sets the BatchRequest
 * @param ___BatchRequestIn Value of the ___BatchRequest
 *
 */

  public void setBatchRequest(BatchRequestObjectData ___BatchRequestIn) {
    ___BatchRequest = ___BatchRequestIn;
  }

  public void translateFromMap() {
    ___BatchRequest = BatchRequestObjectHelper.fromMap(inputMap, "BatchRequest");
  }

/**
 *
 * Gets the BatchRequest
 * @return Value of the BatchRequest
 *
 */

  public BatchRequestObjectData getBatchRequest( ) {
    return ___BatchRequest;
  }

}
