/*
 * Generated code DO NOT EDIT
 * Generated file: TicklerCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a TicklerCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class TicklerCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected TicklerObjectData noOpIn;

/**
 *
 * Constructor to create a   TicklerCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public TicklerCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, TicklerObjectData noOpInIn) {
    super(id, context, "TicklerCreate");
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
