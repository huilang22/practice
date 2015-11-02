/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSegmentGetBulkUdtTemplateItem.java
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
 * Class used to create a AccountSegmentGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountSegmentGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountSegmentObjectKeyData ASGetIn;
/**
 *
 * Constructor to create a  AccountSegmentGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountSegmentGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountSegmentObjectKeyData ASGetInIn) {
    super(id, context, "AccountSegmentGet");
    ASGetIn = ASGetInIn;
  }

  public void translateToMap() {
    if (ASGetIn != null) {
      ASGetIn.resetFlags(true, true);
      addInput("AccountSegment", AccountSegmentObjectKeyHelper.toMap(ASGetIn, new HashMap(), "AccountSegmentObjectKeyData").get("AccountSegmentObjectKeyData"));
    }
  }


/**
 *
 * Sets the AccountSegment
 * @param ASGetInIn Value of the ASGetIn
 *
 */

  public void setAccountSegment(AccountSegmentObjectKeyData ASGetInIn) {
    ASGetIn = ASGetInIn;
  }

  public void translateFromMap() {
    ASGetIn = AccountSegmentObjectKeyHelper.fromMap(inputMap, "AccountSegment");
  }

/**
 *
 * Gets the AccountSegment
 * @return Value of the AccountSegment
 *
 */

  public AccountSegmentObjectKeyData getAccountSegment( ) {
    return ASGetIn;
  }

}
