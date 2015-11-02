/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupMembersFindBulkUdtTemplateItem.java
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
 * Class used to create a HqGroupMembersFindBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupMembersFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupMembersObjectFilter HGMFindIn;
/**
 *
 * Constructor to create a  HqGroupMembersFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupMembersFindBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupMembersObjectFilter HGMFindInIn) {
    super(id, context, "HqGroupMembersFind");
    HGMFindIn = HGMFindInIn;
  }

  public void translateToMap() {
    if (HGMFindIn != null) {
      Integer index =  HGMFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HqGroupMembers", HqGroupMembersObjectHelper.toMap(HGMFindIn, new HashMap(), "HqGroupMembers").get("HqGroupMembers"));
    }
  }


/**
 *
 * Sets the HqGroupMembers
 * @param HGMFindInIn Value of the HGMFindIn
 *
 */

  public void setHqGroupMembers(HqGroupMembersObjectFilter HGMFindInIn) {
    HGMFindIn = HGMFindInIn;
  }

  public void translateFromMap() {
    HGMFindIn = HqGroupMembersObjectHelper.fromMapFilter(inputMap, "HqGroupMembers");
  }

/**
 *
 * Gets the HqGroupMembers
 * @return Value of the HqGroupMembers
 *
 */

  public HqGroupMembersObjectFilter getHqGroupMembers( ) {
    return HGMFindIn;
  }

}
