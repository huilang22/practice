/*
 * Generated code DO NOT EDIT
 * Generated file: InvdMainExtDataHistoryUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvdMainExtDataHistoryUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdMainExtDataHistoryUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdMainExtDataHistoryObjectData InvdMainExtDataHistoryUpdateIn;
/**
 *
 * Constructor to create a  InvdMainExtDataHistoryUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdMainExtDataHistoryUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdMainExtDataHistoryObjectData InvdMainExtDataHistoryUpdateInIn) {
    super(id, context, "InvdMainExtDataHistoryUpdate");
    InvdMainExtDataHistoryUpdateIn = InvdMainExtDataHistoryUpdateInIn;
  }

  public void translateToMap() {
    if (InvdMainExtDataHistoryUpdateIn != null) {
      InvdMainExtDataHistoryUpdateIn.resetFlags(true, true);
      addInput("InvdMainExtDataHistory", InvdMainExtDataHistoryObjectHelper.toMap(InvdMainExtDataHistoryUpdateIn, new HashMap(), "InvdMainExtDataHistory").get("InvdMainExtDataHistory"));
    }
  }


/**
 *
 * Sets the InvdMainExtDataHistory
 * @param InvdMainExtDataHistoryUpdateInIn Value of the InvdMainExtDataHistoryUpdateIn
 *
 */

  public void setInvdMainExtDataHistory(InvdMainExtDataHistoryObjectData InvdMainExtDataHistoryUpdateInIn) {
    InvdMainExtDataHistoryUpdateIn = InvdMainExtDataHistoryUpdateInIn;
  }

  public void translateFromMap() {
    InvdMainExtDataHistoryUpdateIn = InvdMainExtDataHistoryObjectHelper.fromMap(inputMap, "InvdMainExtDataHistory");
  }

/**
 *
 * Gets the InvdMainExtDataHistory
 * @return Value of the InvdMainExtDataHistory
 *
 */

  public InvdMainExtDataHistoryObjectData getInvdMainExtDataHistory( ) {
    return InvdMainExtDataHistoryUpdateIn;
  }

}
