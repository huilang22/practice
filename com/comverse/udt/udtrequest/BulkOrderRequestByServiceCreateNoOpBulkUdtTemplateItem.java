/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BulkOrderRequestByServiceCreateNoOpBulkUdtTemplateItem.java
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

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bat.data.*;
import com.csgsystems.bp.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a BulkOrderRequestByServiceCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BulkOrderRequestByServiceCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestObjectData noOpIn;

/**
 *
 * Constructor to create a   BulkOrderRequestByServiceCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BulkOrderRequestByServiceCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectData noOpInIn) {
    super(id, context, "BulkOrderRequestByServiceCreate");
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
