/*
 * Generated code DO NOT EDIT
 * Generated file: BillPeriodFindBulkUdtTemplateItem.java
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
 * Class used to create a BillPeriodFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BillPeriodFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BPObjectFilter BPFindIn;
/**
 *
 * Constructor to create a  BillPeriodFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillPeriodFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BPObjectFilter BPFindInIn) {
    super(id, context, "BillPeriodFind");
    BPFindIn = BPFindInIn;
  }

  public void translateToMap() {
    if (BPFindIn != null) {
      Integer index =  BPFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BillPeriod", BPObjectHelper.toMap(BPFindIn, new HashMap(), "BillPeriod").get("BillPeriod"));
    }
  }


/**
 *
 * Sets the BillPeriod
 * @param BPFindInIn Value of the BPFindIn
 *
 */

  public void setBillPeriod(BPObjectFilter BPFindInIn) {
    BPFindIn = BPFindInIn;
  }

  public void translateFromMap() {
    BPFindIn = BPObjectHelper.fromMapFilter(inputMap, "BillPeriod");
  }

/**
 *
 * Gets the BillPeriod
 * @return Value of the BillPeriod
 *
 */

  public BPObjectFilter getBillPeriod( ) {
    return BPFindIn;
  }

}
