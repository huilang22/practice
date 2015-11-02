/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SvcCmfPackageFindBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a SvcCmfPackageFindBulkUdtTemplateItem Bulk Template
 *
 */

public class SvcCmfPackageFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SvcCmfPackageObjectFilter SvcCmfPackageFindIn;
/**
 *
 * Constructor to create a  SvcCmfPackageFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SvcCmfPackageFindBulkUdtTemplateItem(String id, BSDMSessionContext context, SvcCmfPackageObjectFilter SvcCmfPackageFindInIn) {
    super(id, context, "SvcCmfPackageFind");
    SvcCmfPackageFindIn = SvcCmfPackageFindInIn;
  }

  public void translateToMap() {
    if (SvcCmfPackageFindIn != null) {
      Integer index =  SvcCmfPackageFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("SvcCmfPackage", SvcCmfPackageObjectHelper.toMap(SvcCmfPackageFindIn, new HashMap(), "SvcCmfPackage").get("SvcCmfPackage"));
    }
  }


/**
 *
 * Sets the SvcCmfPackage
 * @param SvcCmfPackageFindInIn Value of the SvcCmfPackageFindIn
 *
 */

  public void setSvcCmfPackage(SvcCmfPackageObjectFilter SvcCmfPackageFindInIn) {
    SvcCmfPackageFindIn = SvcCmfPackageFindInIn;
  }

  public void translateFromMap() {
    SvcCmfPackageFindIn = SvcCmfPackageObjectHelper.fromMapFilter(inputMap, "SvcCmfPackage");
  }

/**
 *
 * Gets the SvcCmfPackage
 * @return Value of the SvcCmfPackage
 *
 */

  public SvcCmfPackageObjectFilter getSvcCmfPackage( ) {
    return SvcCmfPackageFindIn;
  }

}
