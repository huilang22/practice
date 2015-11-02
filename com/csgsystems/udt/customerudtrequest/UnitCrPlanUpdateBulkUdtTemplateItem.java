/*
 * Generated code DO NOT EDIT
 * Generated file: UnitCrPlanUpdateBulkUdtTemplateItem.java
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
 * Class used to create a UnitCrPlanUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class UnitCrPlanUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnitCrPlanObjectData UnitCrPlanUpdateIn;
  protected UnitCrPlanObjectFilter UnitCrPlanUpdateFilter;
  protected UnitCrPlanObjectData UnitCrPlanUpdateGet;
/**
 *
 * Constructor to create a  UnitCrPlanUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnitCrPlanUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrPlanObjectData UnitCrPlanUpdateInIn, UnitCrPlanObjectFilter UnitCrPlanUpdateFilterIn, UnitCrPlanObjectData UnitCrPlanUpdateGetIn) {
    super(id, context, "UnitCrPlanUpdate");
    UnitCrPlanUpdateIn = UnitCrPlanUpdateInIn;
    UnitCrPlanUpdateFilter = UnitCrPlanUpdateFilterIn;
    UnitCrPlanUpdateGet = UnitCrPlanUpdateGetIn;
  }

  public void translateToMap() {
    if (UnitCrPlanUpdateIn != null) {
      UnitCrPlanUpdateIn.resetFlags(true, true);
      addInput("UnitCrPlan", UnitCrPlanObjectHelper.toMap(UnitCrPlanUpdateIn, new HashMap(), "UnitCrPlan").get("UnitCrPlan"));
    }
    if (UnitCrPlanUpdateFilter != null) {
      Integer index =  UnitCrPlanUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnitCrPlanUpdateFilter", UnitCrPlanObjectHelper.toMap(UnitCrPlanUpdateFilter, new HashMap(), "UnitCrPlan").get("UnitCrPlan"));
    }
    if (UnitCrPlanUpdateGet != null) {
      UnitCrPlanUpdateGet.resetFlags(true, true);
      addInput("UnitCrPlanUpdateGet", UnitCrPlanObjectHelper.toMap(UnitCrPlanUpdateGet, new HashMap(), "UnitCrPlan").get("UnitCrPlan"));
    }
  }


/**
 *
 * Sets the UnitCrPlan
 * @param UnitCrPlanUpdateInIn Value of the UnitCrPlanUpdateIn
 *
 */

  public void setUnitCrPlan(UnitCrPlanObjectData UnitCrPlanUpdateInIn) {
    UnitCrPlanUpdateIn = UnitCrPlanUpdateInIn;
  }

/**
 *
 * Sets the UnitCrPlanUpdateFilter
 * @param UnitCrPlanUpdateFilterIn Value of the UnitCrPlanUpdateFilter
 *
 */

  public void setUnitCrPlanUpdateFilter(UnitCrPlanObjectFilter UnitCrPlanUpdateFilterIn) {
    UnitCrPlanUpdateFilter = UnitCrPlanUpdateFilterIn;
  }

/**
 *
 * Sets the UnitCrPlanUpdateGet
 * @param UnitCrPlanUpdateGetIn Value of the UnitCrPlanUpdateGet
 *
 */

  public void setUnitCrPlanUpdateGet(UnitCrPlanObjectData UnitCrPlanUpdateGetIn) {
    UnitCrPlanUpdateGet = UnitCrPlanUpdateGetIn;
  }

  public void translateFromMap() {
    UnitCrPlanUpdateIn = UnitCrPlanObjectHelper.fromMap(inputMap, "UnitCrPlan");
    UnitCrPlanUpdateFilter = UnitCrPlanObjectHelper.fromMapFilter(inputMap, "UnitCrPlanUpdateFilter");
    UnitCrPlanUpdateGet = UnitCrPlanObjectHelper.fromMap(inputMap, "UnitCrPlanUpdateGet");
  }

/**
 *
 * Gets the UnitCrPlan
 * @return Value of the UnitCrPlan
 *
 */

  public UnitCrPlanObjectData getUnitCrPlan( ) {
    return UnitCrPlanUpdateIn;
  }

/**
 *
 * Gets the UnitCrPlanUpdateFilter
 * @return Value of the UnitCrPlanUpdateFilter
 *
 */

  public UnitCrPlanObjectFilter getUnitCrPlanUpdateFilter( ) {
    return UnitCrPlanUpdateFilter;
  }

/**
 *
 * Gets the UnitCrPlanUpdateGet
 * @return Value of the UnitCrPlanUpdateGet
 *
 */

  public UnitCrPlanObjectData getUnitCrPlanUpdateGet( ) {
    return UnitCrPlanUpdateGet;
  }

}
