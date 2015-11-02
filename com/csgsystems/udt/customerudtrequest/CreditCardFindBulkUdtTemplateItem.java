/*
 * Generated code DO NOT EDIT
 * Generated file: CreditCardFindBulkUdtTemplateItem.java
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
 * Class used to create a CreditCardFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CreditCardFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CreditCardObjectFilter findIn;
/**
 *
 * Constructor to create a  CreditCardFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CreditCardFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CreditCardObjectFilter findInIn) {
    super(id, context, "CreditCardFind");
    findIn = findInIn;
  }

  public void translateToMap() {
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CreditCard", CreditCardObjectHelper.toMap(findIn, new HashMap(), "CreditCard").get("CreditCard"));
    }
  }


/**
 *
 * Sets the CreditCard
 * @param findInIn Value of the findIn
 *
 */

  public void setCreditCard(CreditCardObjectFilter findInIn) {
    findIn = findInIn;
  }

  public void translateFromMap() {
    findIn = CreditCardObjectHelper.fromMapFilter(inputMap, "CreditCard");
  }

/**
 *
 * Gets the CreditCard
 * @return Value of the CreditCard
 *
 */

  public CreditCardObjectFilter getCreditCard( ) {
    return findIn;
  }

}
