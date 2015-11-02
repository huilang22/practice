/*
 * Generated code DO NOT EDIT
 * Generated file: PackageComponentMemberGetPCBulkUdtTemplateItem.java
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
 * Class used to create a PackageComponentMemberGetPCBulkUdtTemplateItem Bulk Template
 *
 */

public class PackageComponentMemberGetPCBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PCPCMObjectKeyData PCPCMGetIn;
/**
 *
 * Constructor to create a  PackageComponentMemberGetPCBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PackageComponentMemberGetPCBulkUdtTemplateItem(String id, BSDMSessionContext context, PCPCMObjectKeyData PCPCMGetInIn) {
    super(id, context, "PackageComponentMemberGetPC");
    PCPCMGetIn = PCPCMGetInIn;
  }

  public void translateToMap() {
    if (PCPCMGetIn != null) {
      PCPCMGetIn.resetFlags(true, true);
      addInput("PackageComponentMember", PCPCMObjectKeyHelper.toMap(PCPCMGetIn, new HashMap(), "PCPCMObjectKeyData").get("PCPCMObjectKeyData"));
    }
  }


/**
 *
 * Sets the PackageComponentMember
 * @param PCPCMGetInIn Value of the PCPCMGetIn
 *
 */

  public void setPackageComponentMember(PCPCMObjectKeyData PCPCMGetInIn) {
    PCPCMGetIn = PCPCMGetInIn;
  }

  public void translateFromMap() {
    PCPCMGetIn = PCPCMObjectKeyHelper.fromMap(inputMap, "PackageComponentMember");
  }

/**
 *
 * Gets the PackageComponentMember
 * @return Value of the PackageComponentMember
 *
 */

  public PCPCMObjectKeyData getPackageComponentMember( ) {
    return PCPCMGetIn;
  }

}
