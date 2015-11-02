/*
 * Generated code DO NOT EDIT
 * Generated file: CitTaskUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CitTaskUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CitTaskUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CitTaskObjectBaseData noOpIn;

/**
 *
 * Constructor to create a   CitTaskUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CitTaskUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CitTaskObjectBaseData noOpInIn) {
    super(id, context, "CitTaskUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CitTask", CitTaskObjectBaseHelper.toMap(noOpIn, new HashMap(), "CitTask").get("CitTask"));
    }
  }
/**
 *
 * Sets the  CitTask
 * @param noOpInIn CitTaskObjectBaseData to set
 *
 */
  public void setCitTask(CitTaskObjectBaseData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CitTask passed into the constructor
 * @return Simulated response
 *
 */
  public CitTaskObjectBaseData getCitTask() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CitTaskObjectBaseHelper.fromMap(inputMap, "CitTask");
  }
}
