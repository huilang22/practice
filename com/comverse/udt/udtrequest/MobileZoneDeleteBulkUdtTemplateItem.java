/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MobileZoneDeleteBulkUdtTemplateItem.java
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
 * Class used to create a MobileZoneDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class MobileZoneDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MobileZoneObjectKeyData MZDeleteIn;
/**
 *
 * Constructor to create a  MobileZoneDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MobileZoneDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, MobileZoneObjectKeyData MZDeleteInIn) {
    super(id, context, "MobileZoneDelete");
    MZDeleteIn = MZDeleteInIn;
  }

  public void translateToMap() {
    if (MZDeleteIn != null) {
      MZDeleteIn.resetFlags(true, true);
      addInput("MobileZone", MobileZoneObjectKeyHelper.toMap(MZDeleteIn, new HashMap(), "MobileZoneObjectKeyData").get("MobileZoneObjectKeyData"));
    }
  }


/**
 *
 * Sets the MobileZone
 * @param MZDeleteInIn Value of the MZDeleteIn
 *
 */

  public void setMobileZone(MobileZoneObjectKeyData MZDeleteInIn) {
    MZDeleteIn = MZDeleteInIn;
  }

  public void translateFromMap() {
    MZDeleteIn = MobileZoneObjectKeyHelper.fromMap(inputMap, "MobileZone");
  }

/**
 *
 * Gets the MobileZone
 * @return Value of the MobileZone
 *
 */

  public MobileZoneObjectKeyData getMobileZone( ) {
    return MZDeleteIn;
  }

}
