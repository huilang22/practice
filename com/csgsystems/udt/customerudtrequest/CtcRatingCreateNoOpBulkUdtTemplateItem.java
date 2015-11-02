/*
 * Generated code DO NOT EDIT
 * Generated file: CtcRatingCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcRatingCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcRatingCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcRatingObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcRatingCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcRatingCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcRatingObjectData noOpInIn) {
    super(id, context, "CtcRatingCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcRating", CtcRatingObjectHelper.toMap(noOpIn, new HashMap(), "CtcRating").get("CtcRating"));
    }
  }
/**
 *
 * Sets the  CtcRating
 * @param noOpInIn CtcRatingObjectData to set
 *
 */
  public void setCtcRating(CtcRatingObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcRating passed into the constructor
 * @return Simulated response
 *
 */
  public CtcRatingObjectData getCtcRating() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcRatingObjectHelper.fromMap(inputMap, "CtcRating");
  }
}
