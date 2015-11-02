/*
 * Generated code DO NOT EDIT
 * Generated file: AccountSegmentMapFindBulkUdtTemplateItem.java
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
 * Class used to create a AccountSegmentMapFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountSegmentMapFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountSegmentMapObjectFilter ASMFindIn;
/**
 *
 * Constructor to create a  AccountSegmentMapFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountSegmentMapFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountSegmentMapObjectFilter ASMFindInIn) {
    super(id, context, "AccountSegmentMapFind");
    ASMFindIn = ASMFindInIn;
  }

  public void translateToMap() {
    if (ASMFindIn != null) {
      Integer index =  ASMFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountSegmentMap", AccountSegmentMapObjectHelper.toMap(ASMFindIn, new HashMap(), "AccountSegmentMap").get("AccountSegmentMap"));
    }
  }


/**
 *
 * Sets the AccountSegmentMap
 * @param ASMFindInIn Value of the ASMFindIn
 *
 */

  public void setAccountSegmentMap(AccountSegmentMapObjectFilter ASMFindInIn) {
    ASMFindIn = ASMFindInIn;
  }

  public void translateFromMap() {
    ASMFindIn = AccountSegmentMapObjectHelper.fromMapFilter(inputMap, "AccountSegmentMap");
  }

/**
 *
 * Gets the AccountSegmentMap
 * @return Value of the AccountSegmentMap
 *
 */

  public AccountSegmentMapObjectFilter getAccountSegmentMap( ) {
    return ASMFindIn;
  }

}
