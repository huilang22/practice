/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupAmountGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CsrGroupAmountGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CsrGroupAmountGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CsrGroupAmountObjectData noOpIn;

/**
 *
 * Constructor to create a   CsrGroupAmountGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CsrGroupAmountGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CsrGroupAmountObjectData noOpInIn) {
    super(id, context, "CsrGroupAmountGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CsrGroupAmount", CsrGroupAmountObjectHelper.toMap(noOpIn, new HashMap(), "CsrGroupAmount").get("CsrGroupAmount"));
    }
  }
/**
 *
 * Sets the  CsrGroupAmount
 * @param noOpInIn CsrGroupAmountObjectData to set
 *
 */
  public void setCsrGroupAmount(CsrGroupAmountObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CsrGroupAmount passed into the constructor
 * @return Simulated response
 *
 */
  public CsrGroupAmountObjectData getCsrGroupAmount() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CsrGroupAmountObjectHelper.fromMap(inputMap, "CsrGroupAmount");
  }
}
