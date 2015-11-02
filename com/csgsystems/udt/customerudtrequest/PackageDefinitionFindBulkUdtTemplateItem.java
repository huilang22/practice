/*
 * Generated code DO NOT EDIT
 * Generated file: PackageDefinitionFindBulkUdtTemplateItem.java
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
 * Class used to create a PackageDefinitionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class PackageDefinitionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PDObjectFilter PDFindIn;
/**
 *
 * Constructor to create a  PackageDefinitionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PackageDefinitionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, PDObjectFilter PDFindInIn) {
    super(id, context, "PackageDefinitionFind");
    PDFindIn = PDFindInIn;
  }

  public void translateToMap() {
    if (PDFindIn != null) {
      Integer index =  PDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PackageDefinition", PDObjectHelper.toMap(PDFindIn, new HashMap(), "PackageDefinition").get("PackageDefinition"));
    }
  }


/**
 *
 * Sets the PackageDefinition
 * @param PDFindInIn Value of the PDFindIn
 *
 */

  public void setPackageDefinition(PDObjectFilter PDFindInIn) {
    PDFindIn = PDFindInIn;
  }

  public void translateFromMap() {
    PDFindIn = PDObjectHelper.fromMapFilter(inputMap, "PackageDefinition");
  }

/**
 *
 * Gets the PackageDefinition
 * @return Value of the PackageDefinition
 *
 */

  public PDObjectFilter getPackageDefinition( ) {
    return PDFindIn;
  }

}
