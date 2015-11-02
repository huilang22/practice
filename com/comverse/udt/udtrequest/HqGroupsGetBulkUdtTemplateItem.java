/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupsGetBulkUdtTemplateItem.java
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
 * Class used to create a HqGroupsGetBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupsGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupsObjectData hggIn;
/**
 *
 * Constructor to create a  HqGroupsGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupsGetBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupsObjectData hggInIn) {
    super(id, context, "HqGroupsGet");
    hggIn = hggInIn;
  }

  public void translateToMap() {
    if (hggIn != null) {
      hggIn.resetFlags(true, true);
      addInput("HqGroups", HqGroupsObjectHelper.toMap(hggIn, new HashMap(), "HqGroups").get("HqGroups"));
    }
  }


/**
 *
 * Sets the HqGroups
 * @param hggInIn Value of the hggIn
 *
 */

  public void setHqGroups(HqGroupsObjectData hggInIn) {
    hggIn = hggInIn;
  }

  public void translateFromMap() {
    hggIn = HqGroupsObjectHelper.fromMap(inputMap, "HqGroups");
  }

/**
 *
 * Gets the HqGroups
 * @return Value of the HqGroups
 *
 */

  public HqGroupsObjectData getHqGroups( ) {
    return hggIn;
  }

}
