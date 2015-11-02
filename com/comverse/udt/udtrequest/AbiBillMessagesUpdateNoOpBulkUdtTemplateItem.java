/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiBillMessagesUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a AbiBillMessagesUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AbiBillMessagesUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AbiBillMessagesObjectData noOpIn;

/**
 *
 * Constructor to create a   AbiBillMessagesUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AbiBillMessagesUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AbiBillMessagesObjectData noOpInIn) {
    super(id, context, "AbiBillMessagesUpdate");
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
