/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentDefFindBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a PackageComponentDefFindBulkUdtTemplateItem Bulk Template
 *
 */

public class PackageComponentDefFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PCDObjectFilter PCDFindIn;
/**
 *
 * Constructor to create a  PackageComponentDefFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PackageComponentDefFindBulkUdtTemplateItem(String id, BSDMSessionContext context, PCDObjectFilter PCDFindInIn) {
    super(id, context, "PackageComponentDefFind");
    PCDFindIn = PCDFindInIn;
  }

  public void translateToMap() {
    if (PCDFindIn != null) {
      Integer index =  PCDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PackageComponentDef", PCDObjectHelper.toMap(PCDFindIn, new HashMap(), "PackageComponentDef").get("PackageComponentDef"));
    }
  }


/**
 *
 * Sets the PackageComponentDef
 * @param PCDFindInIn Value of the PCDFindIn
 *
 */

  public void setPackageComponentDef(PCDObjectFilter PCDFindInIn) {
    PCDFindIn = PCDFindInIn;
  }

  public void translateFromMap() {
    PCDFindIn = PCDObjectHelper.fromMapFilter(inputMap, "PackageComponentDef");
  }

/**
 *
 * Gets the PackageComponentDef
 * @return Value of the PackageComponentDef
 *
 */

  public PCDObjectFilter getPackageComponentDef( ) {
    return PCDFindIn;
  }

}
