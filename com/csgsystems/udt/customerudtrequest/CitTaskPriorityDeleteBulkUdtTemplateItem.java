/*
 * Generated code DO NOT EDIT
 * Generated file: CitTaskPriorityDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.cit.data.*;

/**
 *
 * Class used to create a CitTaskPriorityDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CitTaskPriorityDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitTaskPriorityObjectKeyData citTaskPriorityDeleteIn;
/**
 *
 * Constructor to create a  CitTaskPriorityDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitTaskPriorityDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CitTaskPriorityObjectKeyData citTaskPriorityDeleteInIn) {
    super(id, context, "CitTaskPriorityDelete");
    citTaskPriorityDeleteIn = citTaskPriorityDeleteInIn;
  }

  public void translateToMap() {
    if (citTaskPriorityDeleteIn != null) {
      citTaskPriorityDeleteIn.resetFlags(true, true);
      addInput("CitTaskPriority", CitTaskPriorityObjectKeyHelper.toMap(citTaskPriorityDeleteIn, new HashMap(), "CitTaskPriorityObjectKeyData").get("CitTaskPriorityObjectKeyData"));
    }
  }


/**
 *
 * Sets the CitTaskPriority
 * @param citTaskPriorityDeleteInIn Value of the citTaskPriorityDeleteIn
 *
 */

  public void setCitTaskPriority(CitTaskPriorityObjectKeyData citTaskPriorityDeleteInIn) {
    citTaskPriorityDeleteIn = citTaskPriorityDeleteInIn;
  }

  public void translateFromMap() {
    citTaskPriorityDeleteIn = CitTaskPriorityObjectKeyHelper.fromMap(inputMap, "CitTaskPriority");
  }

/**
 *
 * Gets the CitTaskPriority
 * @return Value of the CitTaskPriority
 *
 */

  public CitTaskPriorityObjectKeyData getCitTaskPriority( ) {
    return citTaskPriorityDeleteIn;
  }

}
