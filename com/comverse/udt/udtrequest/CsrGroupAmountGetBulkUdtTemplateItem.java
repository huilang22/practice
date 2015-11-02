/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupAmountGetBulkUdtTemplateItem.java
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
 * Class used to create a CsrGroupAmountGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CsrGroupAmountGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CsrGroupAmountObjectKeyData GAGetIn;
/**
 *
 * Constructor to create a  CsrGroupAmountGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CsrGroupAmountGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CsrGroupAmountObjectKeyData GAGetInIn) {
    super(id, context, "CsrGroupAmountGet");
    GAGetIn = GAGetInIn;
  }

  public void translateToMap() {
    if (GAGetIn != null) {
      GAGetIn.resetFlags(true, true);
      addInput("CsrGroupAmount", CsrGroupAmountObjectKeyHelper.toMap(GAGetIn, new HashMap(), "CsrGroupAmountObjectKeyData").get("CsrGroupAmountObjectKeyData"));
    }
  }


/**
 *
 * Sets the CsrGroupAmount
 * @param GAGetInIn Value of the GAGetIn
 *
 */

  public void setCsrGroupAmount(CsrGroupAmountObjectKeyData GAGetInIn) {
    GAGetIn = GAGetInIn;
  }

  public void translateFromMap() {
    GAGetIn = CsrGroupAmountObjectKeyHelper.fromMap(inputMap, "CsrGroupAmount");
  }

/**
 *
 * Gets the CsrGroupAmount
 * @return Value of the CsrGroupAmount
 *
 */

  public CsrGroupAmountObjectKeyData getCsrGroupAmount( ) {
    return GAGetIn;
  }

}
