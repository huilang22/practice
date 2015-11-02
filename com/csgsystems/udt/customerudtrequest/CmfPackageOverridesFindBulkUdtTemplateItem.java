/*
 * Generated code DO NOT EDIT
 * Generated file: CmfPackageOverridesFindBulkUdtTemplateItem.java
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
 * Class used to create a CmfPackageOverridesFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CmfPackageOverridesFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PackageOverridesObjectFilter CPOfIn;
/**
 *
 * Constructor to create a  CmfPackageOverridesFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CmfPackageOverridesFindBulkUdtTemplateItem(String id, BSDMSessionContext context, PackageOverridesObjectFilter CPOfInIn) {
    super(id, context, "CmfPackageOverridesFind");
    CPOfIn = CPOfInIn;
  }

  public void translateToMap() {
    if (CPOfIn != null) {
      Integer index =  CPOfIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CmfPackageOverrides", PackageOverridesObjectHelper.toMap(CPOfIn, new HashMap(), "CmfPackageOverrides").get("CmfPackageOverrides"));
    }
  }


/**
 *
 * Sets the CmfPackageOverrides
 * @param CPOfInIn Value of the CPOfIn
 *
 */

  public void setCmfPackageOverrides(PackageOverridesObjectFilter CPOfInIn) {
    CPOfIn = CPOfInIn;
  }

  public void translateFromMap() {
    CPOfIn = PackageOverridesObjectHelper.fromMapFilter(inputMap, "CmfPackageOverrides");
  }

/**
 *
 * Gets the CmfPackageOverrides
 * @return Value of the CmfPackageOverrides
 *
 */

  public PackageOverridesObjectFilter getCmfPackageOverrides( ) {
    return CPOfIn;
  }

}
