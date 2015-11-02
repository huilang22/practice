/*
 * Generated code DO NOT EDIT
 * Generated file: TaxStatusGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a TaxStatusGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class TaxStatusGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected TSObjectData noOpIn;

/**
 *
 * Constructor to create a   TaxStatusGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public TaxStatusGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, TSObjectData noOpInIn) {
    super(id, context, "TaxStatusGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("TaxStatus", TSObjectHelper.toMap(noOpIn, new HashMap(), "TaxStatus").get("TaxStatus"));
    }
  }
/**
 *
 * Sets the  TaxStatus
 * @param noOpInIn TSObjectData to set
 *
 */
  public void setTaxStatus(TSObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the TaxStatus passed into the constructor
 * @return Simulated response
 *
 */
  public TSObjectData getTaxStatus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = TSObjectHelper.fromMap(inputMap, "TaxStatus");
  }
}
