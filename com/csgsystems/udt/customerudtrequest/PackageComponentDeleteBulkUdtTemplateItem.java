/*
 * Generated code DO NOT EDIT
 * Generated file: PackageComponentDeleteBulkUdtTemplateItem.java
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
 * Class used to create a PackageComponentDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class PackageComponentDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PCObjectKeyData PCDeleteIn;
/**
 *
 * Constructor to create a  PackageComponentDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PackageComponentDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, PCObjectKeyData PCDeleteInIn) {
    super(id, context, "PackageComponentDelete");
    PCDeleteIn = PCDeleteInIn;
  }

  public void translateToMap() {
    if (PCDeleteIn != null) {
      PCDeleteIn.resetFlags(true, true);
      addInput("PackageComponent", PCObjectKeyHelper.toMap(PCDeleteIn, new HashMap(), "PCObjectKeyData").get("PCObjectKeyData"));
    }
  }


/**
 *
 * Sets the PackageComponent
 * @param PCDeleteInIn Value of the PCDeleteIn
 *
 */

  public void setPackageComponent(PCObjectKeyData PCDeleteInIn) {
    PCDeleteIn = PCDeleteInIn;
  }

  public void translateFromMap() {
    PCDeleteIn = PCObjectKeyHelper.fromMap(inputMap, "PackageComponent");
  }

/**
 *
 * Gets the PackageComponent
 * @return Value of the PackageComponent
 *
 */

  public PCObjectKeyData getPackageComponent( ) {
    return PCDeleteIn;
  }

}
