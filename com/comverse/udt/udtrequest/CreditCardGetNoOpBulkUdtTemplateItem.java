/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CreditCardGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CreditCardGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CreditCardGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CreditCardObjectData noOpIn;

/**
 *
 * Constructor to create a   CreditCardGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CreditCardGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CreditCardObjectData noOpInIn) {
    super(id, context, "CreditCardGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CreditCard", CreditCardObjectHelper.toMap(noOpIn, new HashMap(), "CreditCard").get("CreditCard"));
    }
  }
/**
 *
 * Sets the  CreditCard
 * @param noOpInIn CreditCardObjectData to set
 *
 */
  public void setCreditCard(CreditCardObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CreditCard passed into the constructor
 * @return Simulated response
 *
 */
  public CreditCardObjectData getCreditCard() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CreditCardObjectHelper.fromMap(inputMap, "CreditCard");
  }
}
