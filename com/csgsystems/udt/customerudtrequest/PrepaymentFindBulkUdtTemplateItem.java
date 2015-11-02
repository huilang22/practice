/*
 * Generated code DO NOT EDIT
 * Generated file: PrepaymentFindBulkUdtTemplateItem.java
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
 * Class used to create a PrepaymentFindBulkUdtTemplateItem Bulk Template
 *
 */

public class PrepaymentFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PrepaymentObjectFilter findIn;
/**
 *
 * Constructor to create a  PrepaymentFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PrepaymentFindBulkUdtTemplateItem(String id, BSDMSessionContext context, PrepaymentObjectFilter findInIn) {
    super(id, context, "PrepaymentFind");
    findIn = findInIn;
  }

  public void translateToMap() {
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Prepayment", PrepaymentObjectHelper.toMap(findIn, new HashMap(), "Prepayment").get("Prepayment"));
    }
  }


/**
 *
 * Sets the Prepayment
 * @param findInIn Value of the findIn
 *
 */

  public void setPrepayment(PrepaymentObjectFilter findInIn) {
    findIn = findInIn;
  }

  public void translateFromMap() {
    findIn = PrepaymentObjectHelper.fromMapFilter(inputMap, "Prepayment");
  }

/**
 *
 * Gets the Prepayment
 * @return Value of the Prepayment
 *
 */

  public PrepaymentObjectFilter getPrepayment( ) {
    return findIn;
  }

}
