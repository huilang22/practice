/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupMembersDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a HqGroupMembersDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HqGroupMembersDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HqGroupMembersObjectData noOpIn;

/**
 *
 * Constructor to create a   HqGroupMembersDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HqGroupMembersDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupMembersObjectData noOpInIn) {
    super(id, context, "HqGroupMembersDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("HqGroupMembers", HqGroupMembersObjectHelper.toMap(noOpIn, new HashMap(), "HqGroupMembers").get("HqGroupMembers"));
    }
  }
/**
 *
 * Sets the  HqGroupMembers
 * @param noOpInIn HqGroupMembersObjectData to set
 *
 */
  public void setHqGroupMembers(HqGroupMembersObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the HqGroupMembers passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupMembersObjectData getHqGroupMembers() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = HqGroupMembersObjectHelper.fromMap(inputMap, "HqGroupMembers");
  }
}
