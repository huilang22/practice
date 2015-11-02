/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorPlanIdGetBulkUdtTemplateItem.java
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
 * Class used to create a CorridorPlanIdGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CorridorPlanIdGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CPIObjectKeyData CPIGetIn;
/**
 *
 * Constructor to create a  CorridorPlanIdGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CorridorPlanIdGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CPIObjectKeyData CPIGetInIn) {
    super(id, context, "CorridorPlanIdGet");
    CPIGetIn = CPIGetInIn;
  }

  public void translateToMap() {
    if (CPIGetIn != null) {
      CPIGetIn.resetFlags(true, true);
      addInput("CorridorPlanId", CPIObjectKeyHelper.toMap(CPIGetIn, new HashMap(), "CPIObjectKeyData").get("CPIObjectKeyData"));
    }
  }


/**
 *
 * Sets the CorridorPlanId
 * @param CPIGetInIn Value of the CPIGetIn
 *
 */

  public void setCorridorPlanId(CPIObjectKeyData CPIGetInIn) {
    CPIGetIn = CPIGetInIn;
  }

  public void translateFromMap() {
    CPIGetIn = CPIObjectKeyHelper.fromMap(inputMap, "CorridorPlanId");
  }

/**
 *
 * Gets the CorridorPlanId
 * @return Value of the CorridorPlanId
 *
 */

  public CPIObjectKeyData getCorridorPlanId( ) {
    return CPIGetIn;
  }

}
