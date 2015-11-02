/*
 * Generated code DO NOT EDIT
 * Generated file: CreditCardGetBulkUdtTemplateItem.java
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
 * Class used to create a CreditCardGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CreditCardGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CreditCardObjectKeyData getIn;
/**
 *
 * Constructor to create a  CreditCardGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CreditCardGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CreditCardObjectKeyData getInIn) {
    super(id, context, "CreditCardGet");
    getIn = getInIn;
  }

  public void translateToMap() {
    if (getIn != null) {
      getIn.resetFlags(true, true);
      addInput("CreditCard", CreditCardObjectKeyHelper.toMap(getIn, new HashMap(), "CreditCardObjectKeyData").get("CreditCardObjectKeyData"));
    }
  }


/**
 *
 * Sets the CreditCard
 * @param getInIn Value of the getIn
 *
 */

  public void setCreditCard(CreditCardObjectKeyData getInIn) {
    getIn = getInIn;
  }

  public void translateFromMap() {
    getIn = CreditCardObjectKeyHelper.fromMap(inputMap, "CreditCard");
  }

/**
 *
 * Gets the CreditCard
 * @return Value of the CreditCard
 *
 */

  public CreditCardObjectKeyData getCreditCard( ) {
    return getIn;
  }

}
