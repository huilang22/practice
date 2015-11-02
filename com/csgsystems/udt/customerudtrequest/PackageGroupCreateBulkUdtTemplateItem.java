/*
 * Generated code DO NOT EDIT
 * Generated file: PackageGroupCreateBulkUdtTemplateItem.java
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
 * Class used to create a PackageGroupCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class PackageGroupCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PGObjectData PGCreateIn;
/**
 *
 * Constructor to create a  PackageGroupCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PackageGroupCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, PGObjectData PGCreateInIn) {
    super(id, context, "PackageGroupCreate");
    PGCreateIn = PGCreateInIn;
  }

  public void translateToMap() {
    if (PGCreateIn != null) {
      PGCreateIn.resetFlags(true, true);
      addInput("PackageGroup", PGObjectHelper.toMap(PGCreateIn, new HashMap(), "PackageGroup").get("PackageGroup"));
    }
  }


/**
 *
 * Sets the PackageGroup
 * @param PGCreateInIn Value of the PGCreateIn
 *
 */

  public void setPackageGroup(PGObjectData PGCreateInIn) {
    PGCreateIn = PGCreateInIn;
  }

  public void translateFromMap() {
    PGCreateIn = PGObjectHelper.fromMap(inputMap, "PackageGroup");
  }

/**
 *
 * Gets the PackageGroup
 * @return Value of the PackageGroup
 *
 */

  public PGObjectData getPackageGroup( ) {
    return PGCreateIn;
  }

}
