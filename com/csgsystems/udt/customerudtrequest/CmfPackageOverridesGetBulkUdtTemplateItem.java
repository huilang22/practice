/*
 * Generated code DO NOT EDIT
 * Generated file: CmfPackageOverridesGetBulkUdtTemplateItem.java
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
 * Class used to create a CmfPackageOverridesGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CmfPackageOverridesGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PackageOverridesObjectKeyData CPOgIn;
/**
 *
 * Constructor to create a  CmfPackageOverridesGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CmfPackageOverridesGetBulkUdtTemplateItem(String id, BSDMSessionContext context, PackageOverridesObjectKeyData CPOgInIn) {
    super(id, context, "CmfPackageOverridesGet");
    CPOgIn = CPOgInIn;
  }

  public void translateToMap() {
    if (CPOgIn != null) {
      CPOgIn.resetFlags(true, true);
      addInput("CmfPackageOverrides", PackageOverridesObjectKeyHelper.toMap(CPOgIn, new HashMap(), "PackageOverridesObjectKeyData").get("PackageOverridesObjectKeyData"));
    }
  }


/**
 *
 * Sets the CmfPackageOverrides
 * @param CPOgInIn Value of the CPOgIn
 *
 */

  public void setCmfPackageOverrides(PackageOverridesObjectKeyData CPOgInIn) {
    CPOgIn = CPOgInIn;
  }

  public void translateFromMap() {
    CPOgIn = PackageOverridesObjectKeyHelper.fromMap(inputMap, "CmfPackageOverrides");
  }

/**
 *
 * Gets the CmfPackageOverrides
 * @return Value of the CmfPackageOverrides
 *
 */

  public PackageOverridesObjectKeyData getCmfPackageOverrides( ) {
    return CPOgIn;
  }

}
