/*
 * Generated code DO NOT EDIT
 * Generated file: InvHistoryCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvHistoryCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvHistoryCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvMainObjectData InvHistoryCreateIn;
/**
 *
 * Constructor to create a  InvHistoryCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvHistoryCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvMainObjectData InvHistoryCreateInIn) {
    super(id, context, "InvHistoryCreate");
    InvHistoryCreateIn = InvHistoryCreateInIn;
  }

  public void translateToMap() {
    if (InvHistoryCreateIn != null) {
      InvHistoryCreateIn.resetFlags(true, true);
      addInput("InvHistory", InvMainObjectHelper.toMap(InvHistoryCreateIn, new HashMap(), "InvHistory").get("InvHistory"));
    }
  }


/**
 *
 * Sets the InvHistory
 * @param InvHistoryCreateInIn Value of the InvHistoryCreateIn
 *
 */

  public void setInvHistory(InvMainObjectData InvHistoryCreateInIn) {
    InvHistoryCreateIn = InvHistoryCreateInIn;
  }

  public void translateFromMap() {
    InvHistoryCreateIn = InvMainObjectHelper.fromMap(inputMap, "InvHistory");
  }

/**
 *
 * Gets the InvHistory
 * @return Value of the InvHistory
 *
 */

  public InvMainObjectData getInvHistory( ) {
    return InvHistoryCreateIn;
  }

}
