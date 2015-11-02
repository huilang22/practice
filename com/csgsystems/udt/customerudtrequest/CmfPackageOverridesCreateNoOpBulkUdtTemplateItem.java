/*
 * Generated code DO NOT EDIT
 * Generated file: CmfPackageOverridesCreateNoOpBulkUdtTemplateItem.java
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

/**
 *
 * NoOp class used to simulate a CmfPackageOverridesCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CmfPackageOverridesCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PackageOverridesObjectData noOpIn;

/**
 *
 * Constructor to create a   CmfPackageOverridesCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CmfPackageOverridesCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PackageOverridesObjectData noOpInIn) {
    super(id, context, "CmfPackageOverridesCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CmfPackageOverrides", PackageOverridesObjectHelper.toMap(noOpIn, new HashMap(), "CmfPackageOverrides").get("CmfPackageOverrides"));
    }
  }
/**
 *
 * Sets the  CmfPackageOverrides
 * @param noOpInIn PackageOverridesObjectData to set
 *
 */
  public void setCmfPackageOverrides(PackageOverridesObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CmfPackageOverrides passed into the constructor
 * @return Simulated response
 *
 */
  public PackageOverridesObjectData getCmfPackageOverrides() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PackageOverridesObjectHelper.fromMap(inputMap, "CmfPackageOverrides");
  }
}
