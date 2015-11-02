/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfPackageOverridesDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a CmfPackageOverridesDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CmfPackageOverridesDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PackageOverridesObjectKeyData CPOdIn;
/**
 *
 * Constructor to create a  CmfPackageOverridesDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CmfPackageOverridesDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, PackageOverridesObjectKeyData CPOdInIn) {
    super(id, context, "CmfPackageOverridesDelete");
    CPOdIn = CPOdInIn;
  }

  public void translateToMap() {
    if (CPOdIn != null) {
      CPOdIn.resetFlags(true, true);
      addInput("CmfPackageOverrides", PackageOverridesObjectKeyHelper.toMap(CPOdIn, new HashMap(), "PackageOverridesObjectKeyData").get("PackageOverridesObjectKeyData"));
    }
  }


/**
 *
 * Sets the CmfPackageOverrides
 * @param CPOdInIn Value of the CPOdIn
 *
 */

  public void setCmfPackageOverrides(PackageOverridesObjectKeyData CPOdInIn) {
    CPOdIn = CPOdInIn;
  }

  public void translateFromMap() {
    CPOdIn = PackageOverridesObjectKeyHelper.fromMap(inputMap, "CmfPackageOverrides");
  }

/**
 *
 * Gets the CmfPackageOverrides
 * @return Value of the CmfPackageOverrides
 *
 */

  public PackageOverridesObjectKeyData getCmfPackageOverrides( ) {
    return CPOdIn;
  }

}
