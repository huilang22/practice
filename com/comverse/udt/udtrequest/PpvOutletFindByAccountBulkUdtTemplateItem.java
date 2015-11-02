/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PpvOutletFindByAccountBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;
import com.csgsystems.ctc.data.*;
import com.csgsystems.om.data.*;
import com.csgsystems.ppv.data.*;

/**
 *
 * Class used to create a PpvOutletFindByAccountBulkUdtTemplateItem Bulk Template
 *
 */

public class PpvOutletFindByAccountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PpvAccountObjectData AccountIn;
/**
 *
 * Constructor to create a  PpvOutletFindByAccountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PpvOutletFindByAccountBulkUdtTemplateItem(String id, BSDMSessionContext context, PpvAccountObjectData AccountInIn) {
    super(id, context, "PpvOutletFindByAccount");
    AccountIn = AccountInIn;
  }

  public void translateToMap() {
    if (AccountIn != null) {
      AccountIn.resetFlags(true, true);
      addInput("AccountIn", PpvAccountObjectHelper.toMap(AccountIn, new HashMap(), "AccountOut").get("AccountOut"));
    }
  }


/**
 *
 * Sets the AccountIn
 * @param AccountInIn Value of the AccountIn
 *
 */

  public void setAccountIn(PpvAccountObjectData AccountInIn) {
    AccountIn = AccountInIn;
  }

  public void translateFromMap() {
    AccountIn = PpvAccountObjectHelper.fromMap(inputMap, "AccountIn");
  }

/**
 *
 * Gets the AccountIn
 * @return Value of the AccountIn
 *
 */

  public PpvAccountObjectData getAccountIn( ) {
    return AccountIn;
  }

}
