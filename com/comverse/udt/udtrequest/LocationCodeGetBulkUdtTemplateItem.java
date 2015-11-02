/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LocationCodeGetBulkUdtTemplateItem.java
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
 * Class used to create a LocationCodeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class LocationCodeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LOCObjectKeyData LOCGetIn;
/**
 *
 * Constructor to create a  LocationCodeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public LocationCodeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, LOCObjectKeyData LOCGetInIn) {
    super(id, context, "LocationCodeGet");
    LOCGetIn = LOCGetInIn;
  }

  public void translateToMap() {
    if (LOCGetIn != null) {
      LOCGetIn.resetFlags(true, true);
      addInput("LocationCode", LOCObjectKeyHelper.toMap(LOCGetIn, new HashMap(), "LOCObjectKeyData").get("LOCObjectKeyData"));
    }
  }


/**
 *
 * Sets the LocationCode
 * @param LOCGetInIn Value of the LOCGetIn
 *
 */

  public void setLocationCode(LOCObjectKeyData LOCGetInIn) {
    LOCGetIn = LOCGetInIn;
  }

  public void translateFromMap() {
    LOCGetIn = LOCObjectKeyHelper.fromMap(inputMap, "LocationCode");
  }

/**
 *
 * Gets the LocationCode
 * @return Value of the LocationCode
 *
 */

  public LOCObjectKeyData getLocationCode( ) {
    return LOCGetIn;
  }

}
