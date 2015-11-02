/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupsUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a HqGroupsUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HqGroupsUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HqGroupsObjectData noOpIn;

/**
 *
 * Constructor to create a   HqGroupsUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HqGroupsUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupsObjectData noOpInIn) {
    super(id, context, "HqGroupsUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("HqGroups", HqGroupsObjectHelper.toMap(noOpIn, new HashMap(), "HqGroups").get("HqGroups"));
    }
  }
/**
 *
 * Sets the  HqGroups
 * @param noOpInIn HqGroupsObjectData to set
 *
 */
  public void setHqGroups(HqGroupsObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the HqGroups passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupsObjectData getHqGroups() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = HqGroupsObjectHelper.fromMap(inputMap, "HqGroups");
  }
}
