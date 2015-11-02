/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TicklerGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a TicklerGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class TicklerGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected TicklerObjectData noOpIn;

/**
 *
 * Constructor to create a   TicklerGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public TicklerGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, TicklerObjectData noOpInIn) {
    super(id, context, "TicklerGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Tickler", TicklerObjectHelper.toMap(noOpIn, new HashMap(), "Tickler").get("Tickler"));
    }
  }
/**
 *
 * Sets the  Tickler
 * @param noOpInIn TicklerObjectData to set
 *
 */
  public void setTickler(TicklerObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Tickler passed into the constructor
 * @return Simulated response
 *
 */
  public TicklerObjectData getTickler() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = TicklerObjectHelper.fromMap(inputMap, "Tickler");
  }
}
