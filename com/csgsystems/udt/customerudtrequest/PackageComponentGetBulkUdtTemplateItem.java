/*
 * Generated code DO NOT EDIT
 * Generated file: PackageComponentGetBulkUdtTemplateItem.java
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
 * Class used to create a PackageComponentGetBulkUdtTemplateItem Bulk Template
 *
 */

public class PackageComponentGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PCObjectKeyData PCGetIn;
/**
 *
 * Constructor to create a  PackageComponentGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PackageComponentGetBulkUdtTemplateItem(String id, BSDMSessionContext context, PCObjectKeyData PCGetInIn) {
    super(id, context, "PackageComponentGet");
    PCGetIn = PCGetInIn;
  }

  public void translateToMap() {
    if (PCGetIn != null) {
      PCGetIn.resetFlags(true, true);
      addInput("PackageComponent", PCObjectKeyHelper.toMap(PCGetIn, new HashMap(), "PCObjectKeyData").get("PCObjectKeyData"));
    }
  }


/**
 *
 * Sets the PackageComponent
 * @param PCGetInIn Value of the PCGetIn
 *
 */

  public void setPackageComponent(PCObjectKeyData PCGetInIn) {
    PCGetIn = PCGetInIn;
  }

  public void translateFromMap() {
    PCGetIn = PCObjectKeyHelper.fromMap(inputMap, "PackageComponent");
  }

/**
 *
 * Gets the PackageComponent
 * @return Value of the PackageComponent
 *
 */

  public PCObjectKeyData getPackageComponent( ) {
    return PCGetIn;
  }

}
