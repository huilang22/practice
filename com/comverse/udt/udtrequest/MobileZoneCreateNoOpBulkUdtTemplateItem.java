/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MobileZoneCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a MobileZoneCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class MobileZoneCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected MobileZoneObjectData noOpIn;

/**
 *
 * Constructor to create a   MobileZoneCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public MobileZoneCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, MobileZoneObjectData noOpInIn) {
    super(id, context, "MobileZoneCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("MobileZone", MobileZoneObjectHelper.toMap(noOpIn, new HashMap(), "MobileZone").get("MobileZone"));
    }
  }
/**
 *
 * Sets the  MobileZone
 * @param noOpInIn MobileZoneObjectData to set
 *
 */
  public void setMobileZone(MobileZoneObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the MobileZone passed into the constructor
 * @return Simulated response
 *
 */
  public MobileZoneObjectData getMobileZone() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = MobileZoneObjectHelper.fromMap(inputMap, "MobileZone");
  }
}
