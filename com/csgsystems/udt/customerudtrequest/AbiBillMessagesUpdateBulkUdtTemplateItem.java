/*
 * Generated code DO NOT EDIT
 * Generated file: AbiBillMessagesUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a AbiBillMessagesUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AbiBillMessagesUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AbiBillMessagesObjectData AbiBillMessagesUpdateIn;
/**
 *
 * Constructor to create a  AbiBillMessagesUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AbiBillMessagesUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, AbiBillMessagesObjectData AbiBillMessagesUpdateInIn) {
    super(id, context, "AbiBillMessagesUpdate");
    AbiBillMessagesUpdateIn = AbiBillMessagesUpdateInIn;
  }

  public void translateToMap() {
    if (AbiBillMessagesUpdateIn != null) {
      AbiBillMessagesUpdateIn.resetFlags(true, true);
      addInput("AbiBillMessages", AbiBillMessagesObjectHelper.toMap(AbiBillMessagesUpdateIn, new HashMap(), "AbiBillMessages").get("AbiBillMessages"));
    }
  }


/**
 *
 * Sets the AbiBillMessages
 * @param AbiBillMessagesUpdateInIn Value of the AbiBillMessagesUpdateIn
 *
 */

  public void setAbiBillMessages(AbiBillMessagesObjectData AbiBillMessagesUpdateInIn) {
    AbiBillMessagesUpdateIn = AbiBillMessagesUpdateInIn;
  }

  public void translateFromMap() {
    AbiBillMessagesUpdateIn = AbiBillMessagesObjectHelper.fromMap(inputMap, "AbiBillMessages");
  }

/**
 *
 * Gets the AbiBillMessages
 * @return Value of the AbiBillMessages
 *
 */

  public AbiBillMessagesObjectData getAbiBillMessages( ) {
    return AbiBillMessagesUpdateIn;
  }

}
