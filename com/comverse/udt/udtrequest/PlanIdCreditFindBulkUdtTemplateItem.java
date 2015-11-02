/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PlanIdCreditFindBulkUdtTemplateItem.java
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
 * Class used to create a PlanIdCreditFindBulkUdtTemplateItem Bulk Template
 *
 */

public class PlanIdCreditFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PlanIdCreditObjectFilter picFindIn;
/**
 *
 * Constructor to create a  PlanIdCreditFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PlanIdCreditFindBulkUdtTemplateItem(String id, BSDMSessionContext context, PlanIdCreditObjectFilter picFindInIn) {
    super(id, context, "PlanIdCreditFind");
    picFindIn = picFindInIn;
  }

  public void translateToMap() {
    if (picFindIn != null) {
      Integer index =  picFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PlanIdCredit", PlanIdCreditObjectHelper.toMap(picFindIn, new HashMap(), "PlanIdCredit").get("PlanIdCredit"));
    }
  }


/**
 *
 * Sets the PlanIdCredit
 * @param picFindInIn Value of the picFindIn
 *
 */

  public void setPlanIdCredit(PlanIdCreditObjectFilter picFindInIn) {
    picFindIn = picFindInIn;
  }

  public void translateFromMap() {
    picFindIn = PlanIdCreditObjectHelper.fromMapFilter(inputMap, "PlanIdCredit");
  }

/**
 *
 * Gets the PlanIdCredit
 * @return Value of the PlanIdCredit
 *
 */

  public PlanIdCreditObjectFilter getPlanIdCredit( ) {
    return picFindIn;
  }

}
