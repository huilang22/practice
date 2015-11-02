/*
 * Generated code DO NOT EDIT
 * Generated file: PackageDefinitionDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PackageDefinitionDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PackageDefinitionDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PDObjectData noOpIn;

/**
 *
 * Constructor to create a   PackageDefinitionDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PackageDefinitionDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PDObjectData noOpInIn) {
    super(id, context, "PackageDefinitionDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("PackageDefinition", PDObjectHelper.toMap(noOpIn, new HashMap(), "PackageDefinition").get("PackageDefinition"));
    }
  }
/**
 *
 * Sets the  PackageDefinition
 * @param noOpInIn PDObjectData to set
 *
 */
  public void setPackageDefinition(PDObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PackageDefinition passed into the constructor
 * @return Simulated response
 *
 */
  public PDObjectData getPackageDefinition() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PDObjectHelper.fromMap(inputMap, "PackageDefinition");
  }
}
