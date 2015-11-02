/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfPackageOverridesCreateBulkUdtTemplateItem.java
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
 * Class used to create a CmfPackageOverridesCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CmfPackageOverridesCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PackageOverridesObjectData CPOcIn;
/**
 *
 * Constructor to create a  CmfPackageOverridesCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CmfPackageOverridesCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, PackageOverridesObjectData CPOcInIn) {
    super(id, context, "CmfPackageOverridesCreate");
    CPOcIn = CPOcInIn;
  }

  public void translateToMap() {
    if (CPOcIn != null) {
      CPOcIn.resetFlags(true, true);
      addInput("CmfPackageOverrides", PackageOverridesObjectHelper.toMap(CPOcIn, new HashMap(), "CmfPackageOverrides").get("CmfPackageOverrides"));
    }
  }


/**
 *
 * Sets the CmfPackageOverrides
 * @param CPOcInIn Value of the CPOcIn
 *
 */

  public void setCmfPackageOverrides(PackageOverridesObjectData CPOcInIn) {
    CPOcIn = CPOcInIn;
  }

  public void translateFromMap() {
    CPOcIn = PackageOverridesObjectHelper.fromMap(inputMap, "CmfPackageOverrides");
  }

/**
 *
 * Gets the CmfPackageOverrides
 * @return Value of the CmfPackageOverrides
 *
 */

  public PackageOverridesObjectData getCmfPackageOverrides( ) {
    return CPOcIn;
  }

}
