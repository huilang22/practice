/*
 * Generated code DO NOT EDIT
 * Generated file: InvdMainExtDataHistoryGetBulkUdtTemplateItem.java
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
 * Class used to create a InvdMainExtDataHistoryGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdMainExtDataHistoryGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdMainExtDataHistoryObjectKeyData InvdMainExtDataHistoryGetIn;
/**
 *
 * Constructor to create a  InvdMainExtDataHistoryGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdMainExtDataHistoryGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdMainExtDataHistoryObjectKeyData InvdMainExtDataHistoryGetInIn) {
    super(id, context, "InvdMainExtDataHistoryGet");
    InvdMainExtDataHistoryGetIn = InvdMainExtDataHistoryGetInIn;
  }

  public void translateToMap() {
    if (InvdMainExtDataHistoryGetIn != null) {
      InvdMainExtDataHistoryGetIn.resetFlags(true, true);
      addInput("InvdMainExtDataHistory", InvdMainExtDataHistoryObjectKeyHelper.toMap(InvdMainExtDataHistoryGetIn, new HashMap(), "InvdMainExtDataHistoryObjectKeyData").get("InvdMainExtDataHistoryObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvdMainExtDataHistory
 * @param InvdMainExtDataHistoryGetInIn Value of the InvdMainExtDataHistoryGetIn
 *
 */

  public void setInvdMainExtDataHistory(InvdMainExtDataHistoryObjectKeyData InvdMainExtDataHistoryGetInIn) {
    InvdMainExtDataHistoryGetIn = InvdMainExtDataHistoryGetInIn;
  }

  public void translateFromMap() {
    InvdMainExtDataHistoryGetIn = InvdMainExtDataHistoryObjectKeyHelper.fromMap(inputMap, "InvdMainExtDataHistory");
  }

/**
 *
 * Gets the InvdMainExtDataHistory
 * @return Value of the InvdMainExtDataHistory
 *
 */

  public InvdMainExtDataHistoryObjectKeyData getInvdMainExtDataHistory( ) {
    return InvdMainExtDataHistoryGetIn;
  }

}
