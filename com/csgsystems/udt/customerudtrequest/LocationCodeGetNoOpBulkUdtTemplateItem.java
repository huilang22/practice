/*
 * Generated code DO NOT EDIT
 * Generated file: LocationCodeGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a LocationCodeGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class LocationCodeGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected LOCObjectData noOpIn;

/**
 *
 * Constructor to create a   LocationCodeGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public LocationCodeGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, LOCObjectData noOpInIn) {
    super(id, context, "LocationCodeGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("LocationCode", LOCObjectHelper.toMap(noOpIn, new HashMap(), "LocationCode").get("LocationCode"));
    }
  }
/**
 *
 * Sets the  LocationCode
 * @param noOpInIn LOCObjectData to set
 *
 */
  public void setLocationCode(LOCObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the LocationCode passed into the constructor
 * @return Simulated response
 *
 */
  public LOCObjectData getLocationCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = LOCObjectHelper.fromMap(inputMap, "LocationCode");
  }
}
