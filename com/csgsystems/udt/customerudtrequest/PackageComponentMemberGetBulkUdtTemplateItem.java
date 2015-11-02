/*
 * Generated code DO NOT EDIT
 * Generated file: PackageComponentMemberGetBulkUdtTemplateItem.java
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
 * Class used to create a PackageComponentMemberGetBulkUdtTemplateItem Bulk Template
 *
 */

public class PackageComponentMemberGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PCMObjectKeyData PCMGetIn;
/**
 *
 * Constructor to create a  PackageComponentMemberGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PackageComponentMemberGetBulkUdtTemplateItem(String id, BSDMSessionContext context, PCMObjectKeyData PCMGetInIn) {
    super(id, context, "PackageComponentMemberGet");
    PCMGetIn = PCMGetInIn;
  }

  public void translateToMap() {
    if (PCMGetIn != null) {
      PCMGetIn.resetFlags(true, true);
      addInput("PackageComponentMember", PCMObjectKeyHelper.toMap(PCMGetIn, new HashMap(), "PCMObjectKeyData").get("PCMObjectKeyData"));
    }
  }


/**
 *
 * Sets the PackageComponentMember
 * @param PCMGetInIn Value of the PCMGetIn
 *
 */

  public void setPackageComponentMember(PCMObjectKeyData PCMGetInIn) {
    PCMGetIn = PCMGetInIn;
  }

  public void translateFromMap() {
    PCMGetIn = PCMObjectKeyHelper.fromMap(inputMap, "PackageComponentMember");
  }

/**
 *
 * Gets the PackageComponentMember
 * @return Value of the PackageComponentMember
 *
 */

  public PCMObjectKeyData getPackageComponentMember( ) {
    return PCMGetIn;
  }

}
