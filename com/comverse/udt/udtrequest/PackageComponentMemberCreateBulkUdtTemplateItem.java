/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentMemberCreateBulkUdtTemplateItem.java
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
 * Class used to create a PackageComponentMemberCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class PackageComponentMemberCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PCMObjectData PCMCreateIn;
/**
 *
 * Constructor to create a  PackageComponentMemberCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PackageComponentMemberCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, PCMObjectData PCMCreateInIn) {
    super(id, context, "PackageComponentMemberCreate");
    PCMCreateIn = PCMCreateInIn;
  }

  public void translateToMap() {
    if (PCMCreateIn != null) {
      PCMCreateIn.resetFlags(true, true);
      addInput("PackageComponentMember", PCMObjectHelper.toMap(PCMCreateIn, new HashMap(), "PackageComponentMember").get("PackageComponentMember"));
    }
  }


/**
 *
 * Sets the PackageComponentMember
 * @param PCMCreateInIn Value of the PCMCreateIn
 *
 */

  public void setPackageComponentMember(PCMObjectData PCMCreateInIn) {
    PCMCreateIn = PCMCreateInIn;
  }

  public void translateFromMap() {
    PCMCreateIn = PCMObjectHelper.fromMap(inputMap, "PackageComponentMember");
  }

/**
 *
 * Gets the PackageComponentMember
 * @return Value of the PackageComponentMember
 *
 */

  public PCMObjectData getPackageComponentMember( ) {
    return PCMCreateIn;
  }

}
