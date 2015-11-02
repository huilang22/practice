/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MobileZoneUpdateBulkUdtTemplateItem.java
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
 * Class used to create a MobileZoneUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class MobileZoneUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MobileZoneObjectData MZUpdateIn;
/**
 *
 * Constructor to create a  MobileZoneUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MobileZoneUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, MobileZoneObjectData MZUpdateInIn) {
    super(id, context, "MobileZoneUpdate");
    MZUpdateIn = MZUpdateInIn;
  }

  public void translateToMap() {
    if (MZUpdateIn != null) {
      MZUpdateIn.resetFlags(true, true);
      addInput("MobileZone", MobileZoneObjectHelper.toMap(MZUpdateIn, new HashMap(), "MobileZone").get("MobileZone"));
    }
  }


/**
 *
 * Sets the MobileZone
 * @param MZUpdateInIn Value of the MZUpdateIn
 *
 */

  public void setMobileZone(MobileZoneObjectData MZUpdateInIn) {
    MZUpdateIn = MZUpdateInIn;
  }

  public void translateFromMap() {
    MZUpdateIn = MobileZoneObjectHelper.fromMap(inputMap, "MobileZone");
  }

/**
 *
 * Gets the MobileZone
 * @return Value of the MobileZone
 *
 */

  public MobileZoneObjectData getMobileZone( ) {
    return MZUpdateIn;
  }

}
