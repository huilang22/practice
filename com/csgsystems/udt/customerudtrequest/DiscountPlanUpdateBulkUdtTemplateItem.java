/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountPlanUpdateBulkUdtTemplateItem.java
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
 * Class used to create a DiscountPlanUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class DiscountPlanUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DPObjectData DPUpdateIn;
  protected DPObjectFilter DPUpdateFilter;
  protected DPObjectData DPUpdateGet;
/**
 *
 * Constructor to create a  DiscountPlanUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DiscountPlanUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, DPObjectData DPUpdateInIn, DPObjectFilter DPUpdateFilterIn, DPObjectData DPUpdateGetIn) {
    super(id, context, "DiscountPlanUpdate");
    DPUpdateIn = DPUpdateInIn;
    DPUpdateFilter = DPUpdateFilterIn;
    DPUpdateGet = DPUpdateGetIn;
  }

  public void translateToMap() {
    if (DPUpdateIn != null) {
      DPUpdateIn.resetFlags(true, true);
      addInput("DiscountPlan", DPObjectHelper.toMap(DPUpdateIn, new HashMap(), "DiscountPlan").get("DiscountPlan"));
    }
    if (DPUpdateFilter != null) {
      Integer index =  DPUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("DPUpdateFilter", DPObjectHelper.toMap(DPUpdateFilter, new HashMap(), "DiscountPlan").get("DiscountPlan"));
    }
    if (DPUpdateGet != null) {
      DPUpdateGet.resetFlags(true, true);
      addInput("DPUpdateGet", DPObjectHelper.toMap(DPUpdateGet, new HashMap(), "DiscountPlan").get("DiscountPlan"));
    }
  }


/**
 *
 * Sets the DiscountPlan
 * @param DPUpdateInIn Value of the DPUpdateIn
 *
 */

  public void setDiscountPlan(DPObjectData DPUpdateInIn) {
    DPUpdateIn = DPUpdateInIn;
  }

/**
 *
 * Sets the DPUpdateFilter
 * @param DPUpdateFilterIn Value of the DPUpdateFilter
 *
 */

  public void setDPUpdateFilter(DPObjectFilter DPUpdateFilterIn) {
    DPUpdateFilter = DPUpdateFilterIn;
  }

/**
 *
 * Sets the DPUpdateGet
 * @param DPUpdateGetIn Value of the DPUpdateGet
 *
 */

  public void setDPUpdateGet(DPObjectData DPUpdateGetIn) {
    DPUpdateGet = DPUpdateGetIn;
  }

  public void translateFromMap() {
    DPUpdateIn = DPObjectHelper.fromMap(inputMap, "DiscountPlan");
    DPUpdateFilter = DPObjectHelper.fromMapFilter(inputMap, "DPUpdateFilter");
    DPUpdateGet = DPObjectHelper.fromMap(inputMap, "DPUpdateGet");
  }

/**
 *
 * Gets the DiscountPlan
 * @return Value of the DiscountPlan
 *
 */

  public DPObjectData getDiscountPlan( ) {
    return DPUpdateIn;
  }

/**
 *
 * Gets the DPUpdateFilter
 * @return Value of the DPUpdateFilter
 *
 */

  public DPObjectFilter getDPUpdateFilter( ) {
    return DPUpdateFilter;
  }

/**
 *
 * Gets the DPUpdateGet
 * @return Value of the DPUpdateGet
 *
 */

  public DPObjectData getDPUpdateGet( ) {
    return DPUpdateGet;
  }

}
