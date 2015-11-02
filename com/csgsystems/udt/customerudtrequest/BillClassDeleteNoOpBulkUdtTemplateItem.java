/*
 * Generated code DO NOT EDIT
 * Generated file: BillClassDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BillClassDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillClassDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BCObjectData noOpIn;

/**
 *
 * Constructor to create a   BillClassDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillClassDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BCObjectData noOpInIn) {
    super(id, context, "BillClassDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BillClass", BCObjectHelper.toMap(noOpIn, new HashMap(), "BillClass").get("BillClass"));
    }
  }
/**
 *
 * Sets the  BillClass
 * @param noOpInIn BCObjectData to set
 *
 */
  public void setBillClass(BCObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillClass passed into the constructor
 * @return Simulated response
 *
 */
  public BCObjectData getBillClass() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BCObjectHelper.fromMap(inputMap, "BillClass");
  }
}
