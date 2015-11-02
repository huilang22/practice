/*
 * Generated code DO NOT EDIT
 * Generated file: BillCycleFindBulkUdtTemplateItem.java
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
 * Class used to create a BillCycleFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BillCycleFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillCycleObjectFilter BillCyclefindIn;
/**
 *
 * Constructor to create a  BillCycleFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillCycleFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BillCycleObjectFilter BillCyclefindInIn) {
    super(id, context, "BillCycleFind");
    BillCyclefindIn = BillCyclefindInIn;
  }

  public void translateToMap() {
    if (BillCyclefindIn != null) {
      Integer index =  BillCyclefindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BillCycle", BillCycleObjectHelper.toMap(BillCyclefindIn, new HashMap(), "BillCycle").get("BillCycle"));
    }
  }


/**
 *
 * Sets the BillCycle
 * @param BillCyclefindInIn Value of the BillCyclefindIn
 *
 */

  public void setBillCycle(BillCycleObjectFilter BillCyclefindInIn) {
    BillCyclefindIn = BillCyclefindInIn;
  }

  public void translateFromMap() {
    BillCyclefindIn = BillCycleObjectHelper.fromMapFilter(inputMap, "BillCycle");
  }

/**
 *
 * Gets the BillCycle
 * @return Value of the BillCycle
 *
 */

  public BillCycleObjectFilter getBillCycle( ) {
    return BillCyclefindIn;
  }

}
