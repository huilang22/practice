/*
 * Generated code DO NOT EDIT
 * Generated file: CmfPackageOverridesUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CmfPackageOverridesUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CmfPackageOverridesUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PackageOverridesObjectData CPOuIn;
/**
 *
 * Constructor to create a  CmfPackageOverridesUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CmfPackageOverridesUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, PackageOverridesObjectData CPOuInIn) {
    super(id, context, "CmfPackageOverridesUpdate");
    CPOuIn = CPOuInIn;
  }

  public void translateToMap() {
    if (CPOuIn != null) {
      CPOuIn.resetFlags(true, true);
      addInput("CmfPackageOverrides", PackageOverridesObjectHelper.toMap(CPOuIn, new HashMap(), "CmfPackageOverrides").get("CmfPackageOverrides"));
    }
  }


/**
 *
 * Sets the CmfPackageOverrides
 * @param CPOuInIn Value of the CPOuIn
 *
 */

  public void setCmfPackageOverrides(PackageOverridesObjectData CPOuInIn) {
    CPOuIn = CPOuInIn;
  }

  public void translateFromMap() {
    CPOuIn = PackageOverridesObjectHelper.fromMap(inputMap, "CmfPackageOverrides");
  }

/**
 *
 * Gets the CmfPackageOverrides
 * @return Value of the CmfPackageOverrides
 *
 */

  public PackageOverridesObjectData getCmfPackageOverrides( ) {
    return CPOuIn;
  }

}
