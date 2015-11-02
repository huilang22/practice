/*
 * Generated code DO NOT EDIT
 * Generated file: InvJobHistoryDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvJobHistoryDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class InvJobHistoryDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvJobHistoryObjectFilter InvJobHistoryIn;
/**
 *
 * Constructor to create a  InvJobHistoryDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvJobHistoryDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, InvJobHistoryObjectFilter InvJobHistoryInIn) {
    super(id, context, "InvJobHistoryDelete");
    InvJobHistoryIn = InvJobHistoryInIn;
  }

  public void translateToMap() {
    if (InvJobHistoryIn != null) {
      Integer index =  InvJobHistoryIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvJobHistory", InvJobHistoryObjectHelper.toMap(InvJobHistoryIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the InvJobHistory
 * @param InvJobHistoryInIn Value of the InvJobHistoryIn
 *
 */

  public void setInvJobHistory(InvJobHistoryObjectFilter InvJobHistoryInIn) {
    InvJobHistoryIn = InvJobHistoryInIn;
  }

  public void translateFromMap() {
    InvJobHistoryIn = InvJobHistoryObjectHelper.fromMapFilter(inputMap, "InvJobHistory");
  }

/**
 *
 * Gets the InvJobHistory
 * @return Value of the InvJobHistory
 *
 */

  public InvJobHistoryObjectFilter getInvJobHistory( ) {
    return InvJobHistoryIn;
  }

}
