/*
 * Generated code DO NOT EDIT
 * Generated file: BsdActionGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdActionGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdActionGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdActionObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdActionGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdActionGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdActionObjectData noOpInIn) {
    super(id, context, "BsdActionGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdAction", BsdActionObjectHelper.toMap(noOpIn, new HashMap(), "BsdAction").get("BsdAction"));
    }
  }
/**
 *
 * Sets the  BsdAction
 * @param noOpInIn BsdActionObjectData to set
 *
 */
  public void setBsdAction(BsdActionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdAction passed into the constructor
 * @return Simulated response
 *
 */
  public BsdActionObjectData getBsdAction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdActionObjectHelper.fromMap(inputMap, "BsdAction");
  }
}
