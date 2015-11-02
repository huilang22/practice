/*
 * Generated code DO NOT EDIT
 * Generated file: CsrGroupAmountUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CsrGroupAmountUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CsrGroupAmountUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CsrGroupAmountObjectData GAUpdateIn;
/**
 *
 * Constructor to create a  CsrGroupAmountUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CsrGroupAmountUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CsrGroupAmountObjectData GAUpdateInIn) {
    super(id, context, "CsrGroupAmountUpdate");
    GAUpdateIn = GAUpdateInIn;
  }

  public void translateToMap() {
    if (GAUpdateIn != null) {
      GAUpdateIn.resetFlags(true, true);
      addInput("CsrGroupAmount", CsrGroupAmountObjectHelper.toMap(GAUpdateIn, new HashMap(), "CsrGroupAmount").get("CsrGroupAmount"));
    }
  }


/**
 *
 * Sets the CsrGroupAmount
 * @param GAUpdateInIn Value of the GAUpdateIn
 *
 */

  public void setCsrGroupAmount(CsrGroupAmountObjectData GAUpdateInIn) {
    GAUpdateIn = GAUpdateInIn;
  }

  public void translateFromMap() {
    GAUpdateIn = CsrGroupAmountObjectHelper.fromMap(inputMap, "CsrGroupAmount");
  }

/**
 *
 * Gets the CsrGroupAmount
 * @return Value of the CsrGroupAmount
 *
 */

  public CsrGroupAmountObjectData getCsrGroupAmount( ) {
    return GAUpdateIn;
  }

}
