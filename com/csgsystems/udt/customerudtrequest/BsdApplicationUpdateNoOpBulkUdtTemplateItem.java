/*
 * Generated code DO NOT EDIT
 * Generated file: BsdApplicationUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdApplicationUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdApplicationUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdApplicationObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdApplicationUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdApplicationUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationObjectData noOpInIn) {
    super(id, context, "BsdApplicationUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdApplication", BsdApplicationObjectHelper.toMap(noOpIn, new HashMap(), "BsdApplication").get("BsdApplication"));
    }
  }
/**
 *
 * Sets the  BsdApplication
 * @param noOpInIn BsdApplicationObjectData to set
 *
 */
  public void setBsdApplication(BsdApplicationObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdApplication passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationObjectData getBsdApplication() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdApplicationObjectHelper.fromMap(inputMap, "BsdApplication");
  }
}
