/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdLocaleDeleteNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdLocaleDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdLocaleDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdLocaleObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdLocaleDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdLocaleDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdLocaleObjectData noOpInIn) {
    super(id, context, "BsdLocaleDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdLocale", BsdLocaleObjectHelper.toMap(noOpIn, new HashMap(), "BsdLocale").get("BsdLocale"));
    }
  }
/**
 *
 * Sets the  BsdLocale
 * @param noOpInIn BsdLocaleObjectData to set
 *
 */
  public void setBsdLocale(BsdLocaleObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdLocale passed into the constructor
 * @return Simulated response
 *
 */
  public BsdLocaleObjectData getBsdLocale() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdLocaleObjectHelper.fromMap(inputMap, "BsdLocale");
  }
}
