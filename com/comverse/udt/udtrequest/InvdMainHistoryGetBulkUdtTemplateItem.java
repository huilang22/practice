/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainHistoryGetBulkUdtTemplateItem.java
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
 * Class used to create a InvdMainHistoryGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdMainHistoryGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdMainHistoryObjectKeyData InvdMainHistoryGetIn;
/**
 *
 * Constructor to create a  InvdMainHistoryGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdMainHistoryGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdMainHistoryObjectKeyData InvdMainHistoryGetInIn) {
    super(id, context, "InvdMainHistoryGet");
    InvdMainHistoryGetIn = InvdMainHistoryGetInIn;
  }

  public void translateToMap() {
    if (InvdMainHistoryGetIn != null) {
      InvdMainHistoryGetIn.resetFlags(true, true);
      addInput("InvdMainHistory", InvdMainHistoryObjectKeyHelper.toMap(InvdMainHistoryGetIn, new HashMap(), "InvdMainHistoryObjectKeyData").get("InvdMainHistoryObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvdMainHistory
 * @param InvdMainHistoryGetInIn Value of the InvdMainHistoryGetIn
 *
 */

  public void setInvdMainHistory(InvdMainHistoryObjectKeyData InvdMainHistoryGetInIn) {
    InvdMainHistoryGetIn = InvdMainHistoryGetInIn;
  }

  public void translateFromMap() {
    InvdMainHistoryGetIn = InvdMainHistoryObjectKeyHelper.fromMap(inputMap, "InvdMainHistory");
  }

/**
 *
 * Gets the InvdMainHistory
 * @return Value of the InvdMainHistory
 *
 */

  public InvdMainHistoryObjectKeyData getInvdMainHistory( ) {
    return InvdMainHistoryGetIn;
  }

}
