/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageDefinitionCreateBulkUdtTemplateItem.java
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
 * Class used to create a PackageDefinitionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class PackageDefinitionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PDObjectData PDCreateIn;
/**
 *
 * Constructor to create a  PackageDefinitionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PackageDefinitionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, PDObjectData PDCreateInIn) {
    super(id, context, "PackageDefinitionCreate");
    PDCreateIn = PDCreateInIn;
  }

  public void translateToMap() {
    if (PDCreateIn != null) {
      PDCreateIn.resetFlags(true, true);
      addInput("PackageDefinition", PDObjectHelper.toMap(PDCreateIn, new HashMap(), "PackageDefinition").get("PackageDefinition"));
    }
  }


/**
 *
 * Sets the PackageDefinition
 * @param PDCreateInIn Value of the PDCreateIn
 *
 */

  public void setPackageDefinition(PDObjectData PDCreateInIn) {
    PDCreateIn = PDCreateInIn;
  }

  public void translateFromMap() {
    PDCreateIn = PDObjectHelper.fromMap(inputMap, "PackageDefinition");
  }

/**
 *
 * Gets the PackageDefinition
 * @return Value of the PackageDefinition
 *
 */

  public PDObjectData getPackageDefinition( ) {
    return PDCreateIn;
  }

}
