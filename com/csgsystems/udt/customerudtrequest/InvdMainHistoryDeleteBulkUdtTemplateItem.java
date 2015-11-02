/*
 * Generated code DO NOT EDIT
 * Generated file: InvdMainHistoryDeleteBulkUdtTemplateItem.java
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
 * Class used to create a InvdMainHistoryDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdMainHistoryDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdMainHistoryObjectKeyData InvdMainHistoryDeleteIn;
/**
 *
 * Constructor to create a  InvdMainHistoryDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdMainHistoryDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdMainHistoryObjectKeyData InvdMainHistoryDeleteInIn) {
    super(id, context, "InvdMainHistoryDelete");
    InvdMainHistoryDeleteIn = InvdMainHistoryDeleteInIn;
  }

  public void translateToMap() {
    if (InvdMainHistoryDeleteIn != null) {
      InvdMainHistoryDeleteIn.resetFlags(true, true);
      addInput("InvdMainHistory", InvdMainHistoryObjectKeyHelper.toMap(InvdMainHistoryDeleteIn, new HashMap(), "InvdMainHistoryObjectKeyData").get("InvdMainHistoryObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvdMainHistory
 * @param InvdMainHistoryDeleteInIn Value of the InvdMainHistoryDeleteIn
 *
 */

  public void setInvdMainHistory(InvdMainHistoryObjectKeyData InvdMainHistoryDeleteInIn) {
    InvdMainHistoryDeleteIn = InvdMainHistoryDeleteInIn;
  }

  public void translateFromMap() {
    InvdMainHistoryDeleteIn = InvdMainHistoryObjectKeyHelper.fromMap(inputMap, "InvdMainHistory");
  }

/**
 *
 * Gets the InvdMainHistory
 * @return Value of the InvdMainHistory
 *
 */

  public InvdMainHistoryObjectKeyData getInvdMainHistory( ) {
    return InvdMainHistoryDeleteIn;
  }

}
