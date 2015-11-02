/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VanityCodeChargeMapCreateBulkUdtTemplateItem.java
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
 * Class used to create a VanityCodeChargeMapCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class VanityCodeChargeMapCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VanityCodeChargeObjData createIn;
/**
 *
 * Constructor to create a  VanityCodeChargeMapCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VanityCodeChargeMapCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, VanityCodeChargeObjData createInIn) {
    super(id, context, "VanityCodeChargeMapCreate");
    createIn = createInIn;
  }

  public void translateToMap() {
    if (createIn != null) {
      createIn.resetFlags(true, true);
      addInput("VanityCodeChargeMap", VanityCodeChargeObjHelper.toMap(createIn, new HashMap(), "VanityCodeChargeMap").get("VanityCodeChargeMap"));
    }
  }


/**
 *
 * Sets the VanityCodeChargeMap
 * @param createInIn Value of the createIn
 *
 */

  public void setVanityCodeChargeMap(VanityCodeChargeObjData createInIn) {
    createIn = createInIn;
  }

  public void translateFromMap() {
    createIn = VanityCodeChargeObjHelper.fromMap(inputMap, "VanityCodeChargeMap");
  }

/**
 *
 * Gets the VanityCodeChargeMap
 * @return Value of the VanityCodeChargeMap
 *
 */

  public VanityCodeChargeObjData getVanityCodeChargeMap( ) {
    return createIn;
  }

}
