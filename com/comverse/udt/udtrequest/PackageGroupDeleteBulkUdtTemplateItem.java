/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageGroupDeleteBulkUdtTemplateItem.java
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
 * Class used to create a PackageGroupDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class PackageGroupDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PGObjectKeyData PGDeleteIn;
/**
 *
 * Constructor to create a  PackageGroupDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PackageGroupDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, PGObjectKeyData PGDeleteInIn) {
    super(id, context, "PackageGroupDelete");
    PGDeleteIn = PGDeleteInIn;
  }

  public void translateToMap() {
    if (PGDeleteIn != null) {
      PGDeleteIn.resetFlags(true, true);
      addInput("PackageGroup", PGObjectKeyHelper.toMap(PGDeleteIn, new HashMap(), "PGObjectKeyData").get("PGObjectKeyData"));
    }
  }


/**
 *
 * Sets the PackageGroup
 * @param PGDeleteInIn Value of the PGDeleteIn
 *
 */

  public void setPackageGroup(PGObjectKeyData PGDeleteInIn) {
    PGDeleteIn = PGDeleteInIn;
  }

  public void translateFromMap() {
    PGDeleteIn = PGObjectKeyHelper.fromMap(inputMap, "PackageGroup");
  }

/**
 *
 * Gets the PackageGroup
 * @return Value of the PackageGroup
 *
 */

  public PGObjectKeyData getPackageGroup( ) {
    return PGDeleteIn;
  }

}
