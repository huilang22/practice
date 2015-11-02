/*
 * Generated code DO NOT EDIT
 * Generated file: AccountSegmentUpdateBulkUdtTemplateItem.java
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
 * Class used to create a AccountSegmentUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountSegmentUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountSegmentObjectData ASUpdateIn;
  protected AccountSegmentObjectFilter ASUpdateFilter;
/**
 *
 * Constructor to create a  AccountSegmentUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountSegmentUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountSegmentObjectData ASUpdateInIn, AccountSegmentObjectFilter ASUpdateFilterIn) {
    super(id, context, "AccountSegmentUpdate");
    ASUpdateIn = ASUpdateInIn;
    ASUpdateFilter = ASUpdateFilterIn;
  }

  public void translateToMap() {
    if (ASUpdateIn != null) {
      ASUpdateIn.resetFlags(true, true);
      addInput("AccountSegment", AccountSegmentObjectHelper.toMap(ASUpdateIn, new HashMap(), "AccountSegment").get("AccountSegment"));
    }
    if (ASUpdateFilter != null) {
      Integer index =  ASUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ASUpdateFilter", AccountSegmentObjectHelper.toMap(ASUpdateFilter, new HashMap(), "AccountSegment").get("AccountSegment"));
    }
  }


/**
 *
 * Sets the AccountSegment
 * @param ASUpdateInIn Value of the ASUpdateIn
 *
 */

  public void setAccountSegment(AccountSegmentObjectData ASUpdateInIn) {
    ASUpdateIn = ASUpdateInIn;
  }

/**
 *
 * Sets the ASUpdateFilter
 * @param ASUpdateFilterIn Value of the ASUpdateFilter
 *
 */

  public void setASUpdateFilter(AccountSegmentObjectFilter ASUpdateFilterIn) {
    ASUpdateFilter = ASUpdateFilterIn;
  }

  public void translateFromMap() {
    ASUpdateIn = AccountSegmentObjectHelper.fromMap(inputMap, "AccountSegment");
    ASUpdateFilter = AccountSegmentObjectHelper.fromMapFilter(inputMap, "ASUpdateFilter");
  }

/**
 *
 * Gets the AccountSegment
 * @return Value of the AccountSegment
 *
 */

  public AccountSegmentObjectData getAccountSegment( ) {
    return ASUpdateIn;
  }

/**
 *
 * Gets the ASUpdateFilter
 * @return Value of the ASUpdateFilter
 *
 */

  public AccountSegmentObjectFilter getASUpdateFilter( ) {
    return ASUpdateFilter;
  }

}
