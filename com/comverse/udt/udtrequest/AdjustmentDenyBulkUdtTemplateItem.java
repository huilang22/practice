/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentDenyBulkUdtTemplateItem.java
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
 * Class used to create a AdjustmentDenyBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjustmentDenyBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AdjustmentObjectData adjDenyIn;
  protected String supervisor_name;
/**
 *
 * Constructor to create a  AdjustmentDenyBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjustmentDenyBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentObjectData adjDenyInIn, String supervisor_nameIn) {
    super(id, context, "AdjustmentDeny");
    adjDenyIn = adjDenyInIn;
    supervisor_name = supervisor_nameIn;
  }

  public void translateToMap() {
    if (adjDenyIn != null) {
      adjDenyIn.resetFlags(true, true);
      addInput("Adjustment", AdjustmentObjectHelper.toMap(adjDenyIn, new HashMap(), "Adjustment").get("Adjustment"));
    }
    if (supervisor_name != null) {
      addInput("SupervisorName", supervisor_name);
    }
  }


/**
 *
 * Sets the Adjustment
 * @param adjDenyInIn Value of the adjDenyIn
 *
 */

  public void setAdjustment(AdjustmentObjectData adjDenyInIn) {
    adjDenyIn = adjDenyInIn;
  }

/**
 *
 * Sets the SupervisorName
 * @param supervisor_nameIn Value of the supervisor_name
 *
 */

  public void setSupervisorName(String supervisor_nameIn) {
    supervisor_name = supervisor_nameIn;
  }

  public void translateFromMap() {
    adjDenyIn = AdjustmentObjectHelper.fromMap(inputMap, "Adjustment");
    supervisor_name = (String)inputMap.get("SupervisorName");
  }

/**
 *
 * Gets the Adjustment
 * @return Value of the Adjustment
 *
 */

  public AdjustmentObjectData getAdjustment( ) {
    return adjDenyIn;
  }

/**
 *
 * Gets the SupervisorName
 * @return Value of the SupervisorName
 *
 */

  public String getSupervisorName( ) {
    return supervisor_name;
  }

}
