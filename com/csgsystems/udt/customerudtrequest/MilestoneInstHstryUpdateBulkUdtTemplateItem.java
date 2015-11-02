/*
 * Generated code DO NOT EDIT
 * Generated file: MilestoneInstHstryUpdateBulkUdtTemplateItem.java
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
 * Class used to create a MilestoneInstHstryUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class MilestoneInstHstryUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MilestoneInstHstryObjectData MilestoneInstHstryUpdateIn;
/**
 *
 * Constructor to create a  MilestoneInstHstryUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MilestoneInstHstryUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, MilestoneInstHstryObjectData MilestoneInstHstryUpdateInIn) {
    super(id, context, "MilestoneInstHstryUpdate");
    MilestoneInstHstryUpdateIn = MilestoneInstHstryUpdateInIn;
  }

  public void translateToMap() {
    if (MilestoneInstHstryUpdateIn != null) {
      MilestoneInstHstryUpdateIn.resetFlags(true, true);
      addInput("MilestoneInstHstry", MilestoneInstHstryObjectHelper.toMap(MilestoneInstHstryUpdateIn, new HashMap(), "MilestoneInstHstry").get("MilestoneInstHstry"));
    }
  }


/**
 *
 * Sets the MilestoneInstHstry
 * @param MilestoneInstHstryUpdateInIn Value of the MilestoneInstHstryUpdateIn
 *
 */

  public void setMilestoneInstHstry(MilestoneInstHstryObjectData MilestoneInstHstryUpdateInIn) {
    MilestoneInstHstryUpdateIn = MilestoneInstHstryUpdateInIn;
  }

  public void translateFromMap() {
    MilestoneInstHstryUpdateIn = MilestoneInstHstryObjectHelper.fromMap(inputMap, "MilestoneInstHstry");
  }

/**
 *
 * Gets the MilestoneInstHstry
 * @return Value of the MilestoneInstHstry
 *
 */

  public MilestoneInstHstryObjectData getMilestoneInstHstry( ) {
    return MilestoneInstHstryUpdateIn;
  }

}
