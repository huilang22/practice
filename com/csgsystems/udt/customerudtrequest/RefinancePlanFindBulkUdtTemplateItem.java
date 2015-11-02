/*
 * Generated code DO NOT EDIT
 * Generated file: RefinancePlanFindBulkUdtTemplateItem.java
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
 * Class used to create a RefinancePlanFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RefinancePlanFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RefinancePlanObjectFilter RefinancePlanFindIn;
/**
 *
 * Constructor to create a  RefinancePlanFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RefinancePlanFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RefinancePlanObjectFilter RefinancePlanFindInIn) {
    super(id, context, "RefinancePlanFind");
    RefinancePlanFindIn = RefinancePlanFindInIn;
  }

  public void translateToMap() {
    if (RefinancePlanFindIn != null) {
      Integer index =  RefinancePlanFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RefinancePlan", RefinancePlanObjectHelper.toMap(RefinancePlanFindIn, new HashMap(), "RefinancePlan").get("RefinancePlan"));
    }
  }


/**
 *
 * Sets the RefinancePlan
 * @param RefinancePlanFindInIn Value of the RefinancePlanFindIn
 *
 */

  public void setRefinancePlan(RefinancePlanObjectFilter RefinancePlanFindInIn) {
    RefinancePlanFindIn = RefinancePlanFindInIn;
  }

  public void translateFromMap() {
    RefinancePlanFindIn = RefinancePlanObjectHelper.fromMapFilter(inputMap, "RefinancePlan");
  }

/**
 *
 * Gets the RefinancePlan
 * @return Value of the RefinancePlan
 *
 */

  public RefinancePlanObjectFilter getRefinancePlan( ) {
    return RefinancePlanFindIn;
  }

}
