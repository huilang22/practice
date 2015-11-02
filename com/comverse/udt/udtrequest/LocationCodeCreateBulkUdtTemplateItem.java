/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LocationCodeCreateBulkUdtTemplateItem.java
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
 * Class used to create a LocationCodeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class LocationCodeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LOCObjectData LOCCreateIn;
/**
 *
 * Constructor to create a  LocationCodeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public LocationCodeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, LOCObjectData LOCCreateInIn) {
    super(id, context, "LocationCodeCreate");
    LOCCreateIn = LOCCreateInIn;
  }

  public void translateToMap() {
    if (LOCCreateIn != null) {
      LOCCreateIn.resetFlags(true, true);
      addInput("LocationCode", LOCObjectHelper.toMap(LOCCreateIn, new HashMap(), "LocationCode").get("LocationCode"));
    }
  }


/**
 *
 * Sets the LocationCode
 * @param LOCCreateInIn Value of the LOCCreateIn
 *
 */

  public void setLocationCode(LOCObjectData LOCCreateInIn) {
    LOCCreateIn = LOCCreateInIn;
  }

  public void translateFromMap() {
    LOCCreateIn = LOCObjectHelper.fromMap(inputMap, "LocationCode");
  }

/**
 *
 * Gets the LocationCode
 * @return Value of the LocationCode
 *
 */

  public LOCObjectData getLocationCode( ) {
    return LOCCreateIn;
  }

}
