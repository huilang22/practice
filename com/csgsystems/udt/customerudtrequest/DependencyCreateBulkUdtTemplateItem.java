/*
 * Generated code DO NOT EDIT
 * Generated file: DependencyCreateBulkUdtTemplateItem.java
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
 * Class used to create a DependencyCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class DependencyCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DependencyObjectData depCrIn;
/**
 *
 * Constructor to create a  DependencyCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DependencyCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, DependencyObjectData depCrInIn) {
    super(id, context, "DependencyCreate");
    depCrIn = depCrInIn;
  }

  public void translateToMap() {
    if (depCrIn != null) {
      depCrIn.resetFlags(true, true);
      addInput("Dependency", DependencyObjectHelper.toMap(depCrIn, new HashMap(), "Dependency").get("Dependency"));
    }
  }


/**
 *
 * Sets the Dependency
 * @param depCrInIn Value of the depCrIn
 *
 */

  public void setDependency(DependencyObjectData depCrInIn) {
    depCrIn = depCrInIn;
  }

  public void translateFromMap() {
    depCrIn = DependencyObjectHelper.fromMap(inputMap, "Dependency");
  }

/**
 *
 * Gets the Dependency
 * @return Value of the Dependency
 *
 */

  public DependencyObjectData getDependency( ) {
    return depCrIn;
  }

}
