/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxExemptionCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a TaxExemptionCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class TaxExemptionCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected TaxExemptionObjectData noOpIn;

/**
 *
 * Constructor to create a   TaxExemptionCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public TaxExemptionCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, TaxExemptionObjectData noOpInIn) {
    super(id, context, "TaxExemptionCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("TaxExemption", TaxExemptionObjectHelper.toMap(noOpIn, new HashMap(), "TaxExemption").get("TaxExemption"));
    }
  }
/**
 *
 * Sets the  TaxExemption
 * @param noOpInIn TaxExemptionObjectData to set
 *
 */
  public void setTaxExemption(TaxExemptionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the TaxExemption passed into the constructor
 * @return Simulated response
 *
 */
  public TaxExemptionObjectData getTaxExemption() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = TaxExemptionObjectHelper.fromMap(inputMap, "TaxExemption");
  }
}
