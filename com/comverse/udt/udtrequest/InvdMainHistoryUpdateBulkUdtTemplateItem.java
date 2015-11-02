/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainHistoryUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvdMainHistoryUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdMainHistoryUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdMainHistoryObjectData InvdMainHistoryUpdateIn;
/**
 *
 * Constructor to create a  InvdMainHistoryUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdMainHistoryUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdMainHistoryObjectData InvdMainHistoryUpdateInIn) {
    super(id, context, "InvdMainHistoryUpdate");
    InvdMainHistoryUpdateIn = InvdMainHistoryUpdateInIn;
  }

  public void translateToMap() {
    if (InvdMainHistoryUpdateIn != null) {
      InvdMainHistoryUpdateIn.resetFlags(true, true);
      addInput("InvdMainHistory", InvdMainHistoryObjectHelper.toMap(InvdMainHistoryUpdateIn, new HashMap(), "InvdMainHistory").get("InvdMainHistory"));
    }
  }


/**
 *
 * Sets the InvdMainHistory
 * @param InvdMainHistoryUpdateInIn Value of the InvdMainHistoryUpdateIn
 *
 */

  public void setInvdMainHistory(InvdMainHistoryObjectData InvdMainHistoryUpdateInIn) {
    InvdMainHistoryUpdateIn = InvdMainHistoryUpdateInIn;
  }

  public void translateFromMap() {
    InvdMainHistoryUpdateIn = InvdMainHistoryObjectHelper.fromMap(inputMap, "InvdMainHistory");
  }

/**
 *
 * Gets the InvdMainHistory
 * @return Value of the InvdMainHistory
 *
 */

  public InvdMainHistoryObjectData getInvdMainHistory( ) {
    return InvdMainHistoryUpdateIn;
  }

}
