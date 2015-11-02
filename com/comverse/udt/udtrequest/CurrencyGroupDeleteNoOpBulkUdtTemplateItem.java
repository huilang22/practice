/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CurrencyGroupDeleteNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a CurrencyGroupDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CurrencyGroupDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CurrencyGroupObjectData noOpIn;

/**
 *
 * Constructor to create a   CurrencyGroupDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CurrencyGroupDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CurrencyGroupObjectData noOpInIn) {
    super(id, context, "CurrencyGroupDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CurrencyGroup", CurrencyGroupObjectHelper.toMap(noOpIn, new HashMap(), "CurrencyGroup").get("CurrencyGroup"));
    }
  }
/**
 *
 * Sets the  CurrencyGroup
 * @param noOpInIn CurrencyGroupObjectData to set
 *
 */
  public void setCurrencyGroup(CurrencyGroupObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CurrencyGroup passed into the constructor
 * @return Simulated response
 *
 */
  public CurrencyGroupObjectData getCurrencyGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CurrencyGroupObjectHelper.fromMap(inputMap, "CurrencyGroup");
  }
}
