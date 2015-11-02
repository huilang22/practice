/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRestrictionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a UnitCrRestrictionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class UnitCrRestrictionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnitCrRestrictionObjectData UnitCrRestrictionUpdateIn;
  protected UnitCrRestrictionObjectFilter UnitCrRestrictionUpdateFilter;
  protected UnitCrRestrictionObjectData UnitCrRestrictionUpdateGet;
/**
 *
 * Constructor to create a  UnitCrRestrictionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnitCrRestrictionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrRestrictionObjectData UnitCrRestrictionUpdateInIn, UnitCrRestrictionObjectFilter UnitCrRestrictionUpdateFilterIn, UnitCrRestrictionObjectData UnitCrRestrictionUpdateGetIn) {
    super(id, context, "UnitCrRestrictionUpdate");
    UnitCrRestrictionUpdateIn = UnitCrRestrictionUpdateInIn;
    UnitCrRestrictionUpdateFilter = UnitCrRestrictionUpdateFilterIn;
    UnitCrRestrictionUpdateGet = UnitCrRestrictionUpdateGetIn;
  }

  public void translateToMap() {
    if (UnitCrRestrictionUpdateIn != null) {
      UnitCrRestrictionUpdateIn.resetFlags(true, true);
      addInput("UnitCrRestriction", UnitCrRestrictionObjectHelper.toMap(UnitCrRestrictionUpdateIn, new HashMap(), "UnitCrRestriction").get("UnitCrRestriction"));
    }
    if (UnitCrRestrictionUpdateFilter != null) {
      Integer index =  UnitCrRestrictionUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnitCrRestrictionUpdateFilter", UnitCrRestrictionObjectHelper.toMap(UnitCrRestrictionUpdateFilter, new HashMap(), "UnitCrRestriction").get("UnitCrRestriction"));
    }
    if (UnitCrRestrictionUpdateGet != null) {
      UnitCrRestrictionUpdateGet.resetFlags(true, true);
      addInput("UnitCrRestrictionUpdateGet", UnitCrRestrictionObjectHelper.toMap(UnitCrRestrictionUpdateGet, new HashMap(), "UnitCrRestriction").get("UnitCrRestriction"));
    }
  }


/**
 *
 * Sets the UnitCrRestriction
 * @param UnitCrRestrictionUpdateInIn Value of the UnitCrRestrictionUpdateIn
 *
 */

  public void setUnitCrRestriction(UnitCrRestrictionObjectData UnitCrRestrictionUpdateInIn) {
    UnitCrRestrictionUpdateIn = UnitCrRestrictionUpdateInIn;
  }

/**
 *
 * Sets the UnitCrRestrictionUpdateFilter
 * @param UnitCrRestrictionUpdateFilterIn Value of the UnitCrRestrictionUpdateFilter
 *
 */

  public void setUnitCrRestrictionUpdateFilter(UnitCrRestrictionObjectFilter UnitCrRestrictionUpdateFilterIn) {
    UnitCrRestrictionUpdateFilter = UnitCrRestrictionUpdateFilterIn;
  }

/**
 *
 * Sets the UnitCrRestrictionUpdateGet
 * @param UnitCrRestrictionUpdateGetIn Value of the UnitCrRestrictionUpdateGet
 *
 */

  public void setUnitCrRestrictionUpdateGet(UnitCrRestrictionObjectData UnitCrRestrictionUpdateGetIn) {
    UnitCrRestrictionUpdateGet = UnitCrRestrictionUpdateGetIn;
  }

  public void translateFromMap() {
    UnitCrRestrictionUpdateIn = UnitCrRestrictionObjectHelper.fromMap(inputMap, "UnitCrRestriction");
    UnitCrRestrictionUpdateFilter = UnitCrRestrictionObjectHelper.fromMapFilter(inputMap, "UnitCrRestrictionUpdateFilter");
    UnitCrRestrictionUpdateGet = UnitCrRestrictionObjectHelper.fromMap(inputMap, "UnitCrRestrictionUpdateGet");
  }

/**
 *
 * Gets the UnitCrRestriction
 * @return Value of the UnitCrRestriction
 *
 */

  public UnitCrRestrictionObjectData getUnitCrRestriction( ) {
    return UnitCrRestrictionUpdateIn;
  }

/**
 *
 * Gets the UnitCrRestrictionUpdateFilter
 * @return Value of the UnitCrRestrictionUpdateFilter
 *
 */

  public UnitCrRestrictionObjectFilter getUnitCrRestrictionUpdateFilter( ) {
    return UnitCrRestrictionUpdateFilter;
  }

/**
 *
 * Gets the UnitCrRestrictionUpdateGet
 * @return Value of the UnitCrRestrictionUpdateGet
 *
 */

  public UnitCrRestrictionObjectData getUnitCrRestrictionUpdateGet( ) {
    return UnitCrRestrictionUpdateGet;
  }

}
