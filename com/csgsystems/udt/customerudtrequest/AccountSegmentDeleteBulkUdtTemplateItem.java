/*
 * Generated code DO NOT EDIT
 * Generated file: AccountSegmentDeleteBulkUdtTemplateItem.java
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
 * Class used to create a AccountSegmentDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountSegmentDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountSegmentObjectKeyData ASDeleteIn;
/**
 *
 * Constructor to create a  AccountSegmentDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountSegmentDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountSegmentObjectKeyData ASDeleteInIn) {
    super(id, context, "AccountSegmentDelete");
    ASDeleteIn = ASDeleteInIn;
  }

  public void translateToMap() {
    if (ASDeleteIn != null) {
      ASDeleteIn.resetFlags(true, true);
      addInput("AccountSegment", AccountSegmentObjectKeyHelper.toMap(ASDeleteIn, new HashMap(), "AccountSegmentObjectKeyData").get("AccountSegmentObjectKeyData"));
    }
  }


/**
 *
 * Sets the AccountSegment
 * @param ASDeleteInIn Value of the ASDeleteIn
 *
 */

  public void setAccountSegment(AccountSegmentObjectKeyData ASDeleteInIn) {
    ASDeleteIn = ASDeleteInIn;
  }

  public void translateFromMap() {
    ASDeleteIn = AccountSegmentObjectKeyHelper.fromMap(inputMap, "AccountSegment");
  }

/**
 *
 * Gets the AccountSegment
 * @return Value of the AccountSegment
 *
 */

  public AccountSegmentObjectKeyData getAccountSegment( ) {
    return ASDeleteIn;
  }

}
