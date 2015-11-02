/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VanityCodeChargeMapFindBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a VanityCodeChargeMapFindBulkUdtTemplateItem Bulk Template
 *
 */

public class VanityCodeChargeMapFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VanityCodeChargeObjFilter findIn;
/**
 *
 * Constructor to create a  VanityCodeChargeMapFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VanityCodeChargeMapFindBulkUdtTemplateItem(String id, BSDMSessionContext context, VanityCodeChargeObjFilter findInIn) {
    super(id, context, "VanityCodeChargeMapFind");
    findIn = findInIn;
  }

  public void translateToMap() {
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("VanityCodeChargeMap", VanityCodeChargeObjHelper.toMap(findIn, new HashMap(), "VanityCodeChargeMap").get("VanityCodeChargeMap"));
    }
  }


/**
 *
 * Sets the VanityCodeChargeMap
 * @param findInIn Value of the findIn
 *
 */

  public void setVanityCodeChargeMap(VanityCodeChargeObjFilter findInIn) {
    findIn = findInIn;
  }

  public void translateFromMap() {
    findIn = VanityCodeChargeObjHelper.fromMapFilter(inputMap, "VanityCodeChargeMap");
  }

/**
 *
 * Gets the VanityCodeChargeMap
 * @return Value of the VanityCodeChargeMap
 *
 */

  public VanityCodeChargeObjFilter getVanityCodeChargeMap( ) {
    return findIn;
  }

}
