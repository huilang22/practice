/*
 * Generated code DO NOT EDIT
 * Generated file: BillPeriodDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BillPeriodDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BillPeriodDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BPObjectKeyData BPDeleteIn;
/**
 *
 * Constructor to create a  BillPeriodDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillPeriodDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BPObjectKeyData BPDeleteInIn) {
    super(id, context, "BillPeriodDelete");
    BPDeleteIn = BPDeleteInIn;
  }

  public void translateToMap() {
    if (BPDeleteIn != null) {
      BPDeleteIn.resetFlags(true, true);
      addInput("BillPeriod", BPObjectKeyHelper.toMap(BPDeleteIn, new HashMap(), "BPObjectKeyData").get("BPObjectKeyData"));
    }
  }


/**
 *
 * Sets the BillPeriod
 * @param BPDeleteInIn Value of the BPDeleteIn
 *
 */

  public void setBillPeriod(BPObjectKeyData BPDeleteInIn) {
    BPDeleteIn = BPDeleteInIn;
  }

  public void translateFromMap() {
    BPDeleteIn = BPObjectKeyHelper.fromMap(inputMap, "BillPeriod");
  }

/**
 *
 * Gets the BillPeriod
 * @return Value of the BillPeriod
 *
 */

  public BPObjectKeyData getBillPeriod( ) {
    return BPDeleteIn;
  }

}
