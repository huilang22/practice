/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorPlanIdCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CorridorPlanIdCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CorridorPlanIdCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CPIObjectData noOpIn;

/**
 *
 * Constructor to create a   CorridorPlanIdCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CorridorPlanIdCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CPIObjectData noOpInIn) {
    super(id, context, "CorridorPlanIdCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CorridorPlanId", CPIObjectHelper.toMap(noOpIn, new HashMap(), "CorridorPlanId").get("CorridorPlanId"));
    }
  }
/**
 *
 * Sets the  CorridorPlanId
 * @param noOpInIn CPIObjectData to set
 *
 */
  public void setCorridorPlanId(CPIObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CorridorPlanId passed into the constructor
 * @return Simulated response
 *
 */
  public CPIObjectData getCorridorPlanId() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CPIObjectHelper.fromMap(inputMap, "CorridorPlanId");
  }
}
