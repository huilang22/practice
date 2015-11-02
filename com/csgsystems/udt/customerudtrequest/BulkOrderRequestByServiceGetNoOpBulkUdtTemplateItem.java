/*
 * Generated code DO NOT EDIT
 * Generated file: BulkOrderRequestByServiceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BulkOrderRequestByServiceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BulkOrderRequestByServiceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BulkOrderRequestByServiceGetOutputData noOpIn;

/**
 *
 * Constructor to create a   BulkOrderRequestByServiceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BulkOrderRequestByServiceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BulkOrderRequestByServiceGetOutputData noOpInIn) {
    super(id, context, "BulkOrderRequestByServiceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BulkOrderRequestByServiceGetOutputData", BulkOrderRequestByServiceGetOutputHelper.toMap(noOpIn).get("BulkOrderRequestByServiceGetOutputData"));
    }
  }
/**
 *
 * Sets the  BulkOrderRequestByServiceGetOutputData
 * @param noOpInIn BulkOrderRequestByServiceGetOutputData to set
 *
 */
  public void setBulkOrderRequestByServiceGetOutputData(BulkOrderRequestByServiceGetOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BulkOrderRequestByServiceGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public BulkOrderRequestByServiceGetOutputData getBulkOrderRequestByServiceGetOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BulkOrderRequestByServiceGetOutputHelper.fromMap(inputMap);
  }
}
