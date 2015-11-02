/*
 * Generated code DO NOT EDIT
 * Generated file: BillFmtOptUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a BillFmtOptUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillFmtOptUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BllFmtOptObjectData noOpIn;

/**
 *
 * Constructor to create a   BillFmtOptUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillFmtOptUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BllFmtOptObjectData noOpInIn) {
    super(id, context, "BillFmtOptUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BillFmtOpt", BllFmtOptObjectHelper.toMap(noOpIn, new HashMap(), "BillFmtOpt").get("BillFmtOpt"));
    }
  }
/**
 *
 * Sets the  BillFmtOpt
 * @param noOpInIn BllFmtOptObjectData to set
 *
 */
  public void setBillFmtOpt(BllFmtOptObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillFmtOpt passed into the constructor
 * @return Simulated response
 *
 */
  public BllFmtOptObjectData getBillFmtOpt() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BllFmtOptObjectHelper.fromMap(inputMap, "BillFmtOpt");
  }
}
