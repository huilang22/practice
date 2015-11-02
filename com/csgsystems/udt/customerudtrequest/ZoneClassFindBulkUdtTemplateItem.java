/*
 * Generated code DO NOT EDIT
 * Generated file: ZoneClassFindBulkUdtTemplateItem.java
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
 * Class used to create a ZoneClassFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ZoneClassFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ZoneClassObjectFilter zcFindIn;
/**
 *
 * Constructor to create a  ZoneClassFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ZoneClassFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ZoneClassObjectFilter zcFindInIn) {
    super(id, context, "ZoneClassFind");
    zcFindIn = zcFindInIn;
  }

  public void translateToMap() {
    if (zcFindIn != null) {
      Integer index =  zcFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ZoneClass", ZoneClassObjectHelper.toMap(zcFindIn, new HashMap(), "ZoneClass").get("ZoneClass"));
    }
  }


/**
 *
 * Sets the ZoneClass
 * @param zcFindInIn Value of the zcFindIn
 *
 */

  public void setZoneClass(ZoneClassObjectFilter zcFindInIn) {
    zcFindIn = zcFindInIn;
  }

  public void translateFromMap() {
    zcFindIn = ZoneClassObjectHelper.fromMapFilter(inputMap, "ZoneClass");
  }

/**
 *
 * Gets the ZoneClass
 * @return Value of the ZoneClass
 *
 */

  public ZoneClassObjectFilter getZoneClass( ) {
    return zcFindIn;
  }

}
