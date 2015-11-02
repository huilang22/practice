/*
 * Generated code DO NOT EDIT
 * Generated file: MilestoneInstUpdateBulkUdtTemplateItem.java
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
 * Class used to create a MilestoneInstUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class MilestoneInstUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MilestoneInstObjectData MilestoneInstUpdateIn;
/**
 *
 * Constructor to create a  MilestoneInstUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MilestoneInstUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, MilestoneInstObjectData MilestoneInstUpdateInIn) {
    super(id, context, "MilestoneInstUpdate");
    MilestoneInstUpdateIn = MilestoneInstUpdateInIn;
  }

  public void translateToMap() {
    if (MilestoneInstUpdateIn != null) {
      MilestoneInstUpdateIn.resetFlags(true, true);
      addInput("MilestoneInst", MilestoneInstObjectHelper.toMap(MilestoneInstUpdateIn, new HashMap(), "MilestoneInst").get("MilestoneInst"));
    }
  }


/**
 *
 * Sets the MilestoneInst
 * @param MilestoneInstUpdateInIn Value of the MilestoneInstUpdateIn
 *
 */

  public void setMilestoneInst(MilestoneInstObjectData MilestoneInstUpdateInIn) {
    MilestoneInstUpdateIn = MilestoneInstUpdateInIn;
  }

  public void translateFromMap() {
    MilestoneInstUpdateIn = MilestoneInstObjectHelper.fromMap(inputMap, "MilestoneInst");
  }

/**
 *
 * Gets the MilestoneInst
 * @return Value of the MilestoneInst
 *
 */

  public MilestoneInstObjectData getMilestoneInst( ) {
    return MilestoneInstUpdateIn;
  }

}
