/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobHistoryGetBulkUdtTemplateItem.java
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
 * Class used to create a InvJobHistoryGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvJobHistoryGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvJobHistoryObjectKeyData InvJobHistoryGetIn;
/**
 *
 * Constructor to create a  InvJobHistoryGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvJobHistoryGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvJobHistoryObjectKeyData InvJobHistoryGetInIn) {
    super(id, context, "InvJobHistoryGet");
    InvJobHistoryGetIn = InvJobHistoryGetInIn;
  }

  public void translateToMap() {
    if (InvJobHistoryGetIn != null) {
      InvJobHistoryGetIn.resetFlags(true, true);
      addInput("InvJobHistory", InvJobHistoryObjectKeyHelper.toMap(InvJobHistoryGetIn, new HashMap(), "InvJobHistoryObjectKeyData").get("InvJobHistoryObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvJobHistory
 * @param InvJobHistoryGetInIn Value of the InvJobHistoryGetIn
 *
 */

  public void setInvJobHistory(InvJobHistoryObjectKeyData InvJobHistoryGetInIn) {
    InvJobHistoryGetIn = InvJobHistoryGetInIn;
  }

  public void translateFromMap() {
    InvJobHistoryGetIn = InvJobHistoryObjectKeyHelper.fromMap(inputMap, "InvJobHistory");
  }

/**
 *
 * Gets the InvJobHistory
 * @return Value of the InvJobHistory
 *
 */

  public InvJobHistoryObjectKeyData getInvJobHistory( ) {
    return InvJobHistoryGetIn;
  }

}
