/*
 * Generated code DO NOT EDIT
 * Generated file: CreditCardUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CreditCardUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CreditCardUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CreditCardObjectData updateIn;
/**
 *
 * Constructor to create a  CreditCardUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CreditCardUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CreditCardObjectData updateInIn) {
    super(id, context, "CreditCardUpdate");
    updateIn = updateInIn;
  }

  public void translateToMap() {
    if (updateIn != null) {
      updateIn.resetFlags(true, true);
      addInput("CreditCard", CreditCardObjectHelper.toMap(updateIn, new HashMap(), "CreditCard").get("CreditCard"));
    }
  }


/**
 *
 * Sets the CreditCard
 * @param updateInIn Value of the updateIn
 *
 */

  public void setCreditCard(CreditCardObjectData updateInIn) {
    updateIn = updateInIn;
  }

  public void translateFromMap() {
    updateIn = CreditCardObjectHelper.fromMap(inputMap, "CreditCard");
  }

/**
 *
 * Gets the CreditCard
 * @return Value of the CreditCard
 *
 */

  public CreditCardObjectData getCreditCard( ) {
    return updateIn;
  }

}
