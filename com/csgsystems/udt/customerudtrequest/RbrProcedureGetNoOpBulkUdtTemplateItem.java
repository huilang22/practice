/*
 * Generated code DO NOT EDIT
 * Generated file: RbrProcedureGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RbrProcedureGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RbrProcedureGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RbrProcObjectData noOpIn;

/**
 *
 * Constructor to create a   RbrProcedureGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RbrProcedureGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrProcObjectData noOpInIn) {
    super(id, context, "RbrProcedureGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RbrProcedure", RbrProcObjectHelper.toMap(noOpIn, new HashMap(), "RbrProcedure").get("RbrProcedure"));
    }
  }
/**
 *
 * Sets the  RbrProcedure
 * @param noOpInIn RbrProcObjectData to set
 *
 */
  public void setRbrProcedure(RbrProcObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RbrProcedure passed into the constructor
 * @return Simulated response
 *
 */
  public RbrProcObjectData getRbrProcedure() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RbrProcObjectHelper.fromMap(inputMap, "RbrProcedure");
  }
}
