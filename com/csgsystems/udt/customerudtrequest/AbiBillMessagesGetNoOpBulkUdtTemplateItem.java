/*
 * Generated code DO NOT EDIT
 * Generated file: AbiBillMessagesGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AbiBillMessagesGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AbiBillMessagesGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AbiBillMessagesObjectData noOpIn;

/**
 *
 * Constructor to create a   AbiBillMessagesGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AbiBillMessagesGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AbiBillMessagesObjectData noOpInIn) {
    super(id, context, "AbiBillMessagesGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AbiBillMessages", AbiBillMessagesObjectHelper.toMap(noOpIn, new HashMap(), "AbiBillMessages").get("AbiBillMessages"));
    }
  }
/**
 *
 * Sets the  AbiBillMessages
 * @param noOpInIn AbiBillMessagesObjectData to set
 *
 */
  public void setAbiBillMessages(AbiBillMessagesObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AbiBillMessages passed into the constructor
 * @return Simulated response
 *
 */
  public AbiBillMessagesObjectData getAbiBillMessages() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AbiBillMessagesObjectHelper.fromMap(inputMap, "AbiBillMessages");
  }
}
