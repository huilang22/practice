/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSegmentMapFindBulkUdtTemplateItem.java
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
