/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorPlanGroupFindBulkUdtTemplateItem.java
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
 * Class used to create a CorridorPlanGroupFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CorridorPlanGroupFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CPGObjectFilter CPGFindIn;
/**
 *
 * Constructor to create a  CorridorPlanGroupFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CorridorPlanGroupFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CPGObjectFilter CPGFindInIn) {
    super(id, context, "CorridorPlanGroupFind");
    CPGFindIn = CPGFindInIn;
  }

  public void translateToMap() {
    if (CPGFindIn != null) {
      Integer index =  CPGFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CorridorPlanGroup", CPGObjectHelper.toMap(CPGFindIn, new HashMap(), "CorridorPlanGroup").get("CorridorPlanGroup"));
    }
  }


/**
 *
 * Sets the CorridorPlanGroup
 * @param CPGFindInIn Value of the CPGFindIn
 *
 */

  public void setCorridorPlanGroup(CPGObjectFilter CPGFindInIn) {
    CPGFindIn = CPGFindInIn;
  }

  public void translateFromMap() {
    CPGFindIn = CPGObjectHelper.fromMapFilter(inputMap, "CorridorPlanGroup");
  }

/**
 *
 * Gets the CorridorPlanGroup
 * @return Value of the CorridorPlanGroup
 *
 */

  public CPGObjectFilter getCorridorPlanGroup( ) {
    return CPGFindIn;
  }

}
