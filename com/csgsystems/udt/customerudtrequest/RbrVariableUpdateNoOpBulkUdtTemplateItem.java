/*
 * Generated code DO NOT EDIT
 * Generated file: RbrVariableUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RbrVariableUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RbrVariableUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RbrVarObjectData noOpIn;

/**
 *
 * Constructor to create a   RbrVariableUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RbrVariableUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrVarObjectData noOpInIn) {
    super(id, context, "RbrVariableUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RbrVariable", RbrVarObjectHelper.toMap(noOpIn, new HashMap(), "RbrVariable").get("RbrVariable"));
    }
  }
/**
 *
 * Sets the  RbrVariable
 * @param noOpInIn RbrVarObjectData to set
 *
 */
  public void setRbrVariable(RbrVarObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RbrVariable passed into the constructor
 * @return Simulated response
 *
 */
  public RbrVarObjectData getRbrVariable() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RbrVarObjectHelper.fromMap(inputMap, "RbrVariable");
  }
}
