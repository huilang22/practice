/*
 * Generated code DO NOT EDIT
 * Generated file: CitTaskTypeGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CitTaskTypeGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CitTaskTypeGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CitTaskTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   CitTaskTypeGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CitTaskTypeGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CitTaskTypeObjectData noOpInIn) {
    super(id, context, "CitTaskTypeGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CitTaskType", CitTaskTypeObjectHelper.toMap(noOpIn, new HashMap(), "CitTaskType").get("CitTaskType"));
    }
  }
/**
 *
 * Sets the  CitTaskType
 * @param noOpInIn CitTaskTypeObjectData to set
 *
 */
  public void setCitTaskType(CitTaskTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CitTaskType passed into the constructor
 * @return Simulated response
 *
 */
  public CitTaskTypeObjectData getCitTaskType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CitTaskTypeObjectHelper.fromMap(inputMap, "CitTaskType");
  }
}
