/*
 * Generated code DO NOT EDIT
 * Generated file: PackageDefinitionDeleteBulkUdtTemplateItem.java
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
 * Class used to create a PackageDefinitionDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class PackageDefinitionDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PDObjectKeyData PDDeleteIn;
/**
 *
 * Constructor to create a  PackageDefinitionDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PackageDefinitionDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, PDObjectKeyData PDDeleteInIn) {
    super(id, context, "PackageDefinitionDelete");
    PDDeleteIn = PDDeleteInIn;
  }

  public void translateToMap() {
    if (PDDeleteIn != null) {
      PDDeleteIn.resetFlags(true, true);
      addInput("PackageDefinition", PDObjectKeyHelper.toMap(PDDeleteIn, new HashMap(), "PDObjectKeyData").get("PDObjectKeyData"));
    }
  }


/**
 *
 * Sets the PackageDefinition
 * @param PDDeleteInIn Value of the PDDeleteIn
 *
 */

  public void setPackageDefinition(PDObjectKeyData PDDeleteInIn) {
    PDDeleteIn = PDDeleteInIn;
  }

  public void translateFromMap() {
    PDDeleteIn = PDObjectKeyHelper.fromMap(inputMap, "PackageDefinition");
  }

/**
 *
 * Gets the PackageDefinition
 * @return Value of the PackageDefinition
 *
 */

  public PDObjectKeyData getPackageDefinition( ) {
    return PDDeleteIn;
  }

}
