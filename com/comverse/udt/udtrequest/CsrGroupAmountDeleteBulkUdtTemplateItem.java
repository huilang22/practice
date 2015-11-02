/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupAmountDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CsrGroupAmountDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CsrGroupAmountDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CsrGroupAmountObjectKeyData GADeleteIn;
/**
 *
 * Constructor to create a  CsrGroupAmountDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CsrGroupAmountDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CsrGroupAmountObjectKeyData GADeleteInIn) {
    super(id, context, "CsrGroupAmountDelete");
    GADeleteIn = GADeleteInIn;
  }

  public void translateToMap() {
    if (GADeleteIn != null) {
      GADeleteIn.resetFlags(true, true);
      addInput("CsrGroupAmount", CsrGroupAmountObjectKeyHelper.toMap(GADeleteIn, new HashMap(), "CsrGroupAmountObjectKeyData").get("CsrGroupAmountObjectKeyData"));
    }
  }


/**
 *
 * Sets the CsrGroupAmount
 * @param GADeleteInIn Value of the GADeleteIn
 *
 */

  public void setCsrGroupAmount(CsrGroupAmountObjectKeyData GADeleteInIn) {
    GADeleteIn = GADeleteInIn;
  }

  public void translateFromMap() {
    GADeleteIn = CsrGroupAmountObjectKeyHelper.fromMap(inputMap, "CsrGroupAmount");
  }

/**
 *
 * Gets the CsrGroupAmount
 * @return Value of the CsrGroupAmount
 *
 */

  public CsrGroupAmountObjectKeyData getCsrGroupAmount( ) {
    return GADeleteIn;
  }

}
