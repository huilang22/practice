/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneInstHstryCreateBulkUdtTemplateItem.java
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
 * Class used to create a MilestoneInstHstryCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class MilestoneInstHstryCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MilestoneInstHstryObjectData msihCrIn;
/**
 *
 * Constructor to create a  MilestoneInstHstryCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MilestoneInstHstryCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, MilestoneInstHstryObjectData msihCrInIn) {
    super(id, context, "MilestoneInstHstryCreate");
    msihCrIn = msihCrInIn;
  }

  public void translateToMap() {
    if (msihCrIn != null) {
      msihCrIn.resetFlags(true, true);
      addInput("MilestoneInstHstry", MilestoneInstHstryObjectHelper.toMap(msihCrIn, new HashMap(), "MilestoneInstHstry").get("MilestoneInstHstry"));
    }
  }


/**
 *
 * Sets the MilestoneInstHstry
 * @param msihCrInIn Value of the msihCrIn
 *
 */

  public void setMilestoneInstHstry(MilestoneInstHstryObjectData msihCrInIn) {
    msihCrIn = msihCrInIn;
  }

  public void translateFromMap() {
    msihCrIn = MilestoneInstHstryObjectHelper.fromMap(inputMap, "MilestoneInstHstry");
  }

/**
 *
 * Gets the MilestoneInstHstry
 * @return Value of the MilestoneInstHstry
 *
 */

  public MilestoneInstHstryObjectData getMilestoneInstHstry( ) {
    return msihCrIn;
  }

}
