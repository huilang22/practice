/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorPlanGetBulkUdtTemplateItem.java
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
 * Class used to create a CorridorPlanGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CorridorPlanGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CPObjectKeyData CPGetIn;
/**
 *
 * Constructor to create a  CorridorPlanGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CorridorPlanGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CPObjectKeyData CPGetInIn) {
    super(id, context, "CorridorPlanGet");
    CPGetIn = CPGetInIn;
  }

  public void translateToMap() {
    if (CPGetIn != null) {
      CPGetIn.resetFlags(true, true);
      addInput("CorridorPlan", CPObjectKeyHelper.toMap(CPGetIn, new HashMap(), "CPObjectKeyData").get("CPObjectKeyData"));
    }
  }


/**
 *
 * Sets the CorridorPlan
 * @param CPGetInIn Value of the CPGetIn
 *
 */

  public void setCorridorPlan(CPObjectKeyData CPGetInIn) {
    CPGetIn = CPGetInIn;
  }

  public void translateFromMap() {
    CPGetIn = CPObjectKeyHelper.fromMap(inputMap, "CorridorPlan");
  }

/**
 *
 * Gets the CorridorPlan
 * @return Value of the CorridorPlan
 *
 */

  public CPObjectKeyData getCorridorPlan( ) {
    return CPGetIn;
  }

}
