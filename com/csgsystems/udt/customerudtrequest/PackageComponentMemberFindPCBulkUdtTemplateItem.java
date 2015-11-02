/*
 * Generated code DO NOT EDIT
 * Generated file: PackageComponentMemberFindPCBulkUdtTemplateItem.java
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
 * Class used to create a PackageComponentMemberFindPCBulkUdtTemplateItem Bulk Template
 *
 */

public class PackageComponentMemberFindPCBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PCPCMObjectFilter PCPCMFindIn;
/**
 *
 * Constructor to create a  PackageComponentMemberFindPCBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PackageComponentMemberFindPCBulkUdtTemplateItem(String id, BSDMSessionContext context, PCPCMObjectFilter PCPCMFindInIn) {
    super(id, context, "PackageComponentMemberFindPC");
    PCPCMFindIn = PCPCMFindInIn;
  }

  public void translateToMap() {
    if (PCPCMFindIn != null) {
      Integer index =  PCPCMFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PackageComponentMember", PCPCMObjectHelper.toMap(PCPCMFindIn, new HashMap(), "PackageComponentMember").get("PackageComponentMember"));
    }
  }


/**
 *
 * Sets the PackageComponentMember
 * @param PCPCMFindInIn Value of the PCPCMFindIn
 *
 */

  public void setPackageComponentMember(PCPCMObjectFilter PCPCMFindInIn) {
    PCPCMFindIn = PCPCMFindInIn;
  }

  public void translateFromMap() {
    PCPCMFindIn = PCPCMObjectHelper.fromMapFilter(inputMap, "PackageComponentMember");
  }

/**
 *
 * Gets the PackageComponentMember
 * @return Value of the PackageComponentMember
 *
 */

  public PCPCMObjectFilter getPackageComponentMember( ) {
    return PCPCMFindIn;
  }

}
