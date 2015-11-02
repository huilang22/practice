/*
 * Generated code DO NOT EDIT
 * Generated file: PackageComponentMemberFindBulkUdtTemplateItem.java
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
 * Class used to create a PackageComponentMemberFindBulkUdtTemplateItem Bulk Template
 *
 */

public class PackageComponentMemberFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PCMObjectFilter PCMFindIn;
/**
 *
 * Constructor to create a  PackageComponentMemberFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PackageComponentMemberFindBulkUdtTemplateItem(String id, BSDMSessionContext context, PCMObjectFilter PCMFindInIn) {
    super(id, context, "PackageComponentMemberFind");
    PCMFindIn = PCMFindInIn;
  }

  public void translateToMap() {
    if (PCMFindIn != null) {
      Integer index =  PCMFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PackageComponentMember", PCMObjectHelper.toMap(PCMFindIn, new HashMap(), "PackageComponentMember").get("PackageComponentMember"));
    }
  }


/**
 *
 * Sets the PackageComponentMember
 * @param PCMFindInIn Value of the PCMFindIn
 *
 */

  public void setPackageComponentMember(PCMObjectFilter PCMFindInIn) {
    PCMFindIn = PCMFindInIn;
  }

  public void translateFromMap() {
    PCMFindIn = PCMObjectHelper.fromMapFilter(inputMap, "PackageComponentMember");
  }

/**
 *
 * Gets the PackageComponentMember
 * @return Value of the PackageComponentMember
 *
 */

  public PCMObjectFilter getPackageComponentMember( ) {
    return PCMFindIn;
  }

}
