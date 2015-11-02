/*
 * Generated code DO NOT EDIT
 * Generated file: PackageComponentCreateBulkUdtTemplateItem.java
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
 * Class used to create a PackageComponentCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class PackageComponentCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PCObjectData PCCreateIn;
/**
 *
 * Constructor to create a  PackageComponentCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PackageComponentCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, PCObjectData PCCreateInIn) {
    super(id, context, "PackageComponentCreate");
    PCCreateIn = PCCreateInIn;
  }

  public void translateToMap() {
    if (PCCreateIn != null) {
      PCCreateIn.resetFlags(true, true);
      addInput("PackageComponent", PCObjectHelper.toMap(PCCreateIn, new HashMap(), "PackageComponent").get("PackageComponent"));
    }
  }


/**
 *
 * Sets the PackageComponent
 * @param PCCreateInIn Value of the PCCreateIn
 *
 */

  public void setPackageComponent(PCObjectData PCCreateInIn) {
    PCCreateIn = PCCreateInIn;
  }

  public void translateFromMap() {
    PCCreateIn = PCObjectHelper.fromMap(inputMap, "PackageComponent");
  }

/**
 *
 * Gets the PackageComponent
 * @return Value of the PackageComponent
 *
 */

  public PCObjectData getPackageComponent( ) {
    return PCCreateIn;
  }

}
