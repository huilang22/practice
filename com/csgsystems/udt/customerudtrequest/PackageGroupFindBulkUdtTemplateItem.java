/*
 * Generated code DO NOT EDIT
 * Generated file: PackageGroupFindBulkUdtTemplateItem.java
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
 * Class used to create a PackageGroupFindBulkUdtTemplateItem Bulk Template
 *
 */

public class PackageGroupFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PGObjectFilter PGFindIn;
/**
 *
 * Constructor to create a  PackageGroupFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PackageGroupFindBulkUdtTemplateItem(String id, BSDMSessionContext context, PGObjectFilter PGFindInIn) {
    super(id, context, "PackageGroupFind");
    PGFindIn = PGFindInIn;
  }

  public void translateToMap() {
    if (PGFindIn != null) {
      Integer index =  PGFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PackageGroup", PGObjectHelper.toMap(PGFindIn, new HashMap(), "PackageGroup").get("PackageGroup"));
    }
  }


/**
 *
 * Sets the PackageGroup
 * @param PGFindInIn Value of the PGFindIn
 *
 */

  public void setPackageGroup(PGObjectFilter PGFindInIn) {
    PGFindIn = PGFindInIn;
  }

  public void translateFromMap() {
    PGFindIn = PGObjectHelper.fromMapFilter(inputMap, "PackageGroup");
  }

/**
 *
 * Gets the PackageGroup
 * @return Value of the PackageGroup
 *
 */

  public PGObjectFilter getPackageGroup( ) {
    return PGFindIn;
  }

}
