/*
 * Generated code DO NOT EDIT
 * Generated file: CitTaskTypeSequenceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CitTaskTypeSequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CitTaskTypeSequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CitTaskTypeObjectKeyData noOpIn;

/**
 *
 * Constructor to create a   CitTaskTypeSequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CitTaskTypeSequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CitTaskTypeObjectKeyData noOpInIn) {
    super(id, context, "CitTaskTypeSequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CitTaskType", CitTaskTypeObjectKeyHelper.toMap(noOpIn, new HashMap(), "CitTaskType").get("CitTaskType"));
    }
  }
/**
 *
 * Sets the  CitTaskType
 * @param noOpInIn CitTaskTypeObjectKeyData to set
 *
 */
  public void setCitTaskType(CitTaskTypeObjectKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CitTaskType passed into the constructor
 * @return Simulated response
 *
 */
  public CitTaskTypeObjectKeyData getCitTaskType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CitTaskTypeObjectKeyHelper.fromMap(inputMap, "CitTaskType");
  }
}
