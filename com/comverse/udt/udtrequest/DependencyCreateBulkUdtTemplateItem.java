/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DependencyCreateBulkUdtTemplateItem.java
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
