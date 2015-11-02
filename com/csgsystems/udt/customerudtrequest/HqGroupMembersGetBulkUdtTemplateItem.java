/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupMembersGetBulkUdtTemplateItem.java
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
 * Class used to create a HqGroupMembersGetBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupMembersGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupMembersObjectData HGMGetIn;
/**
 *
 * Constructor to create a  HqGroupMembersGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupMembersGetBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupMembersObjectData HGMGetInIn) {
    super(id, context, "HqGroupMembersGet");
    HGMGetIn = HGMGetInIn;
  }

  public void translateToMap() {
    if (HGMGetIn != null) {
      HGMGetIn.resetFlags(true, true);
      addInput("HqGroupMembers", HqGroupMembersObjectHelper.toMap(HGMGetIn, new HashMap(), "HqGroupMembers").get("HqGroupMembers"));
    }
  }


/**
 *
 * Sets the HqGroupMembers
 * @param HGMGetInIn Value of the HGMGetIn
 *
 */

  public void setHqGroupMembers(HqGroupMembersObjectData HGMGetInIn) {
    HGMGetIn = HGMGetInIn;
  }

  public void translateFromMap() {
    HGMGetIn = HqGroupMembersObjectHelper.fromMap(inputMap, "HqGroupMembers");
  }

/**
 *
 * Gets the HqGroupMembers
 * @return Value of the HqGroupMembers
 *
 */

  public HqGroupMembersObjectData getHqGroupMembers( ) {
    return HGMGetIn;
  }

}
