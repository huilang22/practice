/*
 * Generated code DO NOT EDIT
 * Generated file: PackageComponentMemberUpdateBulkUdtTemplateItem.java
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
 * Class used to create a PackageComponentMemberUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class PackageComponentMemberUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PCMObjectData PCMUpdateIn;
  protected PCMObjectFilter PCMUpdateFilter;
  protected PCMObjectData PCMUpdateGet;
/**
 *
 * Constructor to create a  PackageComponentMemberUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PackageComponentMemberUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, PCMObjectData PCMUpdateInIn, PCMObjectFilter PCMUpdateFilterIn, PCMObjectData PCMUpdateGetIn) {
    super(id, context, "PackageComponentMemberUpdate");
    PCMUpdateIn = PCMUpdateInIn;
    PCMUpdateFilter = PCMUpdateFilterIn;
    PCMUpdateGet = PCMUpdateGetIn;
  }

  public void translateToMap() {
    if (PCMUpdateIn != null) {
      PCMUpdateIn.resetFlags(true, true);
      addInput("PackageComponentMember", PCMObjectHelper.toMap(PCMUpdateIn, new HashMap(), "PackageComponentMember").get("PackageComponentMember"));
    }
    if (PCMUpdateFilter != null) {
      Integer index =  PCMUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PCMUpdateFilter", PCMObjectHelper.toMap(PCMUpdateFilter, new HashMap(), "PackageComponentMember").get("PackageComponentMember"));
    }
    if (PCMUpdateGet != null) {
      PCMUpdateGet.resetFlags(true, true);
      addInput("PCMUpdateGet", PCMObjectHelper.toMap(PCMUpdateGet, new HashMap(), "PackageComponentMember").get("PackageComponentMember"));
    }
  }


/**
 *
 * Sets the PackageComponentMember
 * @param PCMUpdateInIn Value of the PCMUpdateIn
 *
 */

  public void setPackageComponentMember(PCMObjectData PCMUpdateInIn) {
    PCMUpdateIn = PCMUpdateInIn;
  }

/**
 *
 * Sets the PCMUpdateFilter
 * @param PCMUpdateFilterIn Value of the PCMUpdateFilter
 *
 */

  public void setPCMUpdateFilter(PCMObjectFilter PCMUpdateFilterIn) {
    PCMUpdateFilter = PCMUpdateFilterIn;
  }

/**
 *
 * Sets the PCMUpdateGet
 * @param PCMUpdateGetIn Value of the PCMUpdateGet
 *
 */

  public void setPCMUpdateGet(PCMObjectData PCMUpdateGetIn) {
    PCMUpdateGet = PCMUpdateGetIn;
  }

  public void translateFromMap() {
    PCMUpdateIn = PCMObjectHelper.fromMap(inputMap, "PackageComponentMember");
    PCMUpdateFilter = PCMObjectHelper.fromMapFilter(inputMap, "PCMUpdateFilter");
    PCMUpdateGet = PCMObjectHelper.fromMap(inputMap, "PCMUpdateGet");
  }

/**
 *
 * Gets the PackageComponentMember
 * @return Value of the PackageComponentMember
 *
 */

  public PCMObjectData getPackageComponentMember( ) {
    return PCMUpdateIn;
  }

/**
 *
 * Gets the PCMUpdateFilter
 * @return Value of the PCMUpdateFilter
 *
 */

  public PCMObjectFilter getPCMUpdateFilter( ) {
    return PCMUpdateFilter;
  }

/**
 *
 * Gets the PCMUpdateGet
 * @return Value of the PCMUpdateGet
 *
 */

  public PCMObjectData getPCMUpdateGet( ) {
    return PCMUpdateGet;
  }

}
