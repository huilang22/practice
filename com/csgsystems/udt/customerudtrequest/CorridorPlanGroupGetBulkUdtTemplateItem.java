/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorPlanGroupGetBulkUdtTemplateItem.java
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
 * Class used to create a CorridorPlanGroupGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CorridorPlanGroupGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CPGObjectKeyData CPGGetIn;
/**
 *
 * Constructor to create a  CorridorPlanGroupGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CorridorPlanGroupGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CPGObjectKeyData CPGGetInIn) {
    super(id, context, "CorridorPlanGroupGet");
    CPGGetIn = CPGGetInIn;
  }

  public void translateToMap() {
    if (CPGGetIn != null) {
      CPGGetIn.resetFlags(true, true);
      addInput("CorridorPlanGroup", CPGObjectKeyHelper.toMap(CPGGetIn, new HashMap(), "CPGObjectKeyData").get("CPGObjectKeyData"));
    }
  }


/**
 *
 * Sets the CorridorPlanGroup
 * @param CPGGetInIn Value of the CPGGetIn
 *
 */

  public void setCorridorPlanGroup(CPGObjectKeyData CPGGetInIn) {
    CPGGetIn = CPGGetInIn;
  }

  public void translateFromMap() {
    CPGGetIn = CPGObjectKeyHelper.fromMap(inputMap, "CorridorPlanGroup");
  }

/**
 *
 * Gets the CorridorPlanGroup
 * @return Value of the CorridorPlanGroup
 *
 */

  public CPGObjectKeyData getCorridorPlanGroup( ) {
    return CPGGetIn;
  }

}
