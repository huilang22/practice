/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DependencyFindBulkUdtTemplateItem.java
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
 * Class used to create a DependencyFindBulkUdtTemplateItem Bulk Template
 *
 */

public class DependencyFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DependencyObjectFilter depFindIntIn;
/**
 *
 * Constructor to create a  DependencyFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DependencyFindBulkUdtTemplateItem(String id, BSDMSessionContext context, DependencyObjectFilter depFindIntInIn) {
    super(id, context, "DependencyFind");
    depFindIntIn = depFindIntInIn;
  }

  public void translateToMap() {
    if (depFindIntIn != null) {
      Integer index =  depFindIntIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Dependency", DependencyObjectHelper.toMap(depFindIntIn, new HashMap(), "Dependency").get("Dependency"));
    }
  }


/**
 *
 * Sets the Dependency
 * @param depFindIntInIn Value of the depFindIntIn
 *
 */

  public void setDependency(DependencyObjectFilter depFindIntInIn) {
    depFindIntIn = depFindIntInIn;
  }

  public void translateFromMap() {
    depFindIntIn = DependencyObjectHelper.fromMapFilter(inputMap, "Dependency");
  }

/**
 *
 * Gets the Dependency
 * @return Value of the Dependency
 *
 */

  public DependencyObjectFilter getDependency( ) {
    return depFindIntIn;
  }

}
