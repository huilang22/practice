/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskPriorityUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.cit.data.*;

/**
 *
 * Class used to create a CitTaskPriorityUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CitTaskPriorityUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitTaskPriorityObjectData citTaskPriorityUpdateIn;
/**
 *
 * Constructor to create a  CitTaskPriorityUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitTaskPriorityUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CitTaskPriorityObjectData citTaskPriorityUpdateInIn) {
    super(id, context, "CitTaskPriorityUpdate");
    citTaskPriorityUpdateIn = citTaskPriorityUpdateInIn;
  }

  public void translateToMap() {
    if (citTaskPriorityUpdateIn != null) {
      citTaskPriorityUpdateIn.resetFlags(true, true);
      addInput("CitTaskPriority", CitTaskPriorityObjectHelper.toMap(citTaskPriorityUpdateIn, new HashMap(), "CitTaskPriority").get("CitTaskPriority"));
    }
  }


/**
 *
 * Sets the CitTaskPriority
 * @param citTaskPriorityUpdateInIn Value of the citTaskPriorityUpdateIn
 *
 */

  public void setCitTaskPriority(CitTaskPriorityObjectData citTaskPriorityUpdateInIn) {
    citTaskPriorityUpdateIn = citTaskPriorityUpdateInIn;
  }

  public void translateFromMap() {
    citTaskPriorityUpdateIn = CitTaskPriorityObjectHelper.fromMap(inputMap, "CitTaskPriority");
  }

/**
 *
 * Gets the CitTaskPriority
 * @return Value of the CitTaskPriority
 *
 */

  public CitTaskPriorityObjectData getCitTaskPriority( ) {
    return citTaskPriorityUpdateIn;
  }

}
