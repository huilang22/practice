/*
 * Generated code DO NOT EDIT
 * Generated file: PackageComponentMemberGetPCNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PackageComponentMemberGetPCNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PackageComponentMemberGetPCNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PCPCMObjectData noOpIn;

/**
 *
 * Constructor to create a   PackageComponentMemberGetPCNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PackageComponentMemberGetPCNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PCPCMObjectData noOpInIn) {
    super(id, context, "PackageComponentMemberGetPC");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("PackageComponentMember", PCPCMObjectHelper.toMap(noOpIn, new HashMap(), "PackageComponentMember").get("PackageComponentMember"));
    }
  }
/**
 *
 * Sets the  PackageComponentMember
 * @param noOpInIn PCPCMObjectData to set
 *
 */
  public void setPackageComponentMember(PCPCMObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PackageComponentMember passed into the constructor
 * @return Simulated response
 *
 */
  public PCPCMObjectData getPackageComponentMember() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PCPCMObjectHelper.fromMap(inputMap, "PackageComponentMember");
  }
}
