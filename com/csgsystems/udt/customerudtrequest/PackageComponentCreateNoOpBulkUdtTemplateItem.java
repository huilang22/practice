/*
 * Generated code DO NOT EDIT
 * Generated file: PackageComponentCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PackageComponentCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PackageComponentCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PCObjectData noOpIn;

/**
 *
 * Constructor to create a   PackageComponentCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PackageComponentCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PCObjectData noOpInIn) {
    super(id, context, "PackageComponentCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("PackageComponent", PCObjectHelper.toMap(noOpIn, new HashMap(), "PackageComponent").get("PackageComponent"));
    }
  }
/**
 *
 * Sets the  PackageComponent
 * @param noOpInIn PCObjectData to set
 *
 */
  public void setPackageComponent(PCObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PackageComponent passed into the constructor
 * @return Simulated response
 *
 */
  public PCObjectData getPackageComponent() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PCObjectHelper.fromMap(inputMap, "PackageComponent");
  }
}
