/*
 * Generated code DO NOT EDIT
 * Generated file: CitTaskPriorityCreateBulkUdtTemplateItem.java
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
 * Class used to create a CitTaskPriorityCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CitTaskPriorityCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitTaskPriorityObjectData citTaskPriorityCreateIn;
/**
 *
 * Constructor to create a  CitTaskPriorityCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitTaskPriorityCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CitTaskPriorityObjectData citTaskPriorityCreateInIn) {
    super(id, context, "CitTaskPriorityCreate");
    citTaskPriorityCreateIn = citTaskPriorityCreateInIn;
  }

  public void translateToMap() {
    if (citTaskPriorityCreateIn != null) {
      citTaskPriorityCreateIn.resetFlags(true, true);
      addInput("CitTaskPriority", CitTaskPriorityObjectHelper.toMap(citTaskPriorityCreateIn, new HashMap(), "CitTaskPriority").get("CitTaskPriority"));
    }
  }


/**
 *
 * Sets the CitTaskPriority
 * @param citTaskPriorityCreateInIn Value of the citTaskPriorityCreateIn
 *
 */

  public void setCitTaskPriority(CitTaskPriorityObjectData citTaskPriorityCreateInIn) {
    citTaskPriorityCreateIn = citTaskPriorityCreateInIn;
  }

  public void translateFromMap() {
    citTaskPriorityCreateIn = CitTaskPriorityObjectHelper.fromMap(inputMap, "CitTaskPriority");
  }

/**
 *
 * Gets the CitTaskPriority
 * @return Value of the CitTaskPriority
 *
 */

  public CitTaskPriorityObjectData getCitTaskPriority( ) {
    return citTaskPriorityCreateIn;
  }

}
