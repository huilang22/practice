/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentFindBulkUdtTemplateItem.java
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
 * Class used to create a PackageComponentFindBulkUdtTemplateItem Bulk Template
 *
 */

public class PackageComponentFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PCObjectFilter PCFindIn;
/**
 *
 * Constructor to create a  PackageComponentFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PackageComponentFindBulkUdtTemplateItem(String id, BSDMSessionContext context, PCObjectFilter PCFindInIn) {
    super(id, context, "PackageComponentFind");
    PCFindIn = PCFindInIn;
  }

  public void translateToMap() {
    if (PCFindIn != null) {
      Integer index =  PCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PackageComponent", PCObjectHelper.toMap(PCFindIn, new HashMap(), "PackageComponent").get("PackageComponent"));
    }
  }


/**
 *
 * Sets the PackageComponent
 * @param PCFindInIn Value of the PCFindIn
 *
 */

  public void setPackageComponent(PCObjectFilter PCFindInIn) {
    PCFindIn = PCFindInIn;
  }

  public void translateFromMap() {
    PCFindIn = PCObjectHelper.fromMapFilter(inputMap, "PackageComponent");
  }

/**
 *
 * Gets the PackageComponent
 * @return Value of the PackageComponent
 *
 */

  public PCObjectFilter getPackageComponent( ) {
    return PCFindIn;
  }

}
