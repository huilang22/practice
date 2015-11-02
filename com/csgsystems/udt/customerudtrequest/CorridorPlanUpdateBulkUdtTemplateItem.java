/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorPlanUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CorridorPlanUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CorridorPlanUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CPObjectData CPUpdateIn;
/**
 *
 * Constructor to create a  CorridorPlanUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CorridorPlanUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CPObjectData CPUpdateInIn) {
    super(id, context, "CorridorPlanUpdate");
    CPUpdateIn = CPUpdateInIn;
  }

  public void translateToMap() {
    if (CPUpdateIn != null) {
      CPUpdateIn.resetFlags(true, true);
      addInput("CorridorPlan", CPObjectHelper.toMap(CPUpdateIn, new HashMap(), "CorridorPlan").get("CorridorPlan"));
    }
  }


/**
 *
 * Sets the CorridorPlan
 * @param CPUpdateInIn Value of the CPUpdateIn
 *
 */

  public void setCorridorPlan(CPObjectData CPUpdateInIn) {
    CPUpdateIn = CPUpdateInIn;
  }

  public void translateFromMap() {
    CPUpdateIn = CPObjectHelper.fromMap(inputMap, "CorridorPlan");
  }

/**
 *
 * Gets the CorridorPlan
 * @return Value of the CorridorPlan
 *
 */

  public CPObjectData getCorridorPlan( ) {
    return CPUpdateIn;
  }

}
