/*
 * Generated code DO NOT EDIT
 * Generated file: CitReasonCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CitReasonCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CitReasonCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CitReasonObjectData noOpIn;

/**
 *
 * Constructor to create a   CitReasonCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CitReasonCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CitReasonObjectData noOpInIn) {
    super(id, context, "CitReasonCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CitReason", CitReasonObjectHelper.toMap(noOpIn, new HashMap(), "CitReason").get("CitReason"));
    }
  }
/**
 *
 * Sets the  CitReason
 * @param noOpInIn CitReasonObjectData to set
 *
 */
  public void setCitReason(CitReasonObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CitReason passed into the constructor
 * @return Simulated response
 *
 */
  public CitReasonObjectData getCitReason() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CitReasonObjectHelper.fromMap(inputMap, "CitReason");
  }
}
