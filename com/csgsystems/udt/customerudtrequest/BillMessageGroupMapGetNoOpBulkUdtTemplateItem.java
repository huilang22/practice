/*
 * Generated code DO NOT EDIT
 * Generated file: BillMessageGroupMapGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a BillMessageGroupMapGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillMessageGroupMapGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BillMessageGroupMapObjectData noOpIn;

/**
 *
 * Constructor to create a   BillMessageGroupMapGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillMessageGroupMapGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BillMessageGroupMapObjectData noOpInIn) {
    super(id, context, "BillMessageGroupMapGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BillMessageGroupMap", BillMessageGroupMapObjectHelper.toMap(noOpIn, new HashMap(), "BillMessageGroupMap").get("BillMessageGroupMap"));
    }
  }
/**
 *
 * Sets the  BillMessageGroupMap
 * @param noOpInIn BillMessageGroupMapObjectData to set
 *
 */
  public void setBillMessageGroupMap(BillMessageGroupMapObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillMessageGroupMap passed into the constructor
 * @return Simulated response
 *
 */
  public BillMessageGroupMapObjectData getBillMessageGroupMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BillMessageGroupMapObjectHelper.fromMap(inputMap, "BillMessageGroupMap");
  }
}
