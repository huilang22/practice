/*
 * Generated code DO NOT EDIT
 * Generated file: MobileZoneGetBulkUdtTemplateItem.java
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
 * Class used to create a MobileZoneGetBulkUdtTemplateItem Bulk Template
 *
 */

public class MobileZoneGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MobileZoneObjectKeyData MZGetIn;
/**
 *
 * Constructor to create a  MobileZoneGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MobileZoneGetBulkUdtTemplateItem(String id, BSDMSessionContext context, MobileZoneObjectKeyData MZGetInIn) {
    super(id, context, "MobileZoneGet");
    MZGetIn = MZGetInIn;
  }

  public void translateToMap() {
    if (MZGetIn != null) {
      MZGetIn.resetFlags(true, true);
      addInput("MobileZone", MobileZoneObjectKeyHelper.toMap(MZGetIn, new HashMap(), "MobileZoneObjectKeyData").get("MobileZoneObjectKeyData"));
    }
  }


/**
 *
 * Sets the MobileZone
 * @param MZGetInIn Value of the MZGetIn
 *
 */

  public void setMobileZone(MobileZoneObjectKeyData MZGetInIn) {
    MZGetIn = MZGetInIn;
  }

  public void translateFromMap() {
    MZGetIn = MobileZoneObjectKeyHelper.fromMap(inputMap, "MobileZone");
  }

/**
 *
 * Gets the MobileZone
 * @return Value of the MobileZone
 *
 */

  public MobileZoneObjectKeyData getMobileZone( ) {
    return MZGetIn;
  }

}
