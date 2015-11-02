/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSegmentCreateBulkUdtTemplateItem.java
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
 * Class used to create a AccountSegmentCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountSegmentCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountSegmentObjectData ASCreateIn;
/**
 *
 * Constructor to create a  AccountSegmentCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountSegmentCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountSegmentObjectData ASCreateInIn) {
    super(id, context, "AccountSegmentCreate");
    ASCreateIn = ASCreateInIn;
  }

  public void translateToMap() {
    if (ASCreateIn != null) {
      ASCreateIn.resetFlags(true, true);
      addInput("AccountSegment", AccountSegmentObjectHelper.toMap(ASCreateIn, new HashMap(), "AccountSegment").get("AccountSegment"));
    }
  }


/**
 *
 * Sets the AccountSegment
 * @param ASCreateInIn Value of the ASCreateIn
 *
 */

  public void setAccountSegment(AccountSegmentObjectData ASCreateInIn) {
    ASCreateIn = ASCreateInIn;
  }

  public void translateFromMap() {
    ASCreateIn = AccountSegmentObjectHelper.fromMap(inputMap, "AccountSegment");
  }

/**
 *
 * Gets the AccountSegment
 * @return Value of the AccountSegment
 *
 */

  public AccountSegmentObjectData getAccountSegment( ) {
    return ASCreateIn;
  }

}
