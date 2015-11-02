/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountRestrictionGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a DiscountRestrictionGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DiscountRestrictionGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DRObjectData noOpIn;

/**
 *
 * Constructor to create a   DiscountRestrictionGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DiscountRestrictionGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DRObjectData noOpInIn) {
    super(id, context, "DiscountRestrictionGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("DiscountRestriction", DRObjectHelper.toMap(noOpIn, new HashMap(), "DiscountRestriction").get("DiscountRestriction"));
    }
  }
/**
 *
 * Sets the  DiscountRestriction
 * @param noOpInIn DRObjectData to set
 *
 */
  public void setDiscountRestriction(DRObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the DiscountRestriction passed into the constructor
 * @return Simulated response
 *
 */
  public DRObjectData getDiscountRestriction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DRObjectHelper.fromMap(inputMap, "DiscountRestriction");
  }
}
