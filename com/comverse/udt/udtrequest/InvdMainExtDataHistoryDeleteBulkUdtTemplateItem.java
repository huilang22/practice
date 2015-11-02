/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainExtDataHistoryDeleteBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a InvdMainExtDataHistoryDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdMainExtDataHistoryDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdMainExtDataHistoryObjectKeyData InvdMainExtDataHistoryDeleteIn;
/**
 *
 * Constructor to create a  InvdMainExtDataHistoryDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdMainExtDataHistoryDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdMainExtDataHistoryObjectKeyData InvdMainExtDataHistoryDeleteInIn) {
    super(id, context, "InvdMainExtDataHistoryDelete");
    InvdMainExtDataHistoryDeleteIn = InvdMainExtDataHistoryDeleteInIn;
  }

  public void translateToMap() {
    if (InvdMainExtDataHistoryDeleteIn != null) {
      InvdMainExtDataHistoryDeleteIn.resetFlags(true, true);
      addInput("InvdMainExtDataHistory", InvdMainExtDataHistoryObjectKeyHelper.toMap(InvdMainExtDataHistoryDeleteIn, new HashMap(), "InvdMainExtDataHistoryObjectKeyData").get("InvdMainExtDataHistoryObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvdMainExtDataHistory
 * @param InvdMainExtDataHistoryDeleteInIn Value of the InvdMainExtDataHistoryDeleteIn
 *
 */

  public void setInvdMainExtDataHistory(InvdMainExtDataHistoryObjectKeyData InvdMainExtDataHistoryDeleteInIn) {
    InvdMainExtDataHistoryDeleteIn = InvdMainExtDataHistoryDeleteInIn;
  }

  public void translateFromMap() {
    InvdMainExtDataHistoryDeleteIn = InvdMainExtDataHistoryObjectKeyHelper.fromMap(inputMap, "InvdMainExtDataHistory");
  }

/**
 *
 * Gets the InvdMainExtDataHistory
 * @return Value of the InvdMainExtDataHistory
 *
 */

  public InvdMainExtDataHistoryObjectKeyData getInvdMainExtDataHistory( ) {
    return InvdMainExtDataHistoryDeleteIn;
  }

}
