/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageCalcNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BilledUsageCalcNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BilledUsageCalcNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected TaxAndDiscountAmountObjectData noOpIn;

/**
 *
 * Constructor to create a   BilledUsageCalcNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BilledUsageCalcNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, TaxAndDiscountAmountObjectData noOpInIn) {
    super(id, context, "BilledUsageCalc");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("TaxAndDiscountSummary", TaxAndDiscountAmountObjectHelper.toMap(noOpIn, new HashMap(), "TaxAndDiscountSummary").get("TaxAndDiscountSummary"));
    }
  }
/**
 *
 * Sets the  TaxAndDiscountSummary
 * @param noOpInIn TaxAndDiscountAmountObjectData to set
 *
 */
  public void setTaxAndDiscountSummary(TaxAndDiscountAmountObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the TaxAndDiscountSummary passed into the constructor
 * @return Simulated response
 *
 */
  public TaxAndDiscountAmountObjectData getTaxAndDiscountSummary() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = TaxAndDiscountAmountObjectHelper.fromMap(inputMap, "TaxAndDiscountSummary");
  }
}
