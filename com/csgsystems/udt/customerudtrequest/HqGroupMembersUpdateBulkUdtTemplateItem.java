/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupMembersUpdateBulkUdtTemplateItem.java
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
 * Class used to create a HqGroupMembersUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupMembersUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupMembersObjectData HGMUpdateIn;
/**
 *
 * Constructor to create a  HqGroupMembersUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupMembersUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupMembersObjectData HGMUpdateInIn) {
    super(id, context, "HqGroupMembersUpdate");
    HGMUpdateIn = HGMUpdateInIn;
  }

  public void translateToMap() {
    if (HGMUpdateIn != null) {
      HGMUpdateIn.resetFlags(true, true);
      addInput("HqGroupMembers", HqGroupMembersObjectHelper.toMap(HGMUpdateIn, new HashMap(), "HqGroupMembers").get("HqGroupMembers"));
    }
  }


/**
 *
 * Sets the HqGroupMembers
 * @param HGMUpdateInIn Value of the HGMUpdateIn
 *
 */

  public void setHqGroupMembers(HqGroupMembersObjectData HGMUpdateInIn) {
    HGMUpdateIn = HGMUpdateInIn;
  }

  public void translateFromMap() {
    HGMUpdateIn = HqGroupMembersObjectHelper.fromMap(inputMap, "HqGroupMembers");
  }

/**
 *
 * Gets the HqGroupMembers
 * @return Value of the HqGroupMembers
 *
 */

  public HqGroupMembersObjectData getHqGroupMembers( ) {
    return HGMUpdateIn;
  }

}
