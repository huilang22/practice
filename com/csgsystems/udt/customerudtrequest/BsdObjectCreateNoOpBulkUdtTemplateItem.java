/*
 * Generated code DO NOT EDIT
 * Generated file: BsdObjectCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdObjectCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdObjectCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdObjectObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdObjectCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdObjectCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdObjectObjectData noOpInIn) {
    super(id, context, "BsdObjectCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdObject", BsdObjectObjectHelper.toMap(noOpIn, new HashMap(), "BsdObject").get("BsdObject"));
    }
  }
/**
 *
 * Sets the  BsdObject
 * @param noOpInIn BsdObjectObjectData to set
 *
 */
  public void setBsdObject(BsdObjectObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdObject passed into the constructor
 * @return Simulated response
 *
 */
  public BsdObjectObjectData getBsdObject() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdObjectObjectHelper.fromMap(inputMap, "BsdObject");
  }
}
