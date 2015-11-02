/*
 * Generated code DO NOT EDIT
 * Generated file: BillMessageGroupMapCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BillMessageGroupMapCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillMessageGroupMapCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BillMessageGroupMapObjectData noOpIn;

/**
 *
 * Constructor to create a   BillMessageGroupMapCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillMessageGroupMapCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BillMessageGroupMapObjectData noOpInIn) {
    super(id, context, "BillMessageGroupMapCreate");
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
