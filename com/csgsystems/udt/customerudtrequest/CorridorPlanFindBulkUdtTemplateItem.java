/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorPlanFindBulkUdtTemplateItem.java
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
 * Class used to create a CorridorPlanFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CorridorPlanFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CPObjectFilter CPFindIn;
/**
 *
 * Constructor to create a  CorridorPlanFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CorridorPlanFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CPObjectFilter CPFindInIn) {
    super(id, context, "CorridorPlanFind");
    CPFindIn = CPFindInIn;
  }

  public void translateToMap() {
    if (CPFindIn != null) {
      Integer index =  CPFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CorridorPlan", CPObjectHelper.toMap(CPFindIn, new HashMap(), "CorridorPlan").get("CorridorPlan"));
    }
  }


/**
 *
 * Sets the CorridorPlan
 * @param CPFindInIn Value of the CPFindIn
 *
 */

  public void setCorridorPlan(CPObjectFilter CPFindInIn) {
    CPFindIn = CPFindInIn;
  }

  public void translateFromMap() {
    CPFindIn = CPObjectHelper.fromMapFilter(inputMap, "CorridorPlan");
  }

/**
 *
 * Gets the CorridorPlan
 * @return Value of the CorridorPlan
 *
 */

  public CPObjectFilter getCorridorPlan( ) {
    return CPFindIn;
  }

}
