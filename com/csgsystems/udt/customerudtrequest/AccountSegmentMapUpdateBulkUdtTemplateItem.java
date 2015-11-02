/*
 * Generated code DO NOT EDIT
 * Generated file: AccountSegmentMapUpdateBulkUdtTemplateItem.java
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
 * Class used to create a AccountSegmentMapUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountSegmentMapUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountSegmentMapObjectData ASMUpdateIn;
/**
 *
 * Constructor to create a  AccountSegmentMapUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountSegmentMapUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountSegmentMapObjectData ASMUpdateInIn) {
    super(id, context, "AccountSegmentMapUpdate");
    ASMUpdateIn = ASMUpdateInIn;
  }

  public void translateToMap() {
    if (ASMUpdateIn != null) {
      ASMUpdateIn.resetFlags(true, true);
      addInput("AccountSegmentMap", AccountSegmentMapObjectHelper.toMap(ASMUpdateIn, new HashMap(), "AccountSegmentMap").get("AccountSegmentMap"));
    }
  }


/**
 *
 * Sets the AccountSegmentMap
 * @param ASMUpdateInIn Value of the ASMUpdateIn
 *
 */

  public void setAccountSegmentMap(AccountSegmentMapObjectData ASMUpdateInIn) {
    ASMUpdateIn = ASMUpdateInIn;
  }

  public void translateFromMap() {
    ASMUpdateIn = AccountSegmentMapObjectHelper.fromMap(inputMap, "AccountSegmentMap");
  }

/**
 *
 * Gets the AccountSegmentMap
 * @return Value of the AccountSegmentMap
 *
 */

  public AccountSegmentMapObjectData getAccountSegmentMap( ) {
    return ASMUpdateIn;
  }

}
