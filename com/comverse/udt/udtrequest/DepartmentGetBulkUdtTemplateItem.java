/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepartmentGetBulkUdtTemplateItem.java
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
 * Class used to create a DepartmentGetBulkUdtTemplateItem Bulk Template
 *
 */

public class DepartmentGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DepartmentObjectKeyData DepartmentGetIn;
/**
 *
 * Constructor to create a  DepartmentGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DepartmentGetBulkUdtTemplateItem(String id, BSDMSessionContext context, DepartmentObjectKeyData DepartmentGetInIn) {
    super(id, context, "DepartmentGet");
    DepartmentGetIn = DepartmentGetInIn;
  }

  public void translateToMap() {
    if (DepartmentGetIn != null) {
      DepartmentGetIn.resetFlags(true, true);
      addInput("Department", DepartmentObjectKeyHelper.toMap(DepartmentGetIn, new HashMap(), "DepartmentObjectKeyData").get("DepartmentObjectKeyData"));
    }
  }


/**
 *
 * Sets the Department
 * @param DepartmentGetInIn Value of the DepartmentGetIn
 *
 */

  public void setDepartment(DepartmentObjectKeyData DepartmentGetInIn) {
    DepartmentGetIn = DepartmentGetInIn;
  }

  public void translateFromMap() {
    DepartmentGetIn = DepartmentObjectKeyHelper.fromMap(inputMap, "Department");
  }

/**
 *
 * Gets the Department
 * @return Value of the Department
 *
 */

  public DepartmentObjectKeyData getDepartment( ) {
    return DepartmentGetIn;
  }

}
