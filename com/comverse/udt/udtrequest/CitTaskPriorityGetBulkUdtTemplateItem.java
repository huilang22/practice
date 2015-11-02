/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskPriorityGetBulkUdtTemplateItem.java
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
 * Class used to create a CitTaskPriorityGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CitTaskPriorityGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitTaskPriorityObjectKeyData citTaskPriorityGetIn;
/**
 *
 * Constructor to create a  CitTaskPriorityGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitTaskPriorityGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CitTaskPriorityObjectKeyData citTaskPriorityGetInIn) {
    super(id, context, "CitTaskPriorityGet");
    citTaskPriorityGetIn = citTaskPriorityGetInIn;
  }

  public void translateToMap() {
    if (citTaskPriorityGetIn != null) {
      citTaskPriorityGetIn.resetFlags(true, true);
      addInput("CitTaskPriority", CitTaskPriorityObjectKeyHelper.toMap(citTaskPriorityGetIn, new HashMap(), "CitTaskPriorityObjectKeyData").get("CitTaskPriorityObjectKeyData"));
    }
  }


/**
 *
 * Sets the CitTaskPriority
 * @param citTaskPriorityGetInIn Value of the citTaskPriorityGetIn
 *
 */

  public void setCitTaskPriority(CitTaskPriorityObjectKeyData citTaskPriorityGetInIn) {
    citTaskPriorityGetIn = citTaskPriorityGetInIn;
  }

  public void translateFromMap() {
    citTaskPriorityGetIn = CitTaskPriorityObjectKeyHelper.fromMap(inputMap, "CitTaskPriority");
  }

/**
 *
 * Gets the CitTaskPriority
 * @return Value of the CitTaskPriority
 *
 */

  public CitTaskPriorityObjectKeyData getCitTaskPriority( ) {
    return citTaskPriorityGetIn;
  }

}
