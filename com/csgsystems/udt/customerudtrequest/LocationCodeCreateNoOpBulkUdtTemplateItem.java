/*
 * Generated code DO NOT EDIT
 * Generated file: LocationCodeCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a LocationCodeCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class LocationCodeCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected LOCObjectData noOpIn;

/**
 *
 * Constructor to create a   LocationCodeCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public LocationCodeCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, LOCObjectData noOpInIn) {
    super(id, context, "LocationCodeCreate");
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
