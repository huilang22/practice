/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupsCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a HqGroupsCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HqGroupsCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HqGroupsObjectData noOpIn;

/**
 *
 * Constructor to create a   HqGroupsCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HqGroupsCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupsObjectData noOpInIn) {
    super(id, context, "HqGroupsCreate");
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
