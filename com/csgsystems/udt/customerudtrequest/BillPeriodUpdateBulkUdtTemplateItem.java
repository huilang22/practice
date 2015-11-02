/*
 * Generated code DO NOT EDIT
 * Generated file: BillPeriodUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BillPeriodUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BillPeriodUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BPObjectData BPUpdateIn;
/**
 *
 * Constructor to create a  BillPeriodUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillPeriodUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BPObjectData BPUpdateInIn) {
    super(id, context, "BillPeriodUpdate");
    BPUpdateIn = BPUpdateInIn;
  }

  public void translateToMap() {
    if (BPUpdateIn != null) {
      BPUpdateIn.resetFlags(true, true);
      addInput("BillPeriod", BPObjectHelper.toMap(BPUpdateIn, new HashMap(), "BillPeriod").get("BillPeriod"));
    }
  }


/**
 *
 * Sets the BillPeriod
 * @param BPUpdateInIn Value of the BPUpdateIn
 *
 */

  public void setBillPeriod(BPObjectData BPUpdateInIn) {
    BPUpdateIn = BPUpdateInIn;
  }

  public void translateFromMap() {
    BPUpdateIn = BPObjectHelper.fromMap(inputMap, "BillPeriod");
  }

/**
 *
 * Gets the BillPeriod
 * @return Value of the BillPeriod
 *
 */

  public BPObjectData getBillPeriod( ) {
    return BPUpdateIn;
  }

}
