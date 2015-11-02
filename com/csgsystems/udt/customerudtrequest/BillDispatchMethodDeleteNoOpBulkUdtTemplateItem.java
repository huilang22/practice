/*
 * Generated code DO NOT EDIT
 * Generated file: BillDispatchMethodDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BillDispatchMethodDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillDispatchMethodDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BillDispatchMethodObjectData noOpIn;

/**
 *
 * Constructor to create a   BillDispatchMethodDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillDispatchMethodDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BillDispatchMethodObjectData noOpInIn) {
    super(id, context, "BillDispatchMethodDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BillDispatchMethod", BillDispatchMethodObjectHelper.toMap(noOpIn, new HashMap(), "BillDispatchMethod").get("BillDispatchMethod"));
    }
  }
/**
 *
 * Sets the  BillDispatchMethod
 * @param noOpInIn BillDispatchMethodObjectData to set
 *
 */
  public void setBillDispatchMethod(BillDispatchMethodObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillDispatchMethod passed into the constructor
 * @return Simulated response
 *
 */
  public BillDispatchMethodObjectData getBillDispatchMethod() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BillDispatchMethodObjectHelper.fromMap(inputMap, "BillDispatchMethod");
  }
}
