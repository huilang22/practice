/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentUpdateBulkUdtTemplateItem.java
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
 * Class used to create a PackageComponentUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class PackageComponentUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PCObjectData PCUpdateIn;
  protected PCObjectFilter PCUpdateFilter;
  protected PCObjectData PCUpdateGet;
/**
 *
 * Constructor to create a  PackageComponentUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PackageComponentUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, PCObjectData PCUpdateInIn, PCObjectFilter PCUpdateFilterIn, PCObjectData PCUpdateGetIn) {
    super(id, context, "PackageComponentUpdate");
    PCUpdateIn = PCUpdateInIn;
    PCUpdateFilter = PCUpdateFilterIn;
    PCUpdateGet = PCUpdateGetIn;
  }

  public void translateToMap() {
    if (PCUpdateIn != null) {
      PCUpdateIn.resetFlags(true, true);
      addInput("PackageComponent", PCObjectHelper.toMap(PCUpdateIn, new HashMap(), "PackageComponent").get("PackageComponent"));
    }
    if (PCUpdateFilter != null) {
      Integer index =  PCUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PCUpdateFilter", PCObjectHelper.toMap(PCUpdateFilter, new HashMap(), "PackageComponent").get("PackageComponent"));
    }
    if (PCUpdateGet != null) {
      PCUpdateGet.resetFlags(true, true);
      addInput("PCUpdateGet", PCObjectHelper.toMap(PCUpdateGet, new HashMap(), "PackageComponent").get("PackageComponent"));
    }
  }


/**
 *
 * Sets the PackageComponent
 * @param PCUpdateInIn Value of the PCUpdateIn
 *
 */

  public void setPackageComponent(PCObjectData PCUpdateInIn) {
    PCUpdateIn = PCUpdateInIn;
  }

/**
 *
 * Sets the PCUpdateFilter
 * @param PCUpdateFilterIn Value of the PCUpdateFilter
 *
 */

  public void setPCUpdateFilter(PCObjectFilter PCUpdateFilterIn) {
    PCUpdateFilter = PCUpdateFilterIn;
  }

/**
 *
 * Sets the PCUpdateGet
 * @param PCUpdateGetIn Value of the PCUpdateGet
 *
 */

  public void setPCUpdateGet(PCObjectData PCUpdateGetIn) {
    PCUpdateGet = PCUpdateGetIn;
  }

  public void translateFromMap() {
    PCUpdateIn = PCObjectHelper.fromMap(inputMap, "PackageComponent");
    PCUpdateFilter = PCObjectHelper.fromMapFilter(inputMap, "PCUpdateFilter");
    PCUpdateGet = PCObjectHelper.fromMap(inputMap, "PCUpdateGet");
  }

/**
 *
 * Gets the PackageComponent
 * @return Value of the PackageComponent
 *
 */

  public PCObjectData getPackageComponent( ) {
    return PCUpdateIn;
  }

/**
 *
 * Gets the PCUpdateFilter
 * @return Value of the PCUpdateFilter
 *
 */

  public PCObjectFilter getPCUpdateFilter( ) {
    return PCUpdateFilter;
  }

/**
 *
 * Gets the PCUpdateGet
 * @return Value of the PCUpdateGet
 *
 */

  public PCObjectData getPCUpdateGet( ) {
    return PCUpdateGet;
  }

}
