/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskPriorityUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CitTaskPriorityUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CitTaskPriorityUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CitTaskPriorityObjectData noOpIn;

/**
 *
 * Constructor to create a   CitTaskPriorityUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CitTaskPriorityUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CitTaskPriorityObjectData noOpInIn) {
    super(id, context, "CitTaskPriorityUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CitTaskPriority", CitTaskPriorityObjectHelper.toMap(noOpIn, new HashMap(), "CitTaskPriority").get("CitTaskPriority"));
    }
  }
/**
 *
 * Sets the  CitTaskPriority
 * @param noOpInIn CitTaskPriorityObjectData to set
 *
 */
  public void setCitTaskPriority(CitTaskPriorityObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CitTaskPriority passed into the constructor
 * @return Simulated response
 *
 */
  public CitTaskPriorityObjectData getCitTaskPriority() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CitTaskPriorityObjectHelper.fromMap(inputMap, "CitTaskPriority");
  }
}
