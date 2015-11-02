/*
 * Generated code DO NOT EDIT
 * Generated file: BulkOrderRequestByAccountGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BulkOrderRequestByAccountGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BulkOrderRequestByAccountGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BulkOrderRequestByAccountGetOutputData noOpIn;

/**
 *
 * Constructor to create a   BulkOrderRequestByAccountGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BulkOrderRequestByAccountGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BulkOrderRequestByAccountGetOutputData noOpInIn) {
    super(id, context, "BulkOrderRequestByAccountGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BulkOrderRequestByAccountGetOutputData", BulkOrderRequestByAccountGetOutputHelper.toMap(noOpIn).get("BulkOrderRequestByAccountGetOutputData"));
    }
  }
/**
 *
 * Sets the  BulkOrderRequestByAccountGetOutputData
 * @param noOpInIn BulkOrderRequestByAccountGetOutputData to set
 *
 */
  public void setBulkOrderRequestByAccountGetOutputData(BulkOrderRequestByAccountGetOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BulkOrderRequestByAccountGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public BulkOrderRequestByAccountGetOutputData getBulkOrderRequestByAccountGetOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BulkOrderRequestByAccountGetOutputHelper.fromMap(inputMap);
  }
}
