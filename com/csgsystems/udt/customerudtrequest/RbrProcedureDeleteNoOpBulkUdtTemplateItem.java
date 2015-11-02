/*
 * Generated code DO NOT EDIT
 * Generated file: RbrProcedureDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RbrProcedureDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RbrProcedureDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RbrProcObjectData noOpIn;

/**
 *
 * Constructor to create a   RbrProcedureDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RbrProcedureDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrProcObjectData noOpInIn) {
    super(id, context, "RbrProcedureDelete");
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
