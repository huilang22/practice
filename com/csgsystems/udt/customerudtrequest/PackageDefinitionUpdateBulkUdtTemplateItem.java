/*
 * Generated code DO NOT EDIT
 * Generated file: PackageDefinitionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a PackageDefinitionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class PackageDefinitionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PDObjectData PDUpdateIn;
/**
 *
 * Constructor to create a  PackageDefinitionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PackageDefinitionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, PDObjectData PDUpdateInIn) {
    super(id, context, "PackageDefinitionUpdate");
    PDUpdateIn = PDUpdateInIn;
  }

  public void translateToMap() {
    if (PDUpdateIn != null) {
      PDUpdateIn.resetFlags(true, true);
      addInput("PackageDefinition", PDObjectHelper.toMap(PDUpdateIn, new HashMap(), "PackageDefinition").get("PackageDefinition"));
    }
  }


/**
 *
 * Sets the PackageDefinition
 * @param PDUpdateInIn Value of the PDUpdateIn
 *
 */

  public void setPackageDefinition(PDObjectData PDUpdateInIn) {
    PDUpdateIn = PDUpdateInIn;
  }

  public void translateFromMap() {
    PDUpdateIn = PDObjectHelper.fromMap(inputMap, "PackageDefinition");
  }

/**
 *
 * Gets the PackageDefinition
 * @return Value of the PackageDefinition
 *
 */

  public PDObjectData getPackageDefinition( ) {
    return PDUpdateIn;
  }

}
