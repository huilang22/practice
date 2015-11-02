/*
 * Generated code DO NOT EDIT
 * Generated file: VanityCodeChargeMapGetBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a VanityCodeChargeMapGetBulkUdtTemplateItem Bulk Template
 *
 */

public class VanityCodeChargeMapGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VanityCodeChargeObjKeyData getIn;
/**
 *
 * Constructor to create a  VanityCodeChargeMapGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VanityCodeChargeMapGetBulkUdtTemplateItem(String id, BSDMSessionContext context, VanityCodeChargeObjKeyData getInIn) {
    super(id, context, "VanityCodeChargeMapGet");
    getIn = getInIn;
  }

  public void translateToMap() {
    if (getIn != null) {
      getIn.resetFlags(true, true);
      addInput("VanityCodeChargeMap", VanityCodeChargeObjKeyHelper.toMap(getIn, new HashMap(), "VanityCodeChargeObjKeyData").get("VanityCodeChargeObjKeyData"));
    }
  }


/**
 *
 * Sets the VanityCodeChargeMap
 * @param getInIn Value of the getIn
 *
 */

  public void setVanityCodeChargeMap(VanityCodeChargeObjKeyData getInIn) {
    getIn = getInIn;
  }

  public void translateFromMap() {
    getIn = VanityCodeChargeObjKeyHelper.fromMap(inputMap, "VanityCodeChargeMap");
  }

/**
 *
 * Gets the VanityCodeChargeMap
 * @return Value of the VanityCodeChargeMap
 *
 */

  public VanityCodeChargeObjKeyData getVanityCodeChargeMap( ) {
    return getIn;
  }

}
