/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTaxGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a AdjustmentTaxGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AdjustmentTaxGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AdjustmentTaxObjectData noOpIn;

/**
 *
 * Constructor to create a   AdjustmentTaxGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AdjustmentTaxGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentTaxObjectData noOpInIn) {
    super(id, context, "AdjustmentTaxGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AdjustmentTax", AdjustmentTaxObjectHelper.toMap(noOpIn, new HashMap(), "AdjustmentTax").get("AdjustmentTax"));
    }
  }
/**
 *
 * Sets the  AdjustmentTax
 * @param noOpInIn AdjustmentTaxObjectData to set
 *
 */
  public void setAdjustmentTax(AdjustmentTaxObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AdjustmentTax passed into the constructor
 * @return Simulated response
 *
 */
  public AdjustmentTaxObjectData getAdjustmentTax() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AdjustmentTaxObjectHelper.fromMap(inputMap, "AdjustmentTax");
  }
}
