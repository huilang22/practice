/*
 * Generated code DO NOT EDIT
 * Generated file: MobileZoneCreateBulkUdtTemplateItem.java
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
 * Class used to create a MobileZoneCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class MobileZoneCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MobileZoneObjectData MZCreateIn;
/**
 *
 * Constructor to create a  MobileZoneCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MobileZoneCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, MobileZoneObjectData MZCreateInIn) {
    super(id, context, "MobileZoneCreate");
    MZCreateIn = MZCreateInIn;
  }

  public void translateToMap() {
    if (MZCreateIn != null) {
      MZCreateIn.resetFlags(true, true);
      addInput("MobileZone", MobileZoneObjectHelper.toMap(MZCreateIn, new HashMap(), "MobileZone").get("MobileZone"));
    }
  }


/**
 *
 * Sets the MobileZone
 * @param MZCreateInIn Value of the MZCreateIn
 *
 */

  public void setMobileZone(MobileZoneObjectData MZCreateInIn) {
    MZCreateIn = MZCreateInIn;
  }

  public void translateFromMap() {
    MZCreateIn = MobileZoneObjectHelper.fromMap(inputMap, "MobileZone");
  }

/**
 *
 * Gets the MobileZone
 * @return Value of the MobileZone
 *
 */

  public MobileZoneObjectData getMobileZone( ) {
    return MZCreateIn;
  }

}
