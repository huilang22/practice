/*
 * Generated code DO NOT EDIT
 * Generated file: DependencyTypeCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a DependencyTypeCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DependencyTypeCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DependencyTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   DependencyTypeCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DependencyTypeCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DependencyTypeObjectData noOpInIn) {
    super(id, context, "DependencyTypeCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("DependencyType", DependencyTypeObjectHelper.toMap(noOpIn, new HashMap(), "DependencyType").get("DependencyType"));
    }
  }
/**
 *
 * Sets the  DependencyType
 * @param noOpInIn DependencyTypeObjectData to set
 *
 */
  public void setDependencyType(DependencyTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the DependencyType passed into the constructor
 * @return Simulated response
 *
 */
  public DependencyTypeObjectData getDependencyType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DependencyTypeObjectHelper.fromMap(inputMap, "DependencyType");
  }
}
