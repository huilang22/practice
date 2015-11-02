/*
 * Generated code DO NOT EDIT
 * Generated file: MilestoneInstHstryFindBulkUdtTemplateItem.java
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
import com.csgsystems.we.data.*;

/**
 *
 * Class used to create a MilestoneInstHstryFindBulkUdtTemplateItem Bulk Template
 *
 */

public class MilestoneInstHstryFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MilestoneInstHstryObjectFilter MilestoneInstHstryFindIn;
/**
 *
 * Constructor to create a  MilestoneInstHstryFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MilestoneInstHstryFindBulkUdtTemplateItem(String id, BSDMSessionContext context, MilestoneInstHstryObjectFilter MilestoneInstHstryFindInIn) {
    super(id, context, "MilestoneInstHstryFind");
    MilestoneInstHstryFindIn = MilestoneInstHstryFindInIn;
  }

  public void translateToMap() {
    if (MilestoneInstHstryFindIn != null) {
      Integer index =  MilestoneInstHstryFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("MilestoneInstHstry", MilestoneInstHstryObjectHelper.toMap(MilestoneInstHstryFindIn, new HashMap(), "MilestoneInstHstry").get("MilestoneInstHstry"));
    }
  }


/**
 *
 * Sets the MilestoneInstHstry
 * @param MilestoneInstHstryFindInIn Value of the MilestoneInstHstryFindIn
 *
 */

  public void setMilestoneInstHstry(MilestoneInstHstryObjectFilter MilestoneInstHstryFindInIn) {
    MilestoneInstHstryFindIn = MilestoneInstHstryFindInIn;
  }

  public void translateFromMap() {
    MilestoneInstHstryFindIn = MilestoneInstHstryObjectHelper.fromMapFilter(inputMap, "MilestoneInstHstry");
  }

/**
 *
 * Gets the MilestoneInstHstry
 * @return Value of the MilestoneInstHstry
 *
 */

  public MilestoneInstHstryObjectFilter getMilestoneInstHstry( ) {
    return MilestoneInstHstryFindIn;
  }

}
