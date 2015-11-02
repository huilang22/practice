/*
 * Generated code DO NOT EDIT
 * Generated file: CitReasonSequenceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CitReasonSequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CitReasonSequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CitReasonObjectKeyData noOpIn;

/**
 *
 * Constructor to create a   CitReasonSequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CitReasonSequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CitReasonObjectKeyData noOpInIn) {
    super(id, context, "CitReasonSequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CitReason", CitReasonObjectKeyHelper.toMap(noOpIn, new HashMap(), "CitReason").get("CitReason"));
    }
  }
/**
 *
 * Sets the  CitReason
 * @param noOpInIn CitReasonObjectKeyData to set
 *
 */
  public void setCitReason(CitReasonObjectKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CitReason passed into the constructor
 * @return Simulated response
 *
 */
  public CitReasonObjectKeyData getCitReason() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CitReasonObjectKeyHelper.fromMap(inputMap, "CitReason");
  }
}
