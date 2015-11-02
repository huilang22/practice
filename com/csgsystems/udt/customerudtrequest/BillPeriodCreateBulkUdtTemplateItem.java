/*
 * Generated code DO NOT EDIT
 * Generated file: BillPeriodCreateBulkUdtTemplateItem.java
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
 * Class used to create a BillPeriodCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BillPeriodCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BPObjectData BPCreateIn;
/**
 *
 * Constructor to create a  BillPeriodCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillPeriodCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BPObjectData BPCreateInIn) {
    super(id, context, "BillPeriodCreate");
    BPCreateIn = BPCreateInIn;
  }

  public void translateToMap() {
    if (BPCreateIn != null) {
      BPCreateIn.resetFlags(true, true);
      addInput("BillPeriod", BPObjectHelper.toMap(BPCreateIn, new HashMap(), "BillPeriod").get("BillPeriod"));
    }
  }


/**
 *
 * Sets the BillPeriod
 * @param BPCreateInIn Value of the BPCreateIn
 *
 */

  public void setBillPeriod(BPObjectData BPCreateInIn) {
    BPCreateIn = BPCreateInIn;
  }

  public void translateFromMap() {
    BPCreateIn = BPObjectHelper.fromMap(inputMap, "BillPeriod");
  }

/**
 *
 * Gets the BillPeriod
 * @return Value of the BillPeriod
 *
 */

  public BPObjectData getBillPeriod( ) {
    return BPCreateIn;
  }

}
