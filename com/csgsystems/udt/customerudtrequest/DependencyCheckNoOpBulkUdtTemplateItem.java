/*
 * Generated code DO NOT EDIT
 * Generated file: DependencyCheckNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a DependencyCheckNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DependencyCheckNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DependencyCheckOutputData noOpIn;

/**
 *
 * Constructor to create a   DependencyCheckNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DependencyCheckNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DependencyCheckOutputData noOpInIn) {
    super(id, context, "DependencyCheck");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("DependencyCheckOutputData", DependencyCheckOutputHelper.toMap(noOpIn).get("DependencyCheckOutputData"));
    }
  }
/**
 *
 * Sets the  DependencyCheckOutputData
 * @param noOpInIn DependencyCheckOutputData to set
 *
 */
  public void setDependencyCheckOutputData(DependencyCheckOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the DependencyCheckOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public DependencyCheckOutputData getDependencyCheckOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DependencyCheckOutputHelper.fromMap(inputMap);
  }
}
