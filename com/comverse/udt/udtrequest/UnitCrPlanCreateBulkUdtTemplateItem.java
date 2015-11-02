/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrPlanCreateBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a UnitCrPlanCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class UnitCrPlanCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnitCrPlanObjectData UnitCrPlanCreateIn;
/**
 *
 * Constructor to create a  UnitCrPlanCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnitCrPlanCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrPlanObjectData UnitCrPlanCreateInIn) {
    super(id, context, "UnitCrPlanCreate");
    UnitCrPlanCreateIn = UnitCrPlanCreateInIn;
  }

  public void translateToMap() {
    if (UnitCrPlanCreateIn != null) {
      UnitCrPlanCreateIn.resetFlags(true, true);
      addInput("UnitCrPlan", UnitCrPlanObjectHelper.toMap(UnitCrPlanCreateIn, new HashMap(), "UnitCrPlan").get("UnitCrPlan"));
    }
  }


/**
 *
 * Sets the UnitCrPlan
 * @param UnitCrPlanCreateInIn Value of the UnitCrPlanCreateIn
 *
 */

  public void setUnitCrPlan(UnitCrPlanObjectData UnitCrPlanCreateInIn) {
    UnitCrPlanCreateIn = UnitCrPlanCreateInIn;
  }

  public void translateFromMap() {
    UnitCrPlanCreateIn = UnitCrPlanObjectHelper.fromMap(inputMap, "UnitCrPlan");
  }

/**
 *
 * Gets the UnitCrPlan
 * @return Value of the UnitCrPlan
 *
 */

  public UnitCrPlanObjectData getUnitCrPlan( ) {
    return UnitCrPlanCreateIn;
  }

}
