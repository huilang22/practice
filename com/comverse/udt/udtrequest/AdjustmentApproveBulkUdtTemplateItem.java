/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentApproveBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a AdjustmentApproveBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjustmentApproveBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AdjustmentObjectData adjApproveIn;
  protected String SupervisorName;
/**
 *
 * Constructor to create a  AdjustmentApproveBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjustmentApproveBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentObjectData adjApproveInIn, String SupervisorNameIn) {
    super(id, context, "AdjustmentApprove");
    adjApproveIn = adjApproveInIn;
    SupervisorName = SupervisorNameIn;
  }

  public void translateToMap() {
    if (adjApproveIn != null) {
      adjApproveIn.resetFlags(true, true);
      addInput("Adjustment", AdjustmentObjectHelper.toMap(adjApproveIn, new HashMap(), "Adjustment").get("Adjustment"));
    }
    if (SupervisorName != null) {
      addInput("SupervisorName", SupervisorName);
    }
  }


/**
 *
 * Sets the Adjustment
 * @param adjApproveInIn Value of the adjApproveIn
 *
 */

  public void setAdjustment(AdjustmentObjectData adjApproveInIn) {
    adjApproveIn = adjApproveInIn;
  }

/**
 *
 * Sets the SupervisorName
 * @param SupervisorNameIn Value of the SupervisorName
 *
 */

  public void setSupervisorName(String SupervisorNameIn) {
    SupervisorName = SupervisorNameIn;
  }

  public void translateFromMap() {
    adjApproveIn = AdjustmentObjectHelper.fromMap(inputMap, "Adjustment");
    SupervisorName = (String)inputMap.get("SupervisorName");
  }

/**
 *
 * Gets the Adjustment
 * @return Value of the Adjustment
 *
 */

  public AdjustmentObjectData getAdjustment( ) {
    return adjApproveIn;
  }

/**
 *
 * Gets the SupervisorName
 * @return Value of the SupervisorName
 *
 */

  public String getSupervisorName( ) {
    return SupervisorName;
  }

}
