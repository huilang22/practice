/*
 * Generated code DO NOT EDIT
 * Generated file: InvdMainExtDataHistoryCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvdMainExtDataHistoryCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdMainExtDataHistoryCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdMainExtDataHistoryObjectData InvdMainExtDataHistoryCreateIn;
/**
 *
 * Constructor to create a  InvdMainExtDataHistoryCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdMainExtDataHistoryCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdMainExtDataHistoryObjectData InvdMainExtDataHistoryCreateInIn) {
    super(id, context, "InvdMainExtDataHistoryCreate");
    InvdMainExtDataHistoryCreateIn = InvdMainExtDataHistoryCreateInIn;
  }

  public void translateToMap() {
    if (InvdMainExtDataHistoryCreateIn != null) {
      InvdMainExtDataHistoryCreateIn.resetFlags(true, true);
      addInput("InvdMainExtDataHistory", InvdMainExtDataHistoryObjectHelper.toMap(InvdMainExtDataHistoryCreateIn, new HashMap(), "InvdMainExtDataHistory").get("InvdMainExtDataHistory"));
    }
  }


/**
 *
 * Sets the InvdMainExtDataHistory
 * @param InvdMainExtDataHistoryCreateInIn Value of the InvdMainExtDataHistoryCreateIn
 *
 */

  public void setInvdMainExtDataHistory(InvdMainExtDataHistoryObjectData InvdMainExtDataHistoryCreateInIn) {
    InvdMainExtDataHistoryCreateIn = InvdMainExtDataHistoryCreateInIn;
  }

  public void translateFromMap() {
    InvdMainExtDataHistoryCreateIn = InvdMainExtDataHistoryObjectHelper.fromMap(inputMap, "InvdMainExtDataHistory");
  }

/**
 *
 * Gets the InvdMainExtDataHistory
 * @return Value of the InvdMainExtDataHistory
 *
 */

  public InvdMainExtDataHistoryObjectData getInvdMainExtDataHistory( ) {
    return InvdMainExtDataHistoryCreateIn;
  }

}
