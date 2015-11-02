/*
 * Generated code DO NOT EDIT
 * Generated file: DependencyTypeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a DependencyTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class DependencyTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DependencyTypeObjectData DependencyTypeUpdateIn;
/**
 *
 * Constructor to create a  DependencyTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DependencyTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, DependencyTypeObjectData DependencyTypeUpdateInIn) {
    super(id, context, "DependencyTypeUpdate");
    DependencyTypeUpdateIn = DependencyTypeUpdateInIn;
  }

  public void translateToMap() {
    if (DependencyTypeUpdateIn != null) {
      DependencyTypeUpdateIn.resetFlags(true, true);
      addInput("DependencyType", DependencyTypeObjectHelper.toMap(DependencyTypeUpdateIn, new HashMap(), "DependencyType").get("DependencyType"));
    }
  }


/**
 *
 * Sets the DependencyType
 * @param DependencyTypeUpdateInIn Value of the DependencyTypeUpdateIn
 *
 */

  public void setDependencyType(DependencyTypeObjectData DependencyTypeUpdateInIn) {
    DependencyTypeUpdateIn = DependencyTypeUpdateInIn;
  }

  public void translateFromMap() {
    DependencyTypeUpdateIn = DependencyTypeObjectHelper.fromMap(inputMap, "DependencyType");
  }

/**
 *
 * Gets the DependencyType
 * @return Value of the DependencyType
 *
 */

  public DependencyTypeObjectData getDependencyType( ) {
    return DependencyTypeUpdateIn;
  }

}
