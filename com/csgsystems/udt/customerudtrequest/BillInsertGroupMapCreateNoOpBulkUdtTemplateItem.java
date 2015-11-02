/*
 * Generated code DO NOT EDIT
 * Generated file: BillInsertGroupMapCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BillInsertGroupMapCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillInsertGroupMapCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BillInsertGroupMapObjectData noOpIn;

/**
 *
 * Constructor to create a   BillInsertGroupMapCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillInsertGroupMapCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BillInsertGroupMapObjectData noOpInIn) {
    super(id, context, "BillInsertGroupMapCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BillInsertGroupMap", BillInsertGroupMapObjectHelper.toMap(noOpIn, new HashMap(), "BillInsertGroupMap").get("BillInsertGroupMap"));
    }
  }
/**
 *
 * Sets the  BillInsertGroupMap
 * @param noOpInIn BillInsertGroupMapObjectData to set
 *
 */
  public void setBillInsertGroupMap(BillInsertGroupMapObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillInsertGroupMap passed into the constructor
 * @return Simulated response
 *
 */
  public BillInsertGroupMapObjectData getBillInsertGroupMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BillInsertGroupMapObjectHelper.fromMap(inputMap, "BillInsertGroupMap");
  }
}
