/*
 * Generated code DO NOT EDIT
 * Generated file: CreditCardValidateBulkUdtTemplateItem.java
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
 * Class used to create a CreditCardValidateBulkUdtTemplateItem Bulk Template
 *
 */

public class CreditCardValidateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CreditCardObjectData validateIn;
/**
 *
 * Constructor to create a  CreditCardValidateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CreditCardValidateBulkUdtTemplateItem(String id, BSDMSessionContext context, CreditCardObjectData validateInIn) {
    super(id, context, "CreditCardValidate");
    validateIn = validateInIn;
  }

  public void translateToMap() {
    if (validateIn != null) {
      validateIn.resetFlags(true, true);
      addInput("CreditCard", CreditCardObjectHelper.toMap(validateIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the CreditCard
 * @param validateInIn Value of the validateIn
 *
 */

  public void setCreditCard(CreditCardObjectData validateInIn) {
    validateIn = validateInIn;
  }

  public void translateFromMap() {
    validateIn = CreditCardObjectHelper.fromMap(inputMap, "CreditCard");
  }

/**
 *
 * Gets the CreditCard
 * @return Value of the CreditCard
 *
 */

  public CreditCardObjectData getCreditCard( ) {
    return validateIn;
  }

}
