/*
 * Generated code DO NOT EDIT
 * Generated file: DependencyTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a DependencyTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class DependencyTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DependencyTypeObjectKeyData DependencyTypeGetIn;
/**
 *
 * Constructor to create a  DependencyTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DependencyTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, DependencyTypeObjectKeyData DependencyTypeGetInIn) {
    super(id, context, "DependencyTypeGet");
    DependencyTypeGetIn = DependencyTypeGetInIn;
  }

  public void translateToMap() {
    if (DependencyTypeGetIn != null) {
      DependencyTypeGetIn.resetFlags(true, true);
      addInput("DependencyType", DependencyTypeObjectKeyHelper.toMap(DependencyTypeGetIn, new HashMap(), "DependencyTypeObjectKeyData").get("DependencyTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the DependencyType
 * @param DependencyTypeGetInIn Value of the DependencyTypeGetIn
 *
 */

  public void setDependencyType(DependencyTypeObjectKeyData DependencyTypeGetInIn) {
    DependencyTypeGetIn = DependencyTypeGetInIn;
  }

  public void translateFromMap() {
    DependencyTypeGetIn = DependencyTypeObjectKeyHelper.fromMap(inputMap, "DependencyType");
  }

/**
 *
 * Gets the DependencyType
 * @return Value of the DependencyType
 *
 */

  public DependencyTypeObjectKeyData getDependencyType( ) {
    return DependencyTypeGetIn;
  }

}
