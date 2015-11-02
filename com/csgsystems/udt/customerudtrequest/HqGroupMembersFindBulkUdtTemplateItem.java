/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupMembersFindBulkUdtTemplateItem.java
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
