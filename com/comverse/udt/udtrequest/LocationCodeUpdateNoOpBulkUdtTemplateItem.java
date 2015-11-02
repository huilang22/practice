/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LocationCodeUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a LocationCodeUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class LocationCodeUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected LOCObjectData noOpIn;

/**
 *
 * Constructor to create a   LocationCodeUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public LocationCodeUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, LOCObjectData noOpInIn) {
    super(id, context, "LocationCodeUpdate");
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
