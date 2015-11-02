/*
 * Generated code DO NOT EDIT
 * Generated file: InvPlaceholderFindBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a InvPlaceholderFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvPlaceholderFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvPlaceholderObjectFilter findIn;
/**
 *
 * Constructor to create a  InvPlaceholderFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvPlaceholderFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvPlaceholderObjectFilter findInIn) {
    super(id, context, "InvPlaceholderFind");
    findIn = findInIn;
  }

  public void translateToMap() {
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvPlaceholder", InvPlaceholderObjectHelper.toMap(findIn, new HashMap(), "InvPlaceholder").get("InvPlaceholder"));
    }
  }


/**
 *
 * Sets the InvPlaceholder
 * @param findInIn Value of the findIn
 *
 */

  public void setInvPlaceholder(InvPlaceholderObjectFilter findInIn) {
    findIn = findInIn;
  }

  public void translateFromMap() {
    findIn = InvPlaceholderObjectHelper.fromMapFilter(inputMap, "InvPlaceholder");
  }

/**
 *
 * Gets the InvPlaceholder
 * @return Value of the InvPlaceholder
 *
 */

  public InvPlaceholderObjectFilter getInvPlaceholder( ) {
    return findIn;
  }

}
