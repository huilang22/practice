/*
 * Generated code DO NOT EDIT
 * Generated file: PackageDefinitionGetBulkUdtTemplateItem.java
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
 * Class used to create a PackageDefinitionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class PackageDefinitionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PDObjectKeyData PDGetIn;
/**
 *
 * Constructor to create a  PackageDefinitionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PackageDefinitionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, PDObjectKeyData PDGetInIn) {
    super(id, context, "PackageDefinitionGet");
    PDGetIn = PDGetInIn;
  }

  public void translateToMap() {
    if (PDGetIn != null) {
      PDGetIn.resetFlags(true, true);
      addInput("PackageDefinition", PDObjectKeyHelper.toMap(PDGetIn, new HashMap(), "PDObjectKeyData").get("PDObjectKeyData"));
    }
  }


/**
 *
 * Sets the PackageDefinition
 * @param PDGetInIn Value of the PDGetIn
 *
 */

  public void setPackageDefinition(PDObjectKeyData PDGetInIn) {
    PDGetIn = PDGetInIn;
  }

  public void translateFromMap() {
    PDGetIn = PDObjectKeyHelper.fromMap(inputMap, "PackageDefinition");
  }

/**
 *
 * Gets the PackageDefinition
 * @return Value of the PackageDefinition
 *
 */

  public PDObjectKeyData getPackageDefinition( ) {
    return PDGetIn;
  }

}
