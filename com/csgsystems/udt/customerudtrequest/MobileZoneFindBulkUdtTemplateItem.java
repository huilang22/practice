/*
 * Generated code DO NOT EDIT
 * Generated file: MobileZoneFindBulkUdtTemplateItem.java
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
 * Class used to create a MobileZoneFindBulkUdtTemplateItem Bulk Template
 *
 */

public class MobileZoneFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MobileZoneObjectFilter MZFindIn;
/**
 *
 * Constructor to create a  MobileZoneFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MobileZoneFindBulkUdtTemplateItem(String id, BSDMSessionContext context, MobileZoneObjectFilter MZFindInIn) {
    super(id, context, "MobileZoneFind");
    MZFindIn = MZFindInIn;
  }

  public void translateToMap() {
    if (MZFindIn != null) {
      Integer index =  MZFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("MobileZone", MobileZoneObjectHelper.toMap(MZFindIn, new HashMap(), "MobileZone").get("MobileZone"));
    }
  }


/**
 *
 * Sets the MobileZone
 * @param MZFindInIn Value of the MZFindIn
 *
 */

  public void setMobileZone(MobileZoneObjectFilter MZFindInIn) {
    MZFindIn = MZFindInIn;
  }

  public void translateFromMap() {
    MZFindIn = MobileZoneObjectHelper.fromMapFilter(inputMap, "MobileZone");
  }

/**
 *
 * Gets the MobileZone
 * @return Value of the MobileZone
 *
 */

  public MobileZoneObjectFilter getMobileZone( ) {
    return MZFindIn;
  }

}
