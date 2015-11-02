/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentDefGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PackageComponentDefGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PackageComponentDefGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PCDObjectData noOpIn;

/**
 *
 * Constructor to create a   PackageComponentDefGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PackageComponentDefGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PCDObjectData noOpInIn) {
    super(id, context, "PackageComponentDefGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("PackageComponentDef", PCDObjectHelper.toMap(noOpIn, new HashMap(), "PackageComponentDef").get("PackageComponentDef"));
    }
  }
/**
 *
 * Sets the  PackageComponentDef
 * @param noOpInIn PCDObjectData to set
 *
 */
  public void setPackageComponentDef(PCDObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PackageComponentDef passed into the constructor
 * @return Simulated response
 *
 */
  public PCDObjectData getPackageComponentDef() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PCDObjectHelper.fromMap(inputMap, "PackageComponentDef");
  }
}
