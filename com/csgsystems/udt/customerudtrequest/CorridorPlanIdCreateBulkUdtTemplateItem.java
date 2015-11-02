/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorPlanIdCreateBulkUdtTemplateItem.java
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
 * Class used to create a CorridorPlanIdCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CorridorPlanIdCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CPIObjectData CPICrIn;
/**
 *
 * Constructor to create a  CorridorPlanIdCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CorridorPlanIdCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CPIObjectData CPICrInIn) {
    super(id, context, "CorridorPlanIdCreate");
    CPICrIn = CPICrInIn;
  }

  public void translateToMap() {
    if (CPICrIn != null) {
      CPICrIn.resetFlags(true, true);
      addInput("CorridorPlanId", CPIObjectHelper.toMap(CPICrIn, new HashMap(), "CorridorPlanId").get("CorridorPlanId"));
    }
  }


/**
 *
 * Sets the CorridorPlanId
 * @param CPICrInIn Value of the CPICrIn
 *
 */

  public void setCorridorPlanId(CPIObjectData CPICrInIn) {
    CPICrIn = CPICrInIn;
  }

  public void translateFromMap() {
    CPICrIn = CPIObjectHelper.fromMap(inputMap, "CorridorPlanId");
  }

/**
 *
 * Gets the CorridorPlanId
 * @return Value of the CorridorPlanId
 *
 */

  public CPIObjectData getCorridorPlanId( ) {
    return CPICrIn;
  }

}
