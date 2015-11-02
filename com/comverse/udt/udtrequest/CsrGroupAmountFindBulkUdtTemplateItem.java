/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupAmountFindBulkUdtTemplateItem.java
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
 * Class used to create a CsrGroupAmountFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CsrGroupAmountFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CsrGroupAmountObjectFilter GAFindIn;
/**
 *
 * Constructor to create a  CsrGroupAmountFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CsrGroupAmountFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CsrGroupAmountObjectFilter GAFindInIn) {
    super(id, context, "CsrGroupAmountFind");
    GAFindIn = GAFindInIn;
  }

  public void translateToMap() {
    if (GAFindIn != null) {
      Integer index =  GAFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CsrGroupAmount", CsrGroupAmountObjectHelper.toMap(GAFindIn, new HashMap(), "CsrGroupAmount").get("CsrGroupAmount"));
    }
  }


/**
 *
 * Sets the CsrGroupAmount
 * @param GAFindInIn Value of the GAFindIn
 *
 */

  public void setCsrGroupAmount(CsrGroupAmountObjectFilter GAFindInIn) {
    GAFindIn = GAFindInIn;
  }

  public void translateFromMap() {
    GAFindIn = CsrGroupAmountObjectHelper.fromMapFilter(inputMap, "CsrGroupAmount");
  }

/**
 *
 * Gets the CsrGroupAmount
 * @return Value of the CsrGroupAmount
 *
 */

  public CsrGroupAmountObjectFilter getCsrGroupAmount( ) {
    return GAFindIn;
  }

}
