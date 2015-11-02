/*
 * Generated code DO NOT EDIT
 * Generated file: AccountSegmentMapGetBulkUdtTemplateItem.java
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
 * Class used to create a AccountSegmentMapGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountSegmentMapGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountSegmentMapObjectKeyData ASMGetIn;
/**
 *
 * Constructor to create a  AccountSegmentMapGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountSegmentMapGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountSegmentMapObjectKeyData ASMGetInIn) {
    super(id, context, "AccountSegmentMapGet");
    ASMGetIn = ASMGetInIn;
  }

  public void translateToMap() {
    if (ASMGetIn != null) {
      ASMGetIn.resetFlags(true, true);
      addInput("AccountSegmentMap", AccountSegmentMapObjectKeyHelper.toMap(ASMGetIn, new HashMap(), "AccountSegmentMapObjectKeyData").get("AccountSegmentMapObjectKeyData"));
    }
  }


/**
 *
 * Sets the AccountSegmentMap
 * @param ASMGetInIn Value of the ASMGetIn
 *
 */

  public void setAccountSegmentMap(AccountSegmentMapObjectKeyData ASMGetInIn) {
    ASMGetIn = ASMGetInIn;
  }

  public void translateFromMap() {
    ASMGetIn = AccountSegmentMapObjectKeyHelper.fromMap(inputMap, "AccountSegmentMap");
  }

/**
 *
 * Gets the AccountSegmentMap
 * @return Value of the AccountSegmentMap
 *
 */

  public AccountSegmentMapObjectKeyData getAccountSegmentMap( ) {
    return ASMGetIn;
  }

}
