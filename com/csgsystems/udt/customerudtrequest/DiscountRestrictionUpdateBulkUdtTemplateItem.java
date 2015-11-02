/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountRestrictionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a DiscountRestrictionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class DiscountRestrictionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DRObjectData DRUpdateIn;
  protected DRObjectFilter DRUpdateFilter;
  protected DRObjectData DRUpdateGet;
/**
 *
 * Constructor to create a  DiscountRestrictionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DiscountRestrictionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, DRObjectData DRUpdateInIn, DRObjectFilter DRUpdateFilterIn, DRObjectData DRUpdateGetIn) {
    super(id, context, "DiscountRestrictionUpdate");
    DRUpdateIn = DRUpdateInIn;
    DRUpdateFilter = DRUpdateFilterIn;
    DRUpdateGet = DRUpdateGetIn;
  }

  public void translateToMap() {
    if (DRUpdateIn != null) {
      DRUpdateIn.resetFlags(true, true);
      addInput("DiscountRestriction", DRObjectHelper.toMap(DRUpdateIn, new HashMap(), "DiscountRestriction").get("DiscountRestriction"));
    }
    if (DRUpdateFilter != null) {
      Integer index =  DRUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("DRUpdateFilter", DRObjectHelper.toMap(DRUpdateFilter, new HashMap(), "DiscountRestriction").get("DiscountRestriction"));
    }
    if (DRUpdateGet != null) {
      DRUpdateGet.resetFlags(true, true);
      addInput("DRUpdateGet", DRObjectHelper.toMap(DRUpdateGet, new HashMap(), "DiscountRestriction").get("DiscountRestriction"));
    }
  }


/**
 *
 * Sets the DiscountRestriction
 * @param DRUpdateInIn Value of the DRUpdateIn
 *
 */

  public void setDiscountRestriction(DRObjectData DRUpdateInIn) {
    DRUpdateIn = DRUpdateInIn;
  }

/**
 *
 * Sets the DRUpdateFilter
 * @param DRUpdateFilterIn Value of the DRUpdateFilter
 *
 */

  public void setDRUpdateFilter(DRObjectFilter DRUpdateFilterIn) {
    DRUpdateFilter = DRUpdateFilterIn;
  }

/**
 *
 * Sets the DRUpdateGet
 * @param DRUpdateGetIn Value of the DRUpdateGet
 *
 */

  public void setDRUpdateGet(DRObjectData DRUpdateGetIn) {
    DRUpdateGet = DRUpdateGetIn;
  }

  public void translateFromMap() {
    DRUpdateIn = DRObjectHelper.fromMap(inputMap, "DiscountRestriction");
    DRUpdateFilter = DRObjectHelper.fromMapFilter(inputMap, "DRUpdateFilter");
    DRUpdateGet = DRObjectHelper.fromMap(inputMap, "DRUpdateGet");
  }

/**
 *
 * Gets the DiscountRestriction
 * @return Value of the DiscountRestriction
 *
 */

  public DRObjectData getDiscountRestriction( ) {
    return DRUpdateIn;
  }

/**
 *
 * Gets the DRUpdateFilter
 * @return Value of the DRUpdateFilter
 *
 */

  public DRObjectFilter getDRUpdateFilter( ) {
    return DRUpdateFilter;
  }

/**
 *
 * Gets the DRUpdateGet
 * @return Value of the DRUpdateGet
 *
 */

  public DRObjectData getDRUpdateGet( ) {
    return DRUpdateGet;
  }

}
