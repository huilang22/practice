/*
 * Generated code DO NOT EDIT
 * Generated file: InvdMainHistoryCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvdMainHistoryCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdMainHistoryCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdMainHistoryObjectData InvdMainHistoryCreateIn;
/**
 *
 * Constructor to create a  InvdMainHistoryCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdMainHistoryCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdMainHistoryObjectData InvdMainHistoryCreateInIn) {
    super(id, context, "InvdMainHistoryCreate");
    InvdMainHistoryCreateIn = InvdMainHistoryCreateInIn;
  }

  public void translateToMap() {
    if (InvdMainHistoryCreateIn != null) {
      InvdMainHistoryCreateIn.resetFlags(true, true);
      addInput("InvdMainHistory", InvdMainHistoryObjectHelper.toMap(InvdMainHistoryCreateIn, new HashMap(), "InvdMainHistory").get("InvdMainHistory"));
    }
  }


/**
 *
 * Sets the InvdMainHistory
 * @param InvdMainHistoryCreateInIn Value of the InvdMainHistoryCreateIn
 *
 */

  public void setInvdMainHistory(InvdMainHistoryObjectData InvdMainHistoryCreateInIn) {
    InvdMainHistoryCreateIn = InvdMainHistoryCreateInIn;
  }

  public void translateFromMap() {
    InvdMainHistoryCreateIn = InvdMainHistoryObjectHelper.fromMap(inputMap, "InvdMainHistory");
  }

/**
 *
 * Gets the InvdMainHistory
 * @return Value of the InvdMainHistory
 *
 */

  public InvdMainHistoryObjectData getInvdMainHistory( ) {
    return InvdMainHistoryCreateIn;
  }

}
