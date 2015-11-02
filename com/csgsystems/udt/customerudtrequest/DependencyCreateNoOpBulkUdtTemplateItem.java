/*
 * Generated code DO NOT EDIT
 * Generated file: DependencyCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a DependencyCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DependencyCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DependencyObjectData noOpIn;

/**
 *
 * Constructor to create a   DependencyCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DependencyCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DependencyObjectData noOpInIn) {
    super(id, context, "DependencyCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Dependency", DependencyObjectHelper.toMap(noOpIn, new HashMap(), "Dependency").get("Dependency"));
    }
  }
/**
 *
 * Sets the  Dependency
 * @param noOpInIn DependencyObjectData to set
 *
 */
  public void setDependency(DependencyObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Dependency passed into the constructor
 * @return Simulated response
 *
 */
  public DependencyObjectData getDependency() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DependencyObjectHelper.fromMap(inputMap, "Dependency");
  }
}
