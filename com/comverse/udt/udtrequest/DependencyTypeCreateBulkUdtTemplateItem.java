/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DependencyTypeCreateBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a DependencyTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class DependencyTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DependencyTypeObjectData DependencyTypeCreateIn;
/**
 *
 * Constructor to create a  DependencyTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DependencyTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, DependencyTypeObjectData DependencyTypeCreateInIn) {
    super(id, context, "DependencyTypeCreate");
    DependencyTypeCreateIn = DependencyTypeCreateInIn;
  }

  public void translateToMap() {
    if (DependencyTypeCreateIn != null) {
      DependencyTypeCreateIn.resetFlags(true, true);
      addInput("DependencyType", DependencyTypeObjectHelper.toMap(DependencyTypeCreateIn, new HashMap(), "DependencyType").get("DependencyType"));
    }
  }


/**
 *
 * Sets the DependencyType
 * @param DependencyTypeCreateInIn Value of the DependencyTypeCreateIn
 *
 */

  public void setDependencyType(DependencyTypeObjectData DependencyTypeCreateInIn) {
    DependencyTypeCreateIn = DependencyTypeCreateInIn;
  }

  public void translateFromMap() {
    DependencyTypeCreateIn = DependencyTypeObjectHelper.fromMap(inputMap, "DependencyType");
  }

/**
 *
 * Gets the DependencyType
 * @return Value of the DependencyType
 *
 */

  public DependencyTypeObjectData getDependencyType( ) {
    return DependencyTypeCreateIn;
  }

}
