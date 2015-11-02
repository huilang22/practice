/*
 * Generated code DO NOT EDIT
 * Generated file: InvsMncGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsMncGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsMncGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsMncObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsMncGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsMncGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsMncObjectData noOpInIn) {
    super(id, context, "InvsMncGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsMnc", InvsMncObjectHelper.toMap(noOpIn, new HashMap(), "InvsMnc").get("InvsMnc"));
    }
  }
/**
 *
 * Sets the  InvsMnc
 * @param noOpInIn InvsMncObjectData to set
 *
 */
  public void setInvsMnc(InvsMncObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsMnc passed into the constructor
 * @return Simulated response
 *
 */
  public InvsMncObjectData getInvsMnc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsMncObjectHelper.fromMap(inputMap, "InvsMnc");
  }
}
