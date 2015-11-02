/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferCategoryUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcOfferCategoryUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcOfferCategoryUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcOfferCategoryObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcOfferCategoryUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcOfferCategoryUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferCategoryObjectData noOpInIn) {
    super(id, context, "CtcOfferCategoryUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcOfferCategory", CtcOfferCategoryObjectHelper.toMap(noOpIn, new HashMap(), "CtcOfferCategory").get("CtcOfferCategory"));
    }
  }
/**
 *
 * Sets the  CtcOfferCategory
 * @param noOpInIn CtcOfferCategoryObjectData to set
 *
 */
  public void setCtcOfferCategory(CtcOfferCategoryObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcOfferCategory passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferCategoryObjectData getCtcOfferCategory() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcOfferCategoryObjectHelper.fromMap(inputMap, "CtcOfferCategory");
  }
}
