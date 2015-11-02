/*
 * Generated code DO NOT EDIT
 * Generated file: InvdMainHistoryFindBulkUdtTemplateItem.java
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
 * Class used to create a InvdMainHistoryFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdMainHistoryFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdMainHistoryObjectFilter InvdMainHistoryFindIn;
/**
 *
 * Constructor to create a  InvdMainHistoryFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdMainHistoryFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdMainHistoryObjectFilter InvdMainHistoryFindInIn) {
    super(id, context, "InvdMainHistoryFind");
    InvdMainHistoryFindIn = InvdMainHistoryFindInIn;
  }

  public void translateToMap() {
    if (InvdMainHistoryFindIn != null) {
      Integer index =  InvdMainHistoryFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvdMainHistory", InvdMainHistoryObjectHelper.toMap(InvdMainHistoryFindIn, new HashMap(), "InvdMainHistory").get("InvdMainHistory"));
    }
  }


/**
 *
 * Sets the InvdMainHistory
 * @param InvdMainHistoryFindInIn Value of the InvdMainHistoryFindIn
 *
 */

  public void setInvdMainHistory(InvdMainHistoryObjectFilter InvdMainHistoryFindInIn) {
    InvdMainHistoryFindIn = InvdMainHistoryFindInIn;
  }

  public void translateFromMap() {
    InvdMainHistoryFindIn = InvdMainHistoryObjectHelper.fromMapFilter(inputMap, "InvdMainHistory");
  }

/**
 *
 * Gets the InvdMainHistory
 * @return Value of the InvdMainHistory
 *
 */

  public InvdMainHistoryObjectFilter getInvdMainHistory( ) {
    return InvdMainHistoryFindIn;
  }

}
