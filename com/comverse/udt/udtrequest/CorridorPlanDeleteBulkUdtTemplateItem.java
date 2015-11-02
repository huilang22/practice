/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorPlanDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CorridorPlanDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CorridorPlanDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CPObjectKeyData CPDeleteIn;
/**
 *
 * Constructor to create a  CorridorPlanDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CorridorPlanDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CPObjectKeyData CPDeleteInIn) {
    super(id, context, "CorridorPlanDelete");
    CPDeleteIn = CPDeleteInIn;
  }

  public void translateToMap() {
    if (CPDeleteIn != null) {
      CPDeleteIn.resetFlags(true, true);
      addInput("CorridorPlan", CPObjectKeyHelper.toMap(CPDeleteIn, new HashMap(), "CPObjectKeyData").get("CPObjectKeyData"));
    }
  }


/**
 *
 * Sets the CorridorPlan
 * @param CPDeleteInIn Value of the CPDeleteIn
 *
 */

  public void setCorridorPlan(CPObjectKeyData CPDeleteInIn) {
    CPDeleteIn = CPDeleteInIn;
  }

  public void translateFromMap() {
    CPDeleteIn = CPObjectKeyHelper.fromMap(inputMap, "CorridorPlan");
  }

/**
 *
 * Gets the CorridorPlan
 * @return Value of the CorridorPlan
 *
 */

  public CPObjectKeyData getCorridorPlan( ) {
    return CPDeleteIn;
  }

}
