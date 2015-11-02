/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LocationCodeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a LocationCodeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class LocationCodeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LOCObjectData LOCUpdateIn;
/**
 *
 * Constructor to create a  LocationCodeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public LocationCodeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, LOCObjectData LOCUpdateInIn) {
    super(id, context, "LocationCodeUpdate");
    LOCUpdateIn = LOCUpdateInIn;
  }

  public void translateToMap() {
    if (LOCUpdateIn != null) {
      LOCUpdateIn.resetFlags(true, true);
      addInput("LocationCode", LOCObjectHelper.toMap(LOCUpdateIn, new HashMap(), "LocationCode").get("LocationCode"));
    }
  }


/**
 *
 * Sets the LocationCode
 * @param LOCUpdateInIn Value of the LOCUpdateIn
 *
 */

  public void setLocationCode(LOCObjectData LOCUpdateInIn) {
    LOCUpdateIn = LOCUpdateInIn;
  }

  public void translateFromMap() {
    LOCUpdateIn = LOCObjectHelper.fromMap(inputMap, "LocationCode");
  }

/**
 *
 * Gets the LocationCode
 * @return Value of the LocationCode
 *
 */

  public LOCObjectData getLocationCode( ) {
    return LOCUpdateIn;
  }

}
