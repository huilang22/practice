/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxAbandonedGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a TaxAbandonedGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class TaxAbandonedGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected TaxAbandonedObjectData noOpIn;

/**
 *
 * Constructor to create a   TaxAbandonedGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public TaxAbandonedGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, TaxAbandonedObjectData noOpInIn) {
    super(id, context, "TaxAbandonedGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("TaxAbandoned", TaxAbandonedObjectHelper.toMap(noOpIn, new HashMap(), "TaxAbandoned").get("TaxAbandoned"));
    }
  }
/**
 *
 * Sets the  TaxAbandoned
 * @param noOpInIn TaxAbandonedObjectData to set
 *
 */
  public void setTaxAbandoned(TaxAbandonedObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the TaxAbandoned passed into the constructor
 * @return Simulated response
 *
 */
  public TaxAbandonedObjectData getTaxAbandoned() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = TaxAbandonedObjectHelper.fromMap(inputMap, "TaxAbandoned");
  }
}
