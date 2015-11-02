/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorPlanGroupCreateBulkUdtTemplateItem.java
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
 * Class used to create a CorridorPlanGroupCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CorridorPlanGroupCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CPGObjectData CPGCreateIn;
/**
 *
 * Constructor to create a  CorridorPlanGroupCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CorridorPlanGroupCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CPGObjectData CPGCreateInIn) {
    super(id, context, "CorridorPlanGroupCreate");
    CPGCreateIn = CPGCreateInIn;
  }

  public void translateToMap() {
    if (CPGCreateIn != null) {
      CPGCreateIn.resetFlags(true, true);
      addInput("CorridorPlanGroup", CPGObjectHelper.toMap(CPGCreateIn, new HashMap(), "CorridorPlanGroup").get("CorridorPlanGroup"));
    }
  }


/**
 *
 * Sets the CorridorPlanGroup
 * @param CPGCreateInIn Value of the CPGCreateIn
 *
 */

  public void setCorridorPlanGroup(CPGObjectData CPGCreateInIn) {
    CPGCreateIn = CPGCreateInIn;
  }

  public void translateFromMap() {
    CPGCreateIn = CPGObjectHelper.fromMap(inputMap, "CorridorPlanGroup");
  }

/**
 *
 * Gets the CorridorPlanGroup
 * @return Value of the CorridorPlanGroup
 *
 */

  public CPGObjectData getCorridorPlanGroup( ) {
    return CPGCreateIn;
  }

}
