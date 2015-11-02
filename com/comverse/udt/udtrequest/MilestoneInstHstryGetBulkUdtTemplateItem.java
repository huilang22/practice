/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneInstHstryGetBulkUdtTemplateItem.java
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
 * Class used to create a MilestoneInstHstryGetBulkUdtTemplateItem Bulk Template
 *
 */

public class MilestoneInstHstryGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MilestoneInstHstryObjectKeyData MilestoneInstHstryGetIn;
/**
 *
 * Constructor to create a  MilestoneInstHstryGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MilestoneInstHstryGetBulkUdtTemplateItem(String id, BSDMSessionContext context, MilestoneInstHstryObjectKeyData MilestoneInstHstryGetInIn) {
    super(id, context, "MilestoneInstHstryGet");
    MilestoneInstHstryGetIn = MilestoneInstHstryGetInIn;
  }

  public void translateToMap() {
    if (MilestoneInstHstryGetIn != null) {
      MilestoneInstHstryGetIn.resetFlags(true, true);
      addInput("MilestoneInstHstry", MilestoneInstHstryObjectKeyHelper.toMap(MilestoneInstHstryGetIn, new HashMap(), "MilestoneInstHstryObjectKeyData").get("MilestoneInstHstryObjectKeyData"));
    }
  }


/**
 *
 * Sets the MilestoneInstHstry
 * @param MilestoneInstHstryGetInIn Value of the MilestoneInstHstryGetIn
 *
 */

  public void setMilestoneInstHstry(MilestoneInstHstryObjectKeyData MilestoneInstHstryGetInIn) {
    MilestoneInstHstryGetIn = MilestoneInstHstryGetInIn;
  }

  public void translateFromMap() {
    MilestoneInstHstryGetIn = MilestoneInstHstryObjectKeyHelper.fromMap(inputMap, "MilestoneInstHstry");
  }

/**
 *
 * Gets the MilestoneInstHstry
 * @return Value of the MilestoneInstHstry
 *
 */

  public MilestoneInstHstryObjectKeyData getMilestoneInstHstry( ) {
    return MilestoneInstHstryGetIn;
  }

}
