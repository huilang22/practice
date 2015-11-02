/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentDefGetBulkUdtTemplateItem.java
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
 * Class used to create a PackageComponentDefGetBulkUdtTemplateItem Bulk Template
 *
 */

public class PackageComponentDefGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PCDObjectKeyData PCDGetIn;
/**
 *
 * Constructor to create a  PackageComponentDefGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PackageComponentDefGetBulkUdtTemplateItem(String id, BSDMSessionContext context, PCDObjectKeyData PCDGetInIn) {
    super(id, context, "PackageComponentDefGet");
    PCDGetIn = PCDGetInIn;
  }

  public void translateToMap() {
    if (PCDGetIn != null) {
      PCDGetIn.resetFlags(true, true);
      addInput("PackageComponentDef", PCDObjectKeyHelper.toMap(PCDGetIn, new HashMap(), "PCDObjectKeyData").get("PCDObjectKeyData"));
    }
  }


/**
 *
 * Sets the PackageComponentDef
 * @param PCDGetInIn Value of the PCDGetIn
 *
 */

  public void setPackageComponentDef(PCDObjectKeyData PCDGetInIn) {
    PCDGetIn = PCDGetInIn;
  }

  public void translateFromMap() {
    PCDGetIn = PCDObjectKeyHelper.fromMap(inputMap, "PackageComponentDef");
  }

/**
 *
 * Gets the PackageComponentDef
 * @return Value of the PackageComponentDef
 *
 */

  public PCDObjectKeyData getPackageComponentDef( ) {
    return PCDGetIn;
  }

}
