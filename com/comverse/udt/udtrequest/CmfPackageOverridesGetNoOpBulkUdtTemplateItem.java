/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfPackageOverridesGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CmfPackageOverridesGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CmfPackageOverridesGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PackageOverridesObjectData noOpIn;

/**
 *
 * Constructor to create a   CmfPackageOverridesGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CmfPackageOverridesGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PackageOverridesObjectData noOpInIn) {
    super(id, context, "CmfPackageOverridesGet");
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
