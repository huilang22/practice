/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupMembersCreateBulkUdtTemplateItem.java
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
 * Class used to create a HqGroupMembersCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupMembersCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupMembersObjectData HGMCreateIn;
/**
 *
 * Constructor to create a  HqGroupMembersCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupMembersCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupMembersObjectData HGMCreateInIn) {
    super(id, context, "HqGroupMembersCreate");
    HGMCreateIn = HGMCreateInIn;
  }

  public void translateToMap() {
    if (HGMCreateIn != null) {
      HGMCreateIn.resetFlags(true, true);
      addInput("HqGroupMembers", HqGroupMembersObjectHelper.toMap(HGMCreateIn, new HashMap(), "HqGroupMembers").get("HqGroupMembers"));
    }
  }


/**
 *
 * Sets the HqGroupMembers
 * @param HGMCreateInIn Value of the HGMCreateIn
 *
 */

  public void setHqGroupMembers(HqGroupMembersObjectData HGMCreateInIn) {
    HGMCreateIn = HGMCreateInIn;
  }

  public void translateFromMap() {
    HGMCreateIn = HqGroupMembersObjectHelper.fromMap(inputMap, "HqGroupMembers");
  }

/**
 *
 * Gets the HqGroupMembers
 * @return Value of the HqGroupMembers
 *
 */

  public HqGroupMembersObjectData getHqGroupMembers( ) {
    return HGMCreateIn;
  }

}
