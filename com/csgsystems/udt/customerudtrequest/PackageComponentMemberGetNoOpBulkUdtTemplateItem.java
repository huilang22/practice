/*
 * Generated code DO NOT EDIT
 * Generated file: PackageComponentMemberGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PackageComponentMemberGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PackageComponentMemberGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PCMObjectData noOpIn;

/**
 *
 * Constructor to create a   PackageComponentMemberGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PackageComponentMemberGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PCMObjectData noOpInIn) {
    super(id, context, "PackageComponentMemberGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("PackageComponentMember", PCMObjectHelper.toMap(noOpIn, new HashMap(), "PackageComponentMember").get("PackageComponentMember"));
    }
  }
/**
 *
 * Sets the  PackageComponentMember
 * @param noOpInIn PCMObjectData to set
 *
 */
  public void setPackageComponentMember(PCMObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PackageComponentMember passed into the constructor
 * @return Simulated response
 *
 */
  public PCMObjectData getPackageComponentMember() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PCMObjectHelper.fromMap(inputMap, "PackageComponentMember");
  }
}
