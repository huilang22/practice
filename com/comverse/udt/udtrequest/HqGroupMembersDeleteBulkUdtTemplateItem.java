/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupMembersDeleteBulkUdtTemplateItem.java
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
 * Class used to create a HqGroupMembersDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupMembersDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupMembersObjectData HGMDeleteIn;
/**
 *
 * Constructor to create a  HqGroupMembersDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupMembersDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupMembersObjectData HGMDeleteInIn) {
    super(id, context, "HqGroupMembersDelete");
    HGMDeleteIn = HGMDeleteInIn;
  }

  public void translateToMap() {
    if (HGMDeleteIn != null) {
      HGMDeleteIn.resetFlags(true, true);
      addInput("HqGroupMembers", HqGroupMembersObjectHelper.toMap(HGMDeleteIn, new HashMap(), "HqGroupMembers").get("HqGroupMembers"));
    }
  }


/**
 *
 * Sets the HqGroupMembers
 * @param HGMDeleteInIn Value of the HGMDeleteIn
 *
 */

  public void setHqGroupMembers(HqGroupMembersObjectData HGMDeleteInIn) {
    HGMDeleteIn = HGMDeleteInIn;
  }

  public void translateFromMap() {
    HGMDeleteIn = HqGroupMembersObjectHelper.fromMap(inputMap, "HqGroupMembers");
  }

/**
 *
 * Gets the HqGroupMembers
 * @return Value of the HqGroupMembers
 *
 */

  public HqGroupMembersObjectData getHqGroupMembers( ) {
    return HGMDeleteIn;
  }

}
