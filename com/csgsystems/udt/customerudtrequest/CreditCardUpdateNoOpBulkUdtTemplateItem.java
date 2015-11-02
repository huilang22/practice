/*
 * Generated code DO NOT EDIT
 * Generated file: CreditCardUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CreditCardUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CreditCardUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CreditCardObjectData noOpIn;

/**
 *
 * Constructor to create a   CreditCardUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CreditCardUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CreditCardObjectData noOpInIn) {
    super(id, context, "CreditCardUpdate");
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
