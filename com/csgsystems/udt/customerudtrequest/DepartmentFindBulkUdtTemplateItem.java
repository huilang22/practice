/*
 * Generated code DO NOT EDIT
 * Generated file: DepartmentFindBulkUdtTemplateItem.java
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
 * Class used to create a DepartmentFindBulkUdtTemplateItem Bulk Template
 *
 */

public class DepartmentFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DepartmentObjectFilter DepartmentFindIn;
/**
 *
 * Constructor to create a  DepartmentFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DepartmentFindBulkUdtTemplateItem(String id, BSDMSessionContext context, DepartmentObjectFilter DepartmentFindInIn) {
    super(id, context, "DepartmentFind");
    DepartmentFindIn = DepartmentFindInIn;
  }

  public void translateToMap() {
    if (DepartmentFindIn != null) {
      Integer index =  DepartmentFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Department", DepartmentObjectHelper.toMap(DepartmentFindIn, new HashMap(), "Department").get("Department"));
    }
  }


/**
 *
 * Sets the Department
 * @param DepartmentFindInIn Value of the DepartmentFindIn
 *
 */

  public void setDepartment(DepartmentObjectFilter DepartmentFindInIn) {
    DepartmentFindIn = DepartmentFindInIn;
  }

  public void translateFromMap() {
    DepartmentFindIn = DepartmentObjectHelper.fromMapFilter(inputMap, "Department");
  }

/**
 *
 * Gets the Department
 * @return Value of the Department
 *
 */

  public DepartmentObjectFilter getDepartment( ) {
    return DepartmentFindIn;
  }

}
