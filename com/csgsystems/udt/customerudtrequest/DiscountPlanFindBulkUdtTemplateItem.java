/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountPlanFindBulkUdtTemplateItem.java
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
 * Class used to create a DiscountPlanFindBulkUdtTemplateItem Bulk Template
 *
 */

public class DiscountPlanFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DPObjectFilter DPFindIn;
/**
 *
 * Constructor to create a  DiscountPlanFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DiscountPlanFindBulkUdtTemplateItem(String id, BSDMSessionContext context, DPObjectFilter DPFindInIn) {
    super(id, context, "DiscountPlanFind");
    DPFindIn = DPFindInIn;
  }

  public void translateToMap() {
    if (DPFindIn != null) {
      Integer index =  DPFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("DiscountPlan", DPObjectHelper.toMap(DPFindIn, new HashMap(), "DiscountPlan").get("DiscountPlan"));
    }
  }


/**
 *
 * Sets the DiscountPlan
 * @param DPFindInIn Value of the DPFindIn
 *
 */

  public void setDiscountPlan(DPObjectFilter DPFindInIn) {
    DPFindIn = DPFindInIn;
  }

  public void translateFromMap() {
    DPFindIn = DPObjectHelper.fromMapFilter(inputMap, "DiscountPlan");
  }

/**
 *
 * Gets the DiscountPlan
 * @return Value of the DiscountPlan
 *
 */

  public DPObjectFilter getDiscountPlan( ) {
    return DPFindIn;
  }

}
