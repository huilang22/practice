/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemRatingReasonCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcItemRatingReasonCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcItemRatingReasonCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcItemRatingReasonObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcItemRatingReasonCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcItemRatingReasonCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemRatingReasonObjectData noOpInIn) {
    super(id, context, "CtcItemRatingReasonCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcItemRatingReason", CtcItemRatingReasonObjectHelper.toMap(noOpIn, new HashMap(), "CtcItemRatingReason").get("CtcItemRatingReason"));
    }
  }
/**
 *
 * Sets the  CtcItemRatingReason
 * @param noOpInIn CtcItemRatingReasonObjectData to set
 *
 */
  public void setCtcItemRatingReason(CtcItemRatingReasonObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcItemRatingReason passed into the constructor
 * @return Simulated response
 *
 */
  public CtcItemRatingReasonObjectData getCtcItemRatingReason() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcItemRatingReasonObjectHelper.fromMap(inputMap, "CtcItemRatingReason");
  }
}
