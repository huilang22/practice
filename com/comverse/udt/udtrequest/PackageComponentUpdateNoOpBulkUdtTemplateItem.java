/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a PackageComponentUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PackageComponentUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PCObjectData noOpIn;

/**
 *
 * Constructor to create a   PackageComponentUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PackageComponentUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PCObjectData noOpInIn) {
    super(id, context, "PackageComponentUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("PackageComponent", PCObjectHelper.toMap(noOpIn, new HashMap(), "PackageComponent").get("PackageComponent"));
    }
  }
/**
 *
 * Sets the  PackageComponent
 * @param noOpInIn PCObjectData to set
 *
 */
  public void setPackageComponent(PCObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PackageComponent passed into the constructor
 * @return Simulated response
 *
 */
  public PCObjectData getPackageComponent() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PCObjectHelper.fromMap(inputMap, "PackageComponent");
  }
}
