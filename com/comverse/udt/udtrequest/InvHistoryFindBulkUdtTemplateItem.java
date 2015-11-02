/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvHistoryFindBulkUdtTemplateItem.java
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
 * Class used to create a InvHistoryFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvHistoryFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvHistoryObjectFilter InvHistoryFindIn;
/**
 *
 * Constructor to create a  InvHistoryFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvHistoryFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvHistoryObjectFilter InvHistoryFindInIn) {
    super(id, context, "InvHistoryFind");
    InvHistoryFindIn = InvHistoryFindInIn;
  }

  public void translateToMap() {
    if (InvHistoryFindIn != null) {
      Integer index =  InvHistoryFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvHistory", InvHistoryObjectHelper.toMap(InvHistoryFindIn, new HashMap(), "InvHistory").get("InvHistory"));
    }
  }


/**
 *
 * Sets the InvHistory
 * @param InvHistoryFindInIn Value of the InvHistoryFindIn
 *
 */

  public void setInvHistory(InvHistoryObjectFilter InvHistoryFindInIn) {
    InvHistoryFindIn = InvHistoryFindInIn;
  }

  public void translateFromMap() {
    InvHistoryFindIn = InvHistoryObjectHelper.fromMapFilter(inputMap, "InvHistory");
  }

/**
 *
 * Gets the InvHistory
 * @return Value of the InvHistory
 *
 */

  public InvHistoryObjectFilter getInvHistory( ) {
    return InvHistoryFindIn;
  }

}
