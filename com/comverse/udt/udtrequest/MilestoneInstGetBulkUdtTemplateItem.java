/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneInstGetBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a MilestoneInstGetBulkUdtTemplateItem Bulk Template
 *
 */

public class MilestoneInstGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MilestoneInstObjectKeyData MilestoneInstGetIn;
/**
 *
 * Constructor to create a  MilestoneInstGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MilestoneInstGetBulkUdtTemplateItem(String id, BSDMSessionContext context, MilestoneInstObjectKeyData MilestoneInstGetInIn) {
    super(id, context, "MilestoneInstGet");
    MilestoneInstGetIn = MilestoneInstGetInIn;
  }

  public void translateToMap() {
    if (MilestoneInstGetIn != null) {
      MilestoneInstGetIn.resetFlags(true, true);
      addInput("MilestoneInst", MilestoneInstObjectKeyHelper.toMap(MilestoneInstGetIn, new HashMap(), "MilestoneInstObjectKeyData").get("MilestoneInstObjectKeyData"));
    }
  }


/**
 *
 * Sets the MilestoneInst
 * @param MilestoneInstGetInIn Value of the MilestoneInstGetIn
 *
 */

  public void setMilestoneInst(MilestoneInstObjectKeyData MilestoneInstGetInIn) {
    MilestoneInstGetIn = MilestoneInstGetInIn;
  }

  public void translateFromMap() {
    MilestoneInstGetIn = MilestoneInstObjectKeyHelper.fromMap(inputMap, "MilestoneInst");
  }

/**
 *
 * Gets the MilestoneInst
 * @return Value of the MilestoneInst
 *
 */

  public MilestoneInstObjectKeyData getMilestoneInst( ) {
    return MilestoneInstGetIn;
  }

}
