/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobHistoryFindBulkUdtTemplateItem.java
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
 * Class used to create a InvJobHistoryFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvJobHistoryFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvJobHistoryObjectFilter InvJobHistoryFindIn;
/**
 *
 * Constructor to create a  InvJobHistoryFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvJobHistoryFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvJobHistoryObjectFilter InvJobHistoryFindInIn) {
    super(id, context, "InvJobHistoryFind");
    InvJobHistoryFindIn = InvJobHistoryFindInIn;
  }

  public void translateToMap() {
    if (InvJobHistoryFindIn != null) {
      Integer index =  InvJobHistoryFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvJobHistory", InvJobHistoryObjectHelper.toMap(InvJobHistoryFindIn, new HashMap(), "InvJobHistory").get("InvJobHistory"));
    }
  }


/**
 *
 * Sets the InvJobHistory
 * @param InvJobHistoryFindInIn Value of the InvJobHistoryFindIn
 *
 */

  public void setInvJobHistory(InvJobHistoryObjectFilter InvJobHistoryFindInIn) {
    InvJobHistoryFindIn = InvJobHistoryFindInIn;
  }

  public void translateFromMap() {
    InvJobHistoryFindIn = InvJobHistoryObjectHelper.fromMapFilter(inputMap, "InvJobHistory");
  }

/**
 *
 * Gets the InvJobHistory
 * @return Value of the InvJobHistory
 *
 */

  public InvJobHistoryObjectFilter getInvJobHistory( ) {
    return InvJobHistoryFindIn;
  }

}
