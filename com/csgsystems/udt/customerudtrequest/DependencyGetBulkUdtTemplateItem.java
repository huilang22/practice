/*
 * Generated code DO NOT EDIT
 * Generated file: DependencyGetBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a DependencyGetBulkUdtTemplateItem Bulk Template
 *
 */

public class DependencyGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DependencyObjectKeyData depGetIn;
/**
 *
 * Constructor to create a  DependencyGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DependencyGetBulkUdtTemplateItem(String id, BSDMSessionContext context, DependencyObjectKeyData depGetInIn) {
    super(id, context, "DependencyGet");
    depGetIn = depGetInIn;
  }

  public void translateToMap() {
    if (depGetIn != null) {
      depGetIn.resetFlags(true, true);
      addInput("Dependency", DependencyObjectKeyHelper.toMap(depGetIn, new HashMap(), "DependencyObjectKeyData").get("DependencyObjectKeyData"));
    }
  }


/**
 *
 * Sets the Dependency
 * @param depGetInIn Value of the depGetIn
 *
 */

  public void setDependency(DependencyObjectKeyData depGetInIn) {
    depGetIn = depGetInIn;
  }

  public void translateFromMap() {
    depGetIn = DependencyObjectKeyHelper.fromMap(inputMap, "Dependency");
  }

/**
 *
 * Gets the Dependency
 * @return Value of the Dependency
 *
 */

  public DependencyObjectKeyData getDependency( ) {
    return depGetIn;
  }

}
