/*
 * Generated code DO NOT EDIT
 * Generated file: CitTaskPriorityCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CitTaskPriorityCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CitTaskPriorityCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CitTaskPriorityObjectData noOpIn;

/**
 *
 * Constructor to create a   CitTaskPriorityCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CitTaskPriorityCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CitTaskPriorityObjectData noOpInIn) {
    super(id, context, "CitTaskPriorityCreate");
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
