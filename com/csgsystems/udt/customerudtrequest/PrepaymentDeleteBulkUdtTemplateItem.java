/*
 * Generated code DO NOT EDIT
 * Generated file: PrepaymentDeleteBulkUdtTemplateItem.java
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
 * Class used to create a PrepaymentDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class PrepaymentDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PrepaymentObjectKeyData prepaymentDeleteIn;
/**
 *
 * Constructor to create a  PrepaymentDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PrepaymentDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, PrepaymentObjectKeyData prepaymentDeleteInIn) {
    super(id, context, "PrepaymentDelete");
    prepaymentDeleteIn = prepaymentDeleteInIn;
  }

  public void translateToMap() {
    if (prepaymentDeleteIn != null) {
      prepaymentDeleteIn.resetFlags(true, true);
      addInput("Prepayment", PrepaymentObjectKeyHelper.toMap(prepaymentDeleteIn, new HashMap(), "PrepaymentObjectKeyData").get("PrepaymentObjectKeyData"));
    }
  }


/**
 *
 * Sets the Prepayment
 * @param prepaymentDeleteInIn Value of the prepaymentDeleteIn
 *
 */

  public void setPrepayment(PrepaymentObjectKeyData prepaymentDeleteInIn) {
    prepaymentDeleteIn = prepaymentDeleteInIn;
  }

  public void translateFromMap() {
    prepaymentDeleteIn = PrepaymentObjectKeyHelper.fromMap(inputMap, "Prepayment");
  }

/**
 *
 * Gets the Prepayment
 * @return Value of the Prepayment
 *
 */

  public PrepaymentObjectKeyData getPrepayment( ) {
    return prepaymentDeleteIn;
  }

}
