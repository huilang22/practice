/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepartmentUpdateBulkUdtTemplateItem.java
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
 * Class used to create a DepartmentUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class DepartmentUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DepartmentObjectData DepartmentUpdateIn;
/**
 *
 * Constructor to create a  DepartmentUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DepartmentUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, DepartmentObjectData DepartmentUpdateInIn) {
    super(id, context, "DepartmentUpdate");
    DepartmentUpdateIn = DepartmentUpdateInIn;
  }

  public void translateToMap() {
    if (DepartmentUpdateIn != null) {
      DepartmentUpdateIn.resetFlags(true, true);
      addInput("Department", DepartmentObjectHelper.toMap(DepartmentUpdateIn, new HashMap(), "Department").get("Department"));
    }
  }


/**
 *
 * Sets the Department
 * @param DepartmentUpdateInIn Value of the DepartmentUpdateIn
 *
 */

  public void setDepartment(DepartmentObjectData DepartmentUpdateInIn) {
    DepartmentUpdateIn = DepartmentUpdateInIn;
  }

  public void translateFromMap() {
    DepartmentUpdateIn = DepartmentObjectHelper.fromMap(inputMap, "Department");
  }

/**
 *
 * Gets the Department
 * @return Value of the Department
 *
 */

  public DepartmentObjectData getDepartment( ) {
    return DepartmentUpdateIn;
  }

}
