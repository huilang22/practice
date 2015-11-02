/*
 * Generated code DO NOT EDIT
 * Generated file: PackageGroupCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a PackageGroupCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PackageGroupCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PGObjectData noOpIn;

/**
 *
 * Constructor to create a   PackageGroupCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PackageGroupCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PGObjectData noOpInIn) {
    super(id, context, "PackageGroupCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("PackageGroup", PGObjectHelper.toMap(noOpIn, new HashMap(), "PackageGroup").get("PackageGroup"));
    }
  }
/**
 *
 * Sets the  PackageGroup
 * @param noOpInIn PGObjectData to set
 *
 */
  public void setPackageGroup(PGObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PackageGroup passed into the constructor
 * @return Simulated response
 *
 */
  public PGObjectData getPackageGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PGObjectHelper.fromMap(inputMap, "PackageGroup");
  }
}
