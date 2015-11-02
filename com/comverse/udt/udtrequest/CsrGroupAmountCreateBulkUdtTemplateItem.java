/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupAmountCreateBulkUdtTemplateItem.java
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
 * Class used to create a CsrGroupAmountCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CsrGroupAmountCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CsrGroupAmountObjectData GACreateIn;
/**
 *
 * Constructor to create a  CsrGroupAmountCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CsrGroupAmountCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CsrGroupAmountObjectData GACreateInIn) {
    super(id, context, "CsrGroupAmountCreate");
    GACreateIn = GACreateInIn;
  }

  public void translateToMap() {
    if (GACreateIn != null) {
      GACreateIn.resetFlags(true, true);
      addInput("CsrGroupAmount", CsrGroupAmountObjectHelper.toMap(GACreateIn, new HashMap(), "CsrGroupAmount").get("CsrGroupAmount"));
    }
  }


/**
 *
 * Sets the CsrGroupAmount
 * @param GACreateInIn Value of the GACreateIn
 *
 */

  public void setCsrGroupAmount(CsrGroupAmountObjectData GACreateInIn) {
    GACreateIn = GACreateInIn;
  }

  public void translateFromMap() {
    GACreateIn = CsrGroupAmountObjectHelper.fromMap(inputMap, "CsrGroupAmount");
  }

/**
 *
 * Gets the CsrGroupAmount
 * @return Value of the CsrGroupAmount
 *
 */

  public CsrGroupAmountObjectData getCsrGroupAmount( ) {
    return GACreateIn;
  }

}
