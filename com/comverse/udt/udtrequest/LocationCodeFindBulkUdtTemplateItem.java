/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LocationCodeFindBulkUdtTemplateItem.java
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
 * Class used to create a LocationCodeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class LocationCodeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LOCObjectFilter LOCFindIn;
/**
 *
 * Constructor to create a  LocationCodeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public LocationCodeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, LOCObjectFilter LOCFindInIn) {
    super(id, context, "LocationCodeFind");
    LOCFindIn = LOCFindInIn;
  }

  public void translateToMap() {
    if (LOCFindIn != null) {
      Integer index =  LOCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("LocationCode", LOCObjectHelper.toMap(LOCFindIn, new HashMap(), "LocationCode").get("LocationCode"));
    }
  }


/**
 *
 * Sets the LocationCode
 * @param LOCFindInIn Value of the LOCFindIn
 *
 */

  public void setLocationCode(LOCObjectFilter LOCFindInIn) {
    LOCFindIn = LOCFindInIn;
  }

  public void translateFromMap() {
    LOCFindIn = LOCObjectHelper.fromMapFilter(inputMap, "LocationCode");
  }

/**
 *
 * Gets the LocationCode
 * @return Value of the LocationCode
 *
 */

  public LOCObjectFilter getLocationCode( ) {
    return LOCFindIn;
  }

}
