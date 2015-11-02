/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountRestrictionUpdateNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a DiscountRestrictionUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DiscountRestrictionUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DRObjectData noOpIn;

/**
 *
 * Constructor to create a   DiscountRestrictionUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DiscountRestrictionUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DRObjectData noOpInIn) {
    super(id, context, "DiscountRestrictionUpdate");
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
