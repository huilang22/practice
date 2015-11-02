/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupsUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a HqGroupsUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupsUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupsObjectData hguIn;
/**
 *
 * Constructor to create a  HqGroupsUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupsUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupsObjectData hguInIn) {
    super(id, context, "HqGroupsUpdate");
    hguIn = hguInIn;
  }

  public void translateToMap() {
    if (hguIn != null) {
      hguIn.resetFlags(true, true);
      addInput("HqGroups", HqGroupsObjectHelper.toMap(hguIn, new HashMap(), "HqGroups").get("HqGroups"));
    }
  }


/**
 *
 * Sets the HqGroups
 * @param hguInIn Value of the hguIn
 *
 */

  public void setHqGroups(HqGroupsObjectData hguInIn) {
    hguIn = hguInIn;
  }

  public void translateFromMap() {
    hguIn = HqGroupsObjectHelper.fromMap(inputMap, "HqGroups");
  }

/**
 *
 * Gets the HqGroups
 * @return Value of the HqGroups
 *
 */

  public HqGroupsObjectData getHqGroups( ) {
    return hguIn;
  }

}
