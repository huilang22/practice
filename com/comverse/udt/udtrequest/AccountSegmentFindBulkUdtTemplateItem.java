/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSegmentFindBulkUdtTemplateItem.java
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
 * Class used to create a AccountSegmentFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountSegmentFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountSegmentObjectFilter ASFindIn;
/**
 *
 * Constructor to create a  AccountSegmentFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountSegmentFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountSegmentObjectFilter ASFindInIn) {
    super(id, context, "AccountSegmentFind");
    ASFindIn = ASFindInIn;
  }

  public void translateToMap() {
    if (ASFindIn != null) {
      Integer index =  ASFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountSegment", AccountSegmentObjectHelper.toMap(ASFindIn, new HashMap(), "AccountSegment").get("AccountSegment"));
    }
  }


/**
 *
 * Sets the AccountSegment
 * @param ASFindInIn Value of the ASFindIn
 *
 */

  public void setAccountSegment(AccountSegmentObjectFilter ASFindInIn) {
    ASFindIn = ASFindInIn;
  }

  public void translateFromMap() {
    ASFindIn = AccountSegmentObjectHelper.fromMapFilter(inputMap, "AccountSegment");
  }

/**
 *
 * Gets the AccountSegment
 * @return Value of the AccountSegment
 *
 */

  public AccountSegmentObjectFilter getAccountSegment( ) {
    return ASFindIn;
  }

}
