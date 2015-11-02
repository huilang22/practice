/*
 * Generated code DO NOT EDIT
 * Generated file: AccountSegmentMapCreateBulkUdtTemplateItem.java
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
 * Class used to create a AccountSegmentMapCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountSegmentMapCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountSegmentMapObjectData ASMCreateIn;
/**
 *
 * Constructor to create a  AccountSegmentMapCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountSegmentMapCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountSegmentMapObjectData ASMCreateInIn) {
    super(id, context, "AccountSegmentMapCreate");
    ASMCreateIn = ASMCreateInIn;
  }

  public void translateToMap() {
    if (ASMCreateIn != null) {
      ASMCreateIn.resetFlags(true, true);
      addInput("AccountSegmentMap", AccountSegmentMapObjectHelper.toMap(ASMCreateIn, new HashMap(), "AccountSegmentMap").get("AccountSegmentMap"));
    }
  }


/**
 *
 * Sets the AccountSegmentMap
 * @param ASMCreateInIn Value of the ASMCreateIn
 *
 */

  public void setAccountSegmentMap(AccountSegmentMapObjectData ASMCreateInIn) {
    ASMCreateIn = ASMCreateInIn;
  }

  public void translateFromMap() {
    ASMCreateIn = AccountSegmentMapObjectHelper.fromMap(inputMap, "AccountSegmentMap");
  }

/**
 *
 * Gets the AccountSegmentMap
 * @return Value of the AccountSegmentMap
 *
 */

  public AccountSegmentMapObjectData getAccountSegmentMap( ) {
    return ASMCreateIn;
  }

}
