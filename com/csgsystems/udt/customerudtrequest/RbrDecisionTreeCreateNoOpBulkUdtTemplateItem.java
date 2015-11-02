/*
 * Generated code DO NOT EDIT
 * Generated file: RbrDecisionTreeCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RbrDecisionTreeCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RbrDecisionTreeCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RbrDecTreeObjectData noOpIn;

/**
 *
 * Constructor to create a   RbrDecisionTreeCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RbrDecisionTreeCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrDecTreeObjectData noOpInIn) {
    super(id, context, "RbrDecisionTreeCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RbrDecisionTree", RbrDecTreeObjectHelper.toMap(noOpIn, new HashMap(), "RbrDecisionTree").get("RbrDecisionTree"));
    }
  }
/**
 *
 * Sets the  RbrDecisionTree
 * @param noOpInIn RbrDecTreeObjectData to set
 *
 */
  public void setRbrDecisionTree(RbrDecTreeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RbrDecisionTree passed into the constructor
 * @return Simulated response
 *
 */
  public RbrDecTreeObjectData getRbrDecisionTree() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RbrDecTreeObjectHelper.fromMap(inputMap, "RbrDecisionTree");
  }
}
