/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorPlanIdFindBulkUdtTemplateItem.java
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
 * Class used to create a CorridorPlanIdFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CorridorPlanIdFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CPIObjectFilter CPIFindIn;
/**
 *
 * Constructor to create a  CorridorPlanIdFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CorridorPlanIdFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CPIObjectFilter CPIFindInIn) {
    super(id, context, "CorridorPlanIdFind");
    CPIFindIn = CPIFindInIn;
  }

  public void translateToMap() {
    if (CPIFindIn != null) {
      Integer index =  CPIFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CorridorPlanId", CPIObjectHelper.toMap(CPIFindIn, new HashMap(), "CorridorPlanId").get("CorridorPlanId"));
    }
  }


/**
 *
 * Sets the CorridorPlanId
 * @param CPIFindInIn Value of the CPIFindIn
 *
 */

  public void setCorridorPlanId(CPIObjectFilter CPIFindInIn) {
    CPIFindIn = CPIFindInIn;
  }

  public void translateFromMap() {
    CPIFindIn = CPIObjectHelper.fromMapFilter(inputMap, "CorridorPlanId");
  }

/**
 *
 * Gets the CorridorPlanId
 * @return Value of the CorridorPlanId
 *
 */

  public CPIObjectFilter getCorridorPlanId( ) {
    return CPIFindIn;
  }

}
