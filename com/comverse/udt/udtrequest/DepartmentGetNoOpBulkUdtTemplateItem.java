/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepartmentGetNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a DepartmentGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DepartmentGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DepartmentObjectData noOpIn;

/**
 *
 * Constructor to create a   DepartmentGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DepartmentGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DepartmentObjectData noOpInIn) {
    super(id, context, "DepartmentGet");
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
