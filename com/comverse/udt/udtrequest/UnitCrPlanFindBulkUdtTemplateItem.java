/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrPlanFindBulkUdtTemplateItem.java
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
 * Class used to create a UnitCrPlanFindBulkUdtTemplateItem Bulk Template
 *
 */

public class UnitCrPlanFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnitCrPlanObjectFilter UnitCrPlanFindIn;
/**
 *
 * Constructor to create a  UnitCrPlanFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnitCrPlanFindBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrPlanObjectFilter UnitCrPlanFindInIn) {
    super(id, context, "UnitCrPlanFind");
    UnitCrPlanFindIn = UnitCrPlanFindInIn;
  }

  public void translateToMap() {
    if (UnitCrPlanFindIn != null) {
      Integer index =  UnitCrPlanFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnitCrPlan", UnitCrPlanObjectHelper.toMap(UnitCrPlanFindIn, new HashMap(), "UnitCrPlan").get("UnitCrPlan"));
    }
  }


/**
 *
 * Sets the UnitCrPlan
 * @param UnitCrPlanFindInIn Value of the UnitCrPlanFindIn
 *
 */

  public void setUnitCrPlan(UnitCrPlanObjectFilter UnitCrPlanFindInIn) {
    UnitCrPlanFindIn = UnitCrPlanFindInIn;
  }

  public void translateFromMap() {
    UnitCrPlanFindIn = UnitCrPlanObjectHelper.fromMapFilter(inputMap, "UnitCrPlan");
  }

/**
 *
 * Gets the UnitCrPlan
 * @return Value of the UnitCrPlan
 *
 */

  public UnitCrPlanObjectFilter getUnitCrPlan( ) {
    return UnitCrPlanFindIn;
  }

}
