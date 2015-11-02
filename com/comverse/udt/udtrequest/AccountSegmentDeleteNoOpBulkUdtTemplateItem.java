/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSegmentDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountSegmentDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountSegmentDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountSegmentObjectData noOpIn;

/**
 *
 * Constructor to create a   AccountSegmentDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountSegmentDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountSegmentObjectData noOpInIn) {
    super(id, context, "AccountSegmentDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountSegment", AccountSegmentObjectHelper.toMap(noOpIn, new HashMap(), "AccountSegment").get("AccountSegment"));
    }
  }
/**
 *
 * Sets the  AccountSegment
 * @param noOpInIn AccountSegmentObjectData to set
 *
 */
  public void setAccountSegment(AccountSegmentObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountSegment passed into the constructor
 * @return Simulated response
 *
 */
  public AccountSegmentObjectData getAccountSegment() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountSegmentObjectHelper.fromMap(inputMap, "AccountSegment");
  }
}
