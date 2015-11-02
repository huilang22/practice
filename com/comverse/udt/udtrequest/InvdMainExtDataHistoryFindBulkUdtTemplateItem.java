/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainExtDataHistoryFindBulkUdtTemplateItem.java
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
 * Class used to create a InvdMainExtDataHistoryFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdMainExtDataHistoryFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdMainExtDataHistoryObjectFilter InvdMainExtDataHistoryFindIn;
/**
 *
 * Constructor to create a  InvdMainExtDataHistoryFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdMainExtDataHistoryFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdMainExtDataHistoryObjectFilter InvdMainExtDataHistoryFindInIn) {
    super(id, context, "InvdMainExtDataHistoryFind");
    InvdMainExtDataHistoryFindIn = InvdMainExtDataHistoryFindInIn;
  }

  public void translateToMap() {
    if (InvdMainExtDataHistoryFindIn != null) {
      Integer index =  InvdMainExtDataHistoryFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvdMainExtDataHistory", InvdMainExtDataHistoryObjectHelper.toMap(InvdMainExtDataHistoryFindIn, new HashMap(), "InvdMainExtDataHistory").get("InvdMainExtDataHistory"));
    }
  }


/**
 *
 * Sets the InvdMainExtDataHistory
 * @param InvdMainExtDataHistoryFindInIn Value of the InvdMainExtDataHistoryFindIn
 *
 */

  public void setInvdMainExtDataHistory(InvdMainExtDataHistoryObjectFilter InvdMainExtDataHistoryFindInIn) {
    InvdMainExtDataHistoryFindIn = InvdMainExtDataHistoryFindInIn;
  }

  public void translateFromMap() {
    InvdMainExtDataHistoryFindIn = InvdMainExtDataHistoryObjectHelper.fromMapFilter(inputMap, "InvdMainExtDataHistory");
  }

/**
 *
 * Gets the InvdMainExtDataHistory
 * @return Value of the InvdMainExtDataHistory
 *
 */

  public InvdMainExtDataHistoryObjectFilter getInvdMainExtDataHistory( ) {
    return InvdMainExtDataHistoryFindIn;
  }

}
