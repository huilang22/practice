/*
 * Generated code DO NOT EDIT
 * Generated file: UnitCrPlanGetBulkUdtTemplateItem.java
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
 * Class used to create a UnitCrPlanGetBulkUdtTemplateItem Bulk Template
 *
 */

public class UnitCrPlanGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnitCrPlanObjectKeyData UnitCrPlanGetIn;
/**
 *
 * Constructor to create a  UnitCrPlanGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnitCrPlanGetBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrPlanObjectKeyData UnitCrPlanGetInIn) {
    super(id, context, "UnitCrPlanGet");
    UnitCrPlanGetIn = UnitCrPlanGetInIn;
  }

  public void translateToMap() {
    if (UnitCrPlanGetIn != null) {
      UnitCrPlanGetIn.resetFlags(true, true);
      addInput("UnitCrPlan", UnitCrPlanObjectKeyHelper.toMap(UnitCrPlanGetIn, new HashMap(), "UnitCrPlanObjectKeyData").get("UnitCrPlanObjectKeyData"));
    }
  }


/**
 *
 * Sets the UnitCrPlan
 * @param UnitCrPlanGetInIn Value of the UnitCrPlanGetIn
 *
 */

  public void setUnitCrPlan(UnitCrPlanObjectKeyData UnitCrPlanGetInIn) {
    UnitCrPlanGetIn = UnitCrPlanGetInIn;
  }

  public void translateFromMap() {
    UnitCrPlanGetIn = UnitCrPlanObjectKeyHelper.fromMap(inputMap, "UnitCrPlan");
  }

/**
 *
 * Gets the UnitCrPlan
 * @return Value of the UnitCrPlan
 *
 */

  public UnitCrPlanObjectKeyData getUnitCrPlan( ) {
    return UnitCrPlanGetIn;
  }

}
