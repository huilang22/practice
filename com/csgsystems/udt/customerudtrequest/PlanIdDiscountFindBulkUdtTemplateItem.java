/*
 * Generated code DO NOT EDIT
 * Generated file: PlanIdDiscountFindBulkUdtTemplateItem.java
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
 * Class used to create a PlanIdDiscountFindBulkUdtTemplateItem Bulk Template
 *
 */

public class PlanIdDiscountFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PIDObjectFilter PIDFindIn;
/**
 *
 * Constructor to create a  PlanIdDiscountFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PlanIdDiscountFindBulkUdtTemplateItem(String id, BSDMSessionContext context, PIDObjectFilter PIDFindInIn) {
    super(id, context, "PlanIdDiscountFind");
    PIDFindIn = PIDFindInIn;
  }

  public void translateToMap() {
    if (PIDFindIn != null) {
      Integer index =  PIDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PlanIdDiscount", PIDObjectHelper.toMap(PIDFindIn, new HashMap(), "PlanIdDiscount").get("PlanIdDiscount"));
    }
  }


/**
 *
 * Sets the PlanIdDiscount
 * @param PIDFindInIn Value of the PIDFindIn
 *
 */

  public void setPlanIdDiscount(PIDObjectFilter PIDFindInIn) {
    PIDFindIn = PIDFindInIn;
  }

  public void translateFromMap() {
    PIDFindIn = PIDObjectHelper.fromMapFilter(inputMap, "PlanIdDiscount");
  }

/**
 *
 * Gets the PlanIdDiscount
 * @return Value of the PlanIdDiscount
 *
 */

  public PIDObjectFilter getPlanIdDiscount( ) {
    return PIDFindIn;
  }

}
