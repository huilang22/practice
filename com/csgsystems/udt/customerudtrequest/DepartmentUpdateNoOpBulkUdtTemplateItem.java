/*
 * Generated code DO NOT EDIT
 * Generated file: DepartmentUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.we.data.*;

/**
 *
 * NoOp class used to simulate a DepartmentUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DepartmentUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DepartmentObjectData noOpIn;

/**
 *
 * Constructor to create a   DepartmentUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DepartmentUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DepartmentObjectData noOpInIn) {
    super(id, context, "DepartmentUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Department", DepartmentObjectHelper.toMap(noOpIn, new HashMap(), "Department").get("Department"));
    }
  }
/**
 *
 * Sets the  Department
 * @param noOpInIn DepartmentObjectData to set
 *
 */
  public void setDepartment(DepartmentObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Department passed into the constructor
 * @return Simulated response
 *
 */
  public DepartmentObjectData getDepartment() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DepartmentObjectHelper.fromMap(inputMap, "Department");
  }
}
