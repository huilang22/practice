/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DependencyUpdateBulkUdtTemplateItem.java
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
 * Class used to create a DependencyUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class DependencyUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DependencyObjectData depUpdIn;
/**
 *
 * Constructor to create a  DependencyUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DependencyUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, DependencyObjectData depUpdInIn) {
    super(id, context, "DependencyUpdate");
    depUpdIn = depUpdInIn;
  }

  public void translateToMap() {
    if (depUpdIn != null) {
      depUpdIn.resetFlags(true, true);
      addInput("Dependency", DependencyObjectHelper.toMap(depUpdIn, new HashMap(), "Dependency").get("Dependency"));
    }
  }


/**
 *
 * Sets the Dependency
 * @param depUpdInIn Value of the depUpdIn
 *
 */

  public void setDependency(DependencyObjectData depUpdInIn) {
    depUpdIn = depUpdInIn;
  }

  public void translateFromMap() {
    depUpdIn = DependencyObjectHelper.fromMap(inputMap, "Dependency");
  }

/**
 *
 * Gets the Dependency
 * @return Value of the Dependency
 *
 */

  public DependencyObjectData getDependency( ) {
    return depUpdIn;
  }

}
