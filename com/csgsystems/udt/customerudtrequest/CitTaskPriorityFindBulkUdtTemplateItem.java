/*
 * Generated code DO NOT EDIT
 * Generated file: CitTaskPriorityFindBulkUdtTemplateItem.java
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
 * Class used to create a CitTaskPriorityFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CitTaskPriorityFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitTaskPriorityObjectFilter citTaskPriorityFindIn;
/**
 *
 * Constructor to create a  CitTaskPriorityFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitTaskPriorityFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CitTaskPriorityObjectFilter citTaskPriorityFindInIn) {
    super(id, context, "CitTaskPriorityFind");
    citTaskPriorityFindIn = citTaskPriorityFindInIn;
  }

  public void translateToMap() {
    if (citTaskPriorityFindIn != null) {
      Integer index =  citTaskPriorityFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CitTaskPriority", CitTaskPriorityObjectHelper.toMap(citTaskPriorityFindIn, new HashMap(), "CitTaskPriority").get("CitTaskPriority"));
    }
  }


/**
 *
 * Sets the CitTaskPriority
 * @param citTaskPriorityFindInIn Value of the citTaskPriorityFindIn
 *
 */

  public void setCitTaskPriority(CitTaskPriorityObjectFilter citTaskPriorityFindInIn) {
    citTaskPriorityFindIn = citTaskPriorityFindInIn;
  }

  public void translateFromMap() {
    citTaskPriorityFindIn = CitTaskPriorityObjectHelper.fromMapFilter(inputMap, "CitTaskPriority");
  }

/**
 *
 * Gets the CitTaskPriority
 * @return Value of the CitTaskPriority
 *
 */

  public CitTaskPriorityObjectFilter getCitTaskPriority( ) {
    return citTaskPriorityFindIn;
  }

}
