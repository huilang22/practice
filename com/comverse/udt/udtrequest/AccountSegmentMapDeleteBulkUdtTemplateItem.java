/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSegmentMapDeleteBulkUdtTemplateItem.java
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
 * Class used to create a AccountSegmentMapDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountSegmentMapDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountSegmentMapObjectKeyData ASMDeleteIn;
/**
 *
 * Constructor to create a  AccountSegmentMapDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountSegmentMapDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountSegmentMapObjectKeyData ASMDeleteInIn) {
    super(id, context, "AccountSegmentMapDelete");
    ASMDeleteIn = ASMDeleteInIn;
  }

  public void translateToMap() {
    if (ASMDeleteIn != null) {
      ASMDeleteIn.resetFlags(true, true);
      addInput("AccountSegmentMap", AccountSegmentMapObjectKeyHelper.toMap(ASMDeleteIn, new HashMap(), "AccountSegmentMapObjectKeyData").get("AccountSegmentMapObjectKeyData"));
    }
  }


/**
 *
 * Sets the AccountSegmentMap
 * @param ASMDeleteInIn Value of the ASMDeleteIn
 *
 */

  public void setAccountSegmentMap(AccountSegmentMapObjectKeyData ASMDeleteInIn) {
    ASMDeleteIn = ASMDeleteInIn;
  }

  public void translateFromMap() {
    ASMDeleteIn = AccountSegmentMapObjectKeyHelper.fromMap(inputMap, "AccountSegmentMap");
  }

/**
 *
 * Gets the AccountSegmentMap
 * @return Value of the AccountSegmentMap
 *
 */

  public AccountSegmentMapObjectKeyData getAccountSegmentMap( ) {
    return ASMDeleteIn;
  }

}
