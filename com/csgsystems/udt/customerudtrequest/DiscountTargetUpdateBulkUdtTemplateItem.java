/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountTargetUpdateBulkUdtTemplateItem.java
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
 * Class used to create a DiscountTargetUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class DiscountTargetUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DTObjectData DTUpdateIn;
  protected DTObjectFilter DTUpdateFilter;
  protected DTObjectData DTUpdateGet;
/**
 *
 * Constructor to create a  DiscountTargetUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DiscountTargetUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, DTObjectData DTUpdateInIn, DTObjectFilter DTUpdateFilterIn, DTObjectData DTUpdateGetIn) {
    super(id, context, "DiscountTargetUpdate");
    DTUpdateIn = DTUpdateInIn;
    DTUpdateFilter = DTUpdateFilterIn;
    DTUpdateGet = DTUpdateGetIn;
  }

  public void translateToMap() {
    if (DTUpdateIn != null) {
      DTUpdateIn.resetFlags(true, true);
      addInput("DiscountTarget", DTObjectHelper.toMap(DTUpdateIn, new HashMap(), "DiscountTarget").get("DiscountTarget"));
    }
    if (DTUpdateFilter != null) {
      Integer index =  DTUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("DTUpdateFilter", DTObjectHelper.toMap(DTUpdateFilter, new HashMap(), "DiscountTarget").get("DiscountTarget"));
    }
    if (DTUpdateGet != null) {
      DTUpdateGet.resetFlags(true, true);
      addInput("DTUpdateGet", DTObjectHelper.toMap(DTUpdateGet, new HashMap(), "DiscountTarget").get("DiscountTarget"));
    }
  }


/**
 *
 * Sets the DiscountTarget
 * @param DTUpdateInIn Value of the DTUpdateIn
 *
 */

  public void setDiscountTarget(DTObjectData DTUpdateInIn) {
    DTUpdateIn = DTUpdateInIn;
  }

/**
 *
 * Sets the DTUpdateFilter
 * @param DTUpdateFilterIn Value of the DTUpdateFilter
 *
 */

  public void setDTUpdateFilter(DTObjectFilter DTUpdateFilterIn) {
    DTUpdateFilter = DTUpdateFilterIn;
  }

/**
 *
 * Sets the DTUpdateGet
 * @param DTUpdateGetIn Value of the DTUpdateGet
 *
 */

  public void setDTUpdateGet(DTObjectData DTUpdateGetIn) {
    DTUpdateGet = DTUpdateGetIn;
  }

  public void translateFromMap() {
    DTUpdateIn = DTObjectHelper.fromMap(inputMap, "DiscountTarget");
    DTUpdateFilter = DTObjectHelper.fromMapFilter(inputMap, "DTUpdateFilter");
    DTUpdateGet = DTObjectHelper.fromMap(inputMap, "DTUpdateGet");
  }

/**
 *
 * Gets the DiscountTarget
 * @return Value of the DiscountTarget
 *
 */

  public DTObjectData getDiscountTarget( ) {
    return DTUpdateIn;
  }

/**
 *
 * Gets the DTUpdateFilter
 * @return Value of the DTUpdateFilter
 *
 */

  public DTObjectFilter getDTUpdateFilter( ) {
    return DTUpdateFilter;
  }

/**
 *
 * Gets the DTUpdateGet
 * @return Value of the DTUpdateGet
 *
 */

  public DTObjectData getDTUpdateGet( ) {
    return DTUpdateGet;
  }

}
