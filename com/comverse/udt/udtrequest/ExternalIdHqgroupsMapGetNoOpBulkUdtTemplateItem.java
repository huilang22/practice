/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdHqgroupsMapGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ExternalIdHqgroupsMapGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ExternalIdHqgroupsMapGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EIHGMObjectData noOpIn;

/**
 *
 * Constructor to create a   ExternalIdHqgroupsMapGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ExternalIdHqgroupsMapGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EIHGMObjectData noOpInIn) {
    super(id, context, "ExternalIdHqgroupsMapGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ExternalIdHqGroupsMap", EIHGMObjectHelper.toMap(noOpIn, new HashMap(), "ExternalIdHqGroupsMap").get("ExternalIdHqGroupsMap"));
    }
  }
/**
 *
 * Sets the  ExternalIdHqGroupsMap
 * @param noOpInIn EIHGMObjectData to set
 *
 */
  public void setExternalIdHqGroupsMap(EIHGMObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ExternalIdHqGroupsMap passed into the constructor
 * @return Simulated response
 *
 */
  public EIHGMObjectData getExternalIdHqGroupsMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EIHGMObjectHelper.fromMap(inputMap, "ExternalIdHqGroupsMap");
  }
}
