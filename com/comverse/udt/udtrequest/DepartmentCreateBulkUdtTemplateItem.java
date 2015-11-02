/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepartmentCreateBulkUdtTemplateItem.java
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
 * Class used to create a DepartmentCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class DepartmentCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DepartmentObjectData DepartmentCreateIn;
/**
 *
 * Constructor to create a  DepartmentCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DepartmentCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, DepartmentObjectData DepartmentCreateInIn) {
    super(id, context, "DepartmentCreate");
    DepartmentCreateIn = DepartmentCreateInIn;
  }

  public void translateToMap() {
    if (DepartmentCreateIn != null) {
      DepartmentCreateIn.resetFlags(true, true);
      addInput("Department", DepartmentObjectHelper.toMap(DepartmentCreateIn, new HashMap(), "Department").get("Department"));
    }
  }


/**
 *
 * Sets the Department
 * @param DepartmentCreateInIn Value of the DepartmentCreateIn
 *
 */

  public void setDepartment(DepartmentObjectData DepartmentCreateInIn) {
    DepartmentCreateIn = DepartmentCreateInIn;
  }

  public void translateFromMap() {
    DepartmentCreateIn = DepartmentObjectHelper.fromMap(inputMap, "Department");
  }

/**
 *
 * Gets the Department
 * @return Value of the Department
 *
 */

  public DepartmentObjectData getDepartment( ) {
    return DepartmentCreateIn;
  }

}
