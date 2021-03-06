/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemRatingGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcItemRatingGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcItemRatingGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcItemRatingObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcItemRatingGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcItemRatingGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemRatingObjectData noOpInIn) {
    super(id, context, "CtcItemRatingGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcItemRating", CtcItemRatingObjectHelper.toMap(noOpIn, new HashMap(), "CtcItemRating").get("CtcItemRating"));
    }
  }
/**
 *
 * Sets the  CtcItemRating
 * @param noOpInIn CtcItemRatingObjectData to set
 *
 */
  public void setCtcItemRating(CtcItemRatingObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcItemRating passed into the constructor
 * @return Simulated response
 *
 */
  public CtcItemRatingObjectData getCtcItemRating() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcItemRatingObjectHelper.fromMap(inputMap, "CtcItemRating");
  }
}
