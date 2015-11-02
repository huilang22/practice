/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LocationCodeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a LocationCodeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class LocationCodeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LOCObjectKeyData LOCDeleteIn;
/**
 *
 * Constructor to create a  LocationCodeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public LocationCodeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, LOCObjectKeyData LOCDeleteInIn) {
    super(id, context, "LocationCodeDelete");
    LOCDeleteIn = LOCDeleteInIn;
  }

  public void translateToMap() {
    if (LOCDeleteIn != null) {
      LOCDeleteIn.resetFlags(true, true);
      addInput("LocationCode", LOCObjectKeyHelper.toMap(LOCDeleteIn, new HashMap(), "LOCObjectKeyData").get("LOCObjectKeyData"));
    }
  }


/**
 *
 * Sets the LocationCode
 * @param LOCDeleteInIn Value of the LOCDeleteIn
 *
 */

  public void setLocationCode(LOCObjectKeyData LOCDeleteInIn) {
    LOCDeleteIn = LOCDeleteInIn;
  }

  public void translateFromMap() {
    LOCDeleteIn = LOCObjectKeyHelper.fromMap(inputMap, "LocationCode");
  }

/**
 *
 * Gets the LocationCode
 * @return Value of the LocationCode
 *
 */

  public LOCObjectKeyData getLocationCode( ) {
    return LOCDeleteIn;
  }

}
