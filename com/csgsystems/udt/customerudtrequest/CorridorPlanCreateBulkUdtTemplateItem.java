/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorPlanCreateBulkUdtTemplateItem.java
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
 * Class used to create a CorridorPlanCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CorridorPlanCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CPObjectData CPCreateIn;
/**
 *
 * Constructor to create a  CorridorPlanCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CorridorPlanCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CPObjectData CPCreateInIn) {
    super(id, context, "CorridorPlanCreate");
    CPCreateIn = CPCreateInIn;
  }

  public void translateToMap() {
    if (CPCreateIn != null) {
      CPCreateIn.resetFlags(true, true);
      addInput("CorridorPlan", CPObjectHelper.toMap(CPCreateIn, new HashMap(), "CorridorPlan").get("CorridorPlan"));
    }
  }


/**
 *
 * Sets the CorridorPlan
 * @param CPCreateInIn Value of the CPCreateIn
 *
 */

  public void setCorridorPlan(CPObjectData CPCreateInIn) {
    CPCreateIn = CPCreateInIn;
  }

  public void translateFromMap() {
    CPCreateIn = CPObjectHelper.fromMap(inputMap, "CorridorPlan");
  }

/**
 *
 * Gets the CorridorPlan
 * @return Value of the CorridorPlan
 *
 */

  public CPObjectData getCorridorPlan( ) {
    return CPCreateIn;
  }

}
