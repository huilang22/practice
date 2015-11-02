/*
 * Generated code DO NOT EDIT
 * Generated file: PackageComponentMemberDeleteBulkUdtTemplateItem.java
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
 * Class used to create a PackageComponentMemberDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class PackageComponentMemberDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PCMObjectKeyData PCMDeleteIn;
/**
 *
 * Constructor to create a  PackageComponentMemberDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PackageComponentMemberDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, PCMObjectKeyData PCMDeleteInIn) {
    super(id, context, "PackageComponentMemberDelete");
    PCMDeleteIn = PCMDeleteInIn;
  }

  public void translateToMap() {
    if (PCMDeleteIn != null) {
      PCMDeleteIn.resetFlags(true, true);
      addInput("PackageComponentMember", PCMObjectKeyHelper.toMap(PCMDeleteIn, new HashMap(), "PCMObjectKeyData").get("PCMObjectKeyData"));
    }
  }


/**
 *
 * Sets the PackageComponentMember
 * @param PCMDeleteInIn Value of the PCMDeleteIn
 *
 */

  public void setPackageComponentMember(PCMObjectKeyData PCMDeleteInIn) {
    PCMDeleteIn = PCMDeleteInIn;
  }

  public void translateFromMap() {
    PCMDeleteIn = PCMObjectKeyHelper.fromMap(inputMap, "PackageComponentMember");
  }

/**
 *
 * Gets the PackageComponentMember
 * @return Value of the PackageComponentMember
 *
 */

  public PCMObjectKeyData getPackageComponentMember( ) {
    return PCMDeleteIn;
  }

}
