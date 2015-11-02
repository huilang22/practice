/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSegmentMapUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountSegmentMapUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountSegmentMapUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountSegmentMapObjectData noOpIn;

/**
 *
 * Constructor to create a   AccountSegmentMapUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountSegmentMapUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountSegmentMapObjectData noOpInIn) {
    super(id, context, "AccountSegmentMapUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountSegmentMap", AccountSegmentMapObjectHelper.toMap(noOpIn, new HashMap(), "AccountSegmentMap").get("AccountSegmentMap"));
    }
  }
/**
 *
 * Sets the  AccountSegmentMap
 * @param noOpInIn AccountSegmentMapObjectData to set
 *
 */
  public void setAccountSegmentMap(AccountSegmentMapObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountSegmentMap passed into the constructor
 * @return Simulated response
 *
 */
  public AccountSegmentMapObjectData getAccountSegmentMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountSegmentMapObjectHelper.fromMap(inputMap, "AccountSegmentMap");
  }
}
