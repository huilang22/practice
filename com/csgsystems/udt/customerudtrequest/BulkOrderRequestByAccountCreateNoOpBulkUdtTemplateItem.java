/*
 * Generated code DO NOT EDIT
 * Generated file: BulkOrderRequestByAccountCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BulkOrderRequestByAccountCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BulkOrderRequestByAccountCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestObjectData noOpIn;

/**
 *
 * Constructor to create a   BulkOrderRequestByAccountCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BulkOrderRequestByAccountCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectData noOpInIn) {
    super(id, context, "BulkOrderRequestByAccountCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BulkOrderRequest", BatchRequestObjectHelper.toMap(noOpIn, new HashMap(), "BulkOrderRequest").get("BulkOrderRequest"));
    }
  }
/**
 *
 * Sets the  BulkOrderRequest
 * @param noOpInIn BatchRequestObjectData to set
 *
 */
  public void setBulkOrderRequest(BatchRequestObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BulkOrderRequest passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestObjectData getBulkOrderRequest() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestObjectHelper.fromMap(inputMap, "BulkOrderRequest");
  }
}
