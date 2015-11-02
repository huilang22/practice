/*
 * Generated code DO NOT EDIT
 * Generated file: MilestoneInstFindBulkUdtTemplateItem.java
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
 * Class used to create a MilestoneInstFindBulkUdtTemplateItem Bulk Template
 *
 */

public class MilestoneInstFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MilestoneInstObjectFilter MilestoneInstFindIn;
/**
 *
 * Constructor to create a  MilestoneInstFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MilestoneInstFindBulkUdtTemplateItem(String id, BSDMSessionContext context, MilestoneInstObjectFilter MilestoneInstFindInIn) {
    super(id, context, "MilestoneInstFind");
    MilestoneInstFindIn = MilestoneInstFindInIn;
  }

  public void translateToMap() {
    if (MilestoneInstFindIn != null) {
      Integer index =  MilestoneInstFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("MilestoneInst", MilestoneInstObjectHelper.toMap(MilestoneInstFindIn, new HashMap(), "MilestoneInst").get("MilestoneInst"));
    }
  }


/**
 *
 * Sets the MilestoneInst
 * @param MilestoneInstFindInIn Value of the MilestoneInstFindIn
 *
 */

  public void setMilestoneInst(MilestoneInstObjectFilter MilestoneInstFindInIn) {
    MilestoneInstFindIn = MilestoneInstFindInIn;
  }

  public void translateFromMap() {
    MilestoneInstFindIn = MilestoneInstObjectHelper.fromMapFilter(inputMap, "MilestoneInst");
  }

/**
 *
 * Gets the MilestoneInst
 * @return Value of the MilestoneInst
 *
 */

  public MilestoneInstObjectFilter getMilestoneInst( ) {
    return MilestoneInstFindIn;
  }

}
