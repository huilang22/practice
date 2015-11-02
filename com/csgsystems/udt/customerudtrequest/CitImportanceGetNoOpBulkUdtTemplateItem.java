/*
 * Generated code DO NOT EDIT
 * Generated file: CitImportanceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CitImportanceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CitImportanceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CitImportanceObjectData noOpIn;

/**
 *
 * Constructor to create a   CitImportanceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CitImportanceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CitImportanceObjectData noOpInIn) {
    super(id, context, "CitImportanceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CitImportance", CitImportanceObjectHelper.toMap(noOpIn, new HashMap(), "CitImportance").get("CitImportance"));
    }
  }
/**
 *
 * Sets the  CitImportance
 * @param noOpInIn CitImportanceObjectData to set
 *
 */
  public void setCitImportance(CitImportanceObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CitImportance passed into the constructor
 * @return Simulated response
 *
 */
  public CitImportanceObjectData getCitImportance() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CitImportanceObjectHelper.fromMap(inputMap, "CitImportance");
  }
}
