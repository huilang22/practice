/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageGroupUpdateBulkUdtTemplateItem.java
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
 * Class used to create a PackageGroupUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class PackageGroupUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PGObjectData PGUpdateIn;
/**
 *
 * Constructor to create a  PackageGroupUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PackageGroupUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, PGObjectData PGUpdateInIn) {
    super(id, context, "PackageGroupUpdate");
    PGUpdateIn = PGUpdateInIn;
  }

  public void translateToMap() {
    if (PGUpdateIn != null) {
      PGUpdateIn.resetFlags(true, true);
      addInput("PackageGroup", PGObjectHelper.toMap(PGUpdateIn, new HashMap(), "PackageGroup").get("PackageGroup"));
    }
  }


/**
 *
 * Sets the PackageGroup
 * @param PGUpdateInIn Value of the PGUpdateIn
 *
 */

  public void setPackageGroup(PGObjectData PGUpdateInIn) {
    PGUpdateIn = PGUpdateInIn;
  }

  public void translateFromMap() {
    PGUpdateIn = PGObjectHelper.fromMap(inputMap, "PackageGroup");
  }

/**
 *
 * Gets the PackageGroup
 * @return Value of the PackageGroup
 *
 */

  public PGObjectData getPackageGroup( ) {
    return PGUpdateIn;
  }

}
