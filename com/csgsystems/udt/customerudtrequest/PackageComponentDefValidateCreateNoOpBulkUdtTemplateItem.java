/*
 * Generated code DO NOT EDIT
 * Generated file: PackageComponentDefValidateCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a PackageComponentDefValidateCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PackageComponentDefValidateCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PCDObjectData noOpIn;

/**
 *
 * Constructor to create a   PackageComponentDefValidateCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PackageComponentDefValidateCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PCDObjectData noOpInIn) {
    super(id, context, "PackageComponentDefValidateCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("PackageComponentDefValidate", PCDObjectHelper.toMap(noOpIn, new HashMap(), "PackageComponentDefValidate").get("PackageComponentDefValidate"));
    }
  }
/**
 *
 * Sets the  PackageComponentDefValidate
 * @param noOpInIn PCDObjectData to set
 *
 */
  public void setPackageComponentDefValidate(PCDObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PackageComponentDefValidate passed into the constructor
 * @return Simulated response
 *
 */
  public PCDObjectData getPackageComponentDefValidate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PCDObjectHelper.fromMap(inputMap, "PackageComponentDefValidate");
  }
}
