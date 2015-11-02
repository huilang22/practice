/*
 * Generated code DO NOT EDIT
 * Generated file: PackageGroupGetBulkUdtTemplateItem.java
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
 * Class used to create a PackageGroupGetBulkUdtTemplateItem Bulk Template
 *
 */

public class PackageGroupGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PGObjectKeyData PGGetIn;
/**
 *
 * Constructor to create a  PackageGroupGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PackageGroupGetBulkUdtTemplateItem(String id, BSDMSessionContext context, PGObjectKeyData PGGetInIn) {
    super(id, context, "PackageGroupGet");
    PGGetIn = PGGetInIn;
  }

  public void translateToMap() {
    if (PGGetIn != null) {
      PGGetIn.resetFlags(true, true);
      addInput("PackageGroup", PGObjectKeyHelper.toMap(PGGetIn, new HashMap(), "PGObjectKeyData").get("PGObjectKeyData"));
    }
  }


/**
 *
 * Sets the PackageGroup
 * @param PGGetInIn Value of the PGGetIn
 *
 */

  public void setPackageGroup(PGObjectKeyData PGGetInIn) {
    PGGetIn = PGGetInIn;
  }

  public void translateFromMap() {
    PGGetIn = PGObjectKeyHelper.fromMap(inputMap, "PackageGroup");
  }

/**
 *
 * Gets the PackageGroup
 * @return Value of the PackageGroup
 *
 */

  public PGObjectKeyData getPackageGroup( ) {
    return PGGetIn;
  }

}
