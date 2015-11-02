/*
 * Generated code DO NOT EDIT
 * Generated file: AbiBillMessagesGetBulkUdtTemplateItem.java
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
 * Class used to create a AbiBillMessagesGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AbiBillMessagesGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AbiBillMessagesObjectKeyData AbiBillMessagesGetIn;
/**
 *
 * Constructor to create a  AbiBillMessagesGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AbiBillMessagesGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AbiBillMessagesObjectKeyData AbiBillMessagesGetInIn) {
    super(id, context, "AbiBillMessagesGet");
    AbiBillMessagesGetIn = AbiBillMessagesGetInIn;
  }

  public void translateToMap() {
    if (AbiBillMessagesGetIn != null) {
      AbiBillMessagesGetIn.resetFlags(true, true);
      addInput("AbiBillMessages", AbiBillMessagesObjectKeyHelper.toMap(AbiBillMessagesGetIn, new HashMap(), "AbiBillMessagesObjectKeyData").get("AbiBillMessagesObjectKeyData"));
    }
  }


/**
 *
 * Sets the AbiBillMessages
 * @param AbiBillMessagesGetInIn Value of the AbiBillMessagesGetIn
 *
 */

  public void setAbiBillMessages(AbiBillMessagesObjectKeyData AbiBillMessagesGetInIn) {
    AbiBillMessagesGetIn = AbiBillMessagesGetInIn;
  }

  public void translateFromMap() {
    AbiBillMessagesGetIn = AbiBillMessagesObjectKeyHelper.fromMap(inputMap, "AbiBillMessages");
  }

/**
 *
 * Gets the AbiBillMessages
 * @return Value of the AbiBillMessages
 *
 */

  public AbiBillMessagesObjectKeyData getAbiBillMessages( ) {
    return AbiBillMessagesGetIn;
  }

}
